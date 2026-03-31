package com.lolzteam.runtime

/**
 * Configuration for rate limiting using a token bucket algorithm.
 *
 * @property maxTokens Maximum number of tokens in the bucket.
 * @property refillRate Number of tokens added per second.
 * @property refillIntervalMs Interval for token refill in milliseconds.
 */
data class RateLimitConfig(
    val maxTokens: Int = 3,
    val refillRate: Double = 3.0,
    val refillIntervalMs: Long = 1000L
) {
    companion object {
        /** Default Lolzteam API rate limit: 3 requests per second. */
        val DEFAULT = RateLimitConfig(maxTokens = 3, refillRate = 3.0)

        /** Conservative rate limit for shared tokens. */
        val CONSERVATIVE = RateLimitConfig(maxTokens = 1, refillRate = 1.0)

        /** No rate limiting. */
        val UNLIMITED = RateLimitConfig(maxTokens = Int.MAX_VALUE, refillRate = Double.MAX_VALUE)
    }

    init {
        require(maxTokens > 0) { "maxTokens must be > 0, got $maxTokens" }
        require(refillRate > 0) { "refillRate must be > 0, got $refillRate" }
        require(refillIntervalMs > 0) { "refillIntervalMs must be > 0, got $refillIntervalMs" }
    }
}
