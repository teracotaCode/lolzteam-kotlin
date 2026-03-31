package com.lolzteam.runtime

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import java.io.Closeable
import java.net.Authenticator
import java.net.PasswordAuthentication
import java.util.Base64

/**
 * Core HTTP client for Lolzteam API with authentication, rate limiting, and retry support.
 *
 * @property baseUrl The base URL for the API.
 * @property token The authentication token (Bearer).
 * @property retryConfig Configuration for automatic retries.
 * @property rateLimitConfig Configuration for rate limiting.
 * @property proxyConfig Optional proxy configuration.
 * @property timeoutMs Request timeout in milliseconds.
 */
class LolzteamHttpClient(
    @PublishedApi internal val baseUrl: String,
    private val token: String,
    private val retryConfig: RetryConfig = RetryConfig.DEFAULT,
    private val rateLimitConfig: RateLimitConfig = RateLimitConfig.DEFAULT,
    private val proxyConfig: ProxyConfig? = null,
    private val timeoutMs: Long = 30_000L
) : Closeable {

    val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        coerceInputValues = true
        encodeDefaults = false
        explicitNulls = false
    }

    @PublishedApi
    internal val rateLimiter = RateLimiter(rateLimitConfig)
    @PublishedApi
    internal val retryHandler = RetryHandler(retryConfig)

    @PublishedApi
    internal val httpClient = HttpClient(CIO) {
        engine {
            requestTimeout = timeoutMs
            if (proxyConfig != null) {
                proxy = when (proxyConfig.type) {
                    ProxyConfig.ProxyType.HTTP -> ProxyBuilder.http("http://${proxyConfig.host}:${proxyConfig.port}")
                    ProxyConfig.ProxyType.SOCKS5 -> ProxyBuilder.socks(proxyConfig.host, proxyConfig.port)
                }

                // For SOCKS5 proxy auth, set Java system authenticator
                if (proxyConfig.username != null && proxyConfig.type == ProxyConfig.ProxyType.SOCKS5) {
                    Authenticator.setDefault(object : Authenticator() {
                        override fun getPasswordAuthentication(): PasswordAuthentication {
                            return PasswordAuthentication(
                                proxyConfig.username,
                                (proxyConfig.password ?: "").toCharArray()
                            )
                        }
                    })
                }
            }
        }

        install(ContentNegotiation) {
            json(this@LolzteamHttpClient.json)
        }

        install(HttpTimeout) {
            requestTimeoutMillis = timeoutMs
            connectTimeoutMillis = 10_000L
            socketTimeoutMillis = timeoutMs
        }

        defaultRequest {
            header(HttpHeaders.Authorization, "Bearer $token")
            header(HttpHeaders.Accept, ContentType.Application.Json.toString())

            // HTTP proxy authentication
            if (proxyConfig != null && proxyConfig.username != null && proxyConfig.type == ProxyConfig.ProxyType.HTTP) {
                val credentials = Base64.getEncoder().encodeToString(
                    "${proxyConfig.username}:${proxyConfig.password ?: ""}".toByteArray()
                )
                header(HttpHeaders.ProxyAuthorization, "Basic $credentials")
            }
        }
    }

    /**
     * Execute a GET request.
     */
    suspend inline fun <reified T> get(
        path: String,
        params: Map<String, Any?> = emptyMap()
    ): T = request(HttpMethod.Get, path, params)

    /**
     * Execute a POST request.
     */
    suspend inline fun <reified T> post(
        path: String,
        params: Map<String, Any?> = emptyMap(),
        body: Map<String, Any?>? = null
    ): T = request(HttpMethod.Post, path, params, body)

    /**
     * Execute a PUT request.
     */
    suspend inline fun <reified T> put(
        path: String,
        params: Map<String, Any?> = emptyMap(),
        body: Map<String, Any?>? = null
    ): T = request(HttpMethod.Put, path, params, body)

    /**
     * Execute a DELETE request.
     */
    suspend inline fun <reified T> delete(
        path: String,
        params: Map<String, Any?> = emptyMap(),
        body: Map<String, Any?>? = null
    ): T = request(HttpMethod.Delete, path, params, body)

    /**
     * Execute a multipart POST request (for file uploads).
     *
     * @param path The URL path.
     * @param textParts Text form fields (name -> value).
     * @param binaryParts Binary form fields (name -> Pair(filename, bytes)).
     */
    suspend inline fun <reified T> postMultipart(
        path: String,
        textParts: Map<String, Any?> = emptyMap(),
        binaryParts: Map<String, Pair<String, ByteArray>> = emptyMap()
    ): T {
        return retryHandler.execute { attempt ->
            rateLimiter.acquire()

            val response: HttpResponse
            try {
                response = httpClient.request {
                    this.method = HttpMethod.Post
                    url("${baseUrl.trimEnd('/')}/${path.trimStart('/')}")
                    setBody(MultiPartFormDataContent(formData {
                        textParts.forEach { (key, value) ->
                            if (value != null) {
                                when (value) {
                                    is Boolean -> append(key, if (value) "1" else "0")
                                    is List<*> -> value.forEach { v ->
                                        if (v != null) {
                                            when (v) {
                                                is Boolean -> append(key, if (v) "1" else "0")
                                                else -> append(key, v.toString())
                                            }
                                        }
                                    }
                                    else -> append(key, value.toString())
                                }
                            }
                        }
                        binaryParts.forEach { (key, pair) ->
                            val (filename, bytes) = pair
                            append(key, bytes, Headers.build {
                                append(HttpHeaders.ContentType, ContentType.Application.OctetStream.toString())
                                append(HttpHeaders.ContentDisposition, "filename=\"$filename\"")
                            })
                        }
                    }))
                }
            } catch (e: io.ktor.client.network.sockets.ConnectTimeoutException) {
                throw LolzteamException.TimeoutError(cause = e)
            } catch (e: io.ktor.client.plugins.HttpRequestTimeoutException) {
                throw LolzteamException.TimeoutError(cause = e)
            } catch (e: java.net.ConnectException) {
                throw LolzteamException.NetworkError(cause = e)
            } catch (e: java.io.IOException) {
                throw LolzteamException.NetworkError(cause = e)
            }

            val statusCode = response.status.value
            val bodyText = response.bodyAsText()

            when (statusCode) {
                in 200..299 -> {
                    try {
                        if (T::class == String::class) @Suppress("UNCHECKED_CAST") (bodyText as T) else json.decodeFromString<T>(bodyText)
                    } catch (e: Exception) {
                        throw LolzteamException.DeserializationError(rawBody = bodyText, cause = e)
                    }
                }
                401, 403 -> throw LolzteamException.AuthError(statusCode, bodyText)
                429 -> {
                    val retryAfter = response.headers["Retry-After"]?.toLongOrNull()?.times(1000)
                    throw LolzteamException.RateLimitError(retryAfterMs = retryAfter)
                }
                in 500..599 -> throw LolzteamException.ServerError(
                    statusCode = statusCode,
                    body = bodyText,
                    attempts = attempt + 1
                )
                else -> throw LolzteamException.HttpError(statusCode, bodyText)
            }
        }
    }

    /**
     * Execute an HTTP request with retry and rate limiting.
     */
    /**
     * Execute a POST request with a raw JSON body (e.g. JSON array for batch).
     */
    suspend inline fun <reified T> postJsonRaw(
        path: String,
        params: Map<String, Any?> = emptyMap(),
        jsonBody: Any? = null
    ): T {
        return retryHandler.execute { attempt ->
            rateLimiter.acquire()

            val response: HttpResponse
            try {
                response = httpClient.request {
                    this.method = HttpMethod.Post
                    url("${baseUrl.trimEnd('/')}/${path.trimStart('/')}")
                    params.forEach { (key, value) ->
                        if (value != null) parameter(key, value.toString())
                    }
                    if (jsonBody != null) {
                        contentType(ContentType.Application.Json)
                        setBody(jsonBody)
                    }
                }
            } catch (e: io.ktor.client.network.sockets.ConnectTimeoutException) {
                throw LolzteamException.TimeoutError(cause = e)
            } catch (e: io.ktor.client.plugins.HttpRequestTimeoutException) {
                throw LolzteamException.TimeoutError(cause = e)
            } catch (e: java.net.ConnectException) {
                throw LolzteamException.NetworkError(cause = e)
            } catch (e: java.io.IOException) {
                throw LolzteamException.NetworkError(cause = e)
            }

            val statusCode = response.status.value
            val bodyText = response.bodyAsText()

            when (statusCode) {
                in 200..299 -> {
                    try {
                        if (T::class == String::class) @Suppress("UNCHECKED_CAST") (bodyText as T) else json.decodeFromString<T>(bodyText)
                    } catch (e: Exception) {
                        throw LolzteamException.DeserializationError(rawBody = bodyText, cause = e)
                    }
                }
                401, 403 -> throw LolzteamException.AuthError(statusCode, bodyText)
                429 -> {
                    val retryAfter = response.headers["Retry-After"]?.toLongOrNull()?.times(1000)
                    throw LolzteamException.RateLimitError(retryAfterMs = retryAfter)
                }
                in 500..599 -> throw LolzteamException.ServerError(
                    statusCode = statusCode,
                    body = bodyText,
                    attempts = attempt + 1
                )
                else -> throw LolzteamException.HttpError(statusCode, bodyText)
            }
        }
    }

    suspend inline fun <reified T> request(
        method: HttpMethod,
        path: String,
        queryParams: Map<String, Any?> = emptyMap(),
        body: Map<String, Any?>? = null
    ): T {
        return retryHandler.execute { attempt ->
            rateLimiter.acquire()

            val response: HttpResponse
            try {
                response = httpClient.request {
                    this.method = method
                    url("${baseUrl.trimEnd('/')}/${path.trimStart('/')}")

                    // Add query parameters
                    queryParams.forEach { (key, value) ->
                        if (value != null) {
                            when (value) {
                                is Boolean -> parameter(key, if (value) "1" else "0")
                                is List<*> -> value.forEach { v ->
                                    if (v != null) {
                                        when (v) {
                                            is Boolean -> parameter(key, if (v) "1" else "0")
                                            else -> parameter(key, v.toString())
                                        }
                                    }
                                }
                                else -> parameter(key, value.toString())
                            }
                        }
                    }

                    // Add body as form-urlencoded
                    if (body != null) {
                        val filtered = body.filterValues { it != null }
                        if (filtered.isNotEmpty()) {
                            setBody(FormDataContent(Parameters.build {
                                filtered.forEach { (key, value) ->
                                    when (value) {
                                        is Boolean -> append(key, if (value) "1" else "0")
                                        is List<*> -> value.forEach { v ->
                                            if (v != null) {
                                                when (v) {
                                                    is Boolean -> append(key, if (v) "1" else "0")
                                                    else -> append(key, v.toString())
                                                }
                                            }
                                        }
                                        is Map<*, *> -> {
                                            // deepObject style: key[subkey]=value
                                            @Suppress("UNCHECKED_CAST")
                                            (value as Map<String, Any?>).forEach { (subKey, subVal) ->
                                                if (subVal != null) {
                                                    append("$key[$subKey]", subVal.toString())
                                                }
                                            }
                                        }
                                        null -> {} // skip
                                        else -> append(key, value.toString())
                                    }
                                }
                            }))
                        }
                    }
                }
            } catch (e: io.ktor.client.network.sockets.ConnectTimeoutException) {
                throw LolzteamException.TimeoutError(cause = e)
            } catch (e: io.ktor.client.plugins.HttpRequestTimeoutException) {
                throw LolzteamException.TimeoutError(cause = e)
            } catch (e: java.net.ConnectException) {
                throw LolzteamException.NetworkError(cause = e)
            } catch (e: java.io.IOException) {
                throw LolzteamException.NetworkError(cause = e)
            }

            val statusCode = response.status.value
            val bodyText = response.bodyAsText()

            when (statusCode) {
                in 200..299 -> {
                    try {
                        if (T::class == String::class) @Suppress("UNCHECKED_CAST") (bodyText as T) else json.decodeFromString<T>(bodyText)
                    } catch (e: Exception) {
                        throw LolzteamException.DeserializationError(rawBody = bodyText, cause = e)
                    }
                }
                401, 403 -> throw LolzteamException.AuthError(statusCode, bodyText)
                429 -> {
                    val retryAfter = response.headers["Retry-After"]?.toLongOrNull()?.times(1000)
                    throw LolzteamException.RateLimitError(retryAfterMs = retryAfter)
                }
                in 500..599 -> throw LolzteamException.ServerError(
                    statusCode = statusCode,
                    body = bodyText,
                    attempts = attempt + 1
                )
                else -> throw LolzteamException.HttpError(statusCode, bodyText)
            }
        }
    }

    override fun close() {
        httpClient.close()
    }
}
