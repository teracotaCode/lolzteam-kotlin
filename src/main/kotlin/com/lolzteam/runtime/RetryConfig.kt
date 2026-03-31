package com.lolzteam.runtime

/**
 * Configuration for automatic request retries.
 *
 * @property maxRetries Maximum number of retry attempts (0 = no retries).
 * @property initialDelayMs Initial delay before the first retry in milliseconds.
 * @property maxDelayMs Maximum delay between retries in milliseconds.
 * @property backoffMultiplier Multiplier applied to the delay after each retry.
 * @property retryableStatusCodes HTTP status codes that trigger a retry.
 * @property retryOnNetworkError Whether to retry on network/connection errors.
 */
data class RetryConfig(
    val maxRetries: Int = 3,
    val initialDelayMs: Long = 1000L,
    val maxDelayMs: Long = 30_000L,
    val backoffMultiplier: Double = 2.0,
    val retryableStatusCodes: Set<Int> = setOf(429, 502, 503, 504),
    val retryOnNetworkError: Boolean = true
) {
    companion object {
        /** No retries at all. */
        val NONE = RetryConfig(maxRetries = 0)

        /** Default retry config with exponential backoff. */
        val DEFAULT = RetryConfig()

        /** Aggressive retry config for critical operations. */
        val AGGRESSIVE = RetryConfig(
            maxRetries = 5,
            initialDelayMs = 500L,
            maxDelayMs = 60_000L,
            backoffMultiplier = 2.0
        )
    }

    init {
        require(maxRetries >= 0) { "maxRetries must be >= 0, got $maxRetries" }
        require(initialDelayMs > 0) { "initialDelayMs must be > 0, got $initialDelayMs" }
        require(maxDelayMs >= initialDelayMs) { "maxDelayMs must be >= initialDelayMs" }
        require(backoffMultiplier >= 1.0) { "backoffMultiplier must be >= 1.0, got $backoffMultiplier" }
    }
}
