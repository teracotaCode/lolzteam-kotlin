package com.lolzteam.runtime

import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

/**
 * Token bucket rate limiter with coroutine support.
 *
 * Suspends callers when tokens are exhausted until a token becomes available.
 */
class RateLimiter(private val config: RateLimitConfig = RateLimitConfig.DEFAULT) {

    private val mutex = Mutex()
    private var tokens: Double = config.maxTokens.toDouble()
    private var lastRefillTime: Long = System.currentTimeMillis()

    /**
     * Acquire a token, suspending if necessary until one is available.
     */
    suspend fun acquire() {
        while (true) {
            val waitTime = tryAcquire()
            if (waitTime == 0L) return
            delay(waitTime)
        }
    }

    /**
     * Try to acquire a token.
     *
     * @return 0 if a token was acquired, otherwise the estimated wait time in ms.
     */
    suspend fun tryAcquire(): Long {
        mutex.withLock {
            refill()
            return if (tokens >= 1.0) {
                tokens -= 1.0
                0L
            } else {
                // Calculate how long until a token is available
                val deficit = 1.0 - tokens
                val msPerToken = config.refillIntervalMs / config.refillRate
                (deficit * msPerToken).toLong().coerceAtLeast(1L)
            }
        }
    }

    /**
     * Get the current number of available tokens (approximate).
     */
    suspend fun availableTokens(): Double {
        mutex.withLock {
            refill()
            return tokens
        }
    }

    private fun refill() {
        val now = System.currentTimeMillis()
        val elapsed = now - lastRefillTime
        if (elapsed > 0) {
            val newTokens = (elapsed.toDouble() / config.refillIntervalMs) * config.refillRate
            tokens = (tokens + newTokens).coerceAtMost(config.maxTokens.toDouble())
            lastRefillTime = now
        }
    }
}
