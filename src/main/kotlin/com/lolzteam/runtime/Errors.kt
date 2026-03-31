package com.lolzteam.runtime

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * Sealed hierarchy for all API errors.
 */
sealed class LolzteamException(
    override val message: String,
    override val cause: Throwable? = null
) : Exception(message, cause) {

    /** HTTP error with status code and optional body. */
    class HttpError(
        val statusCode: Int,
        val body: String?,
        message: String = "HTTP $statusCode: ${body?.take(200) ?: "No body"}",
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Rate-limited (429). */
    class RateLimitError(
        val retryAfterMs: Long?,
        message: String = "Rate limited" + (retryAfterMs?.let { ", retry after ${it}ms" } ?: ""),
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Server errors (502, 503, 504) after all retries exhausted. */
    class ServerError(
        val statusCode: Int,
        val body: String?,
        val attempts: Int,
        message: String = "Server error $statusCode after $attempts attempts",
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Authentication failure (401, 403). */
    class AuthError(
        val statusCode: Int,
        val body: String?,
        message: String = "Authentication error $statusCode: ${body?.take(200) ?: "No body"}",
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Network / connection error. */
    class NetworkError(
        message: String = "Network error",
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Deserialization error. */
    class DeserializationError(
        val rawBody: String?,
        message: String = "Failed to deserialize response",
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Timeout error. */
    class TimeoutError(
        message: String = "Request timed out",
        cause: Throwable? = null
    ) : LolzteamException(message, cause)

    /** Validation error for bad request parameters. */
    class ValidationError(
        val field: String?,
        message: String = "Validation error" + (field?.let { " on field '$it'" } ?: ""),
        cause: Throwable? = null
    ) : LolzteamException(message, cause)
}

/** Standard error response from the API. */
@Serializable
data class ApiErrorResponse(
    @SerialName("error")
    val error: String? = null,
    @SerialName("error_description")
    val errorDescription: String? = null,
    @SerialName("errors")
    val errors: List<ApiFieldError>? = null
)

@Serializable
data class ApiFieldError(
    @SerialName("field")
    val field: String? = null,
    @SerialName("message")
    val message: String? = null,
    @SerialName("code")
    val code: String? = null
)
