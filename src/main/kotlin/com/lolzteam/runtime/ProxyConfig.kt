package com.lolzteam.runtime

import io.ktor.client.engine.*
import io.ktor.http.*
import java.net.URI

/**
 * Proxy configuration for API requests.
 *
 * @property type Proxy protocol type.
 * @property host Proxy hostname.
 * @property port Proxy port.
 * @property username Optional proxy username for authentication.
 * @property password Optional proxy password for authentication.
 */
data class ProxyConfig(
    val type: ProxyType = ProxyType.HTTP,
    val host: String,
    val port: Int,
    val username: String? = null,
    val password: String? = null
) {
    enum class ProxyType {
        HTTP, SOCKS5
    }

    init {
        require(host.isNotBlank()) { "Proxy host must not be blank" }
        require(port in 1..65535) { "Proxy port must be between 1 and 65535, got $port" }
        require((username == null) == (password == null)) {
            "Both username and password must be provided together, or neither"
        }
    }

    /**
     * Build Ktor proxy configuration.
     */
    fun toKtorProxy(): ProxyBuilder.() -> Unit = {
        when (type) {
            ProxyType.HTTP -> http("http://$host:$port")
            ProxyType.SOCKS5 -> socks(host, port)
        }
    }

    /**
     * Build proxy URL string for Ktor.
     */
    fun toUrl(): String = when (type) {
        ProxyType.HTTP -> {
            if (username != null && password != null) {
                "http://$username:$password@$host:$port"
            } else {
                "http://$host:$port"
            }
        }
        ProxyType.SOCKS5 -> {
            if (username != null && password != null) {
                "socks5://$username:$password@$host:$port"
            } else {
                "socks5://$host:$port"
            }
        }
    }

    companion object {
        /**
         * Parse a proxy URL string into a ProxyConfig.
         *
         * Supported formats:
         * - `http://host:port`
         * - `http://user:pass@host:port`
         * - `socks5://host:port`
         * - `socks5://user:pass@host:port`
         */
        fun fromUrl(url: String): ProxyConfig {
            val parsed = URI(url.replace("socks5://", "http://"))
            val type = if (url.startsWith("socks5://")) ProxyType.SOCKS5 else ProxyType.HTTP
            val userInfo = parsed.userInfo?.split(":", limit = 2)
            return ProxyConfig(
                type = type,
                host = parsed.host,
                port = parsed.port,
                username = userInfo?.getOrNull(0),
                password = userInfo?.getOrNull(1)
            )
        }
    }
}
