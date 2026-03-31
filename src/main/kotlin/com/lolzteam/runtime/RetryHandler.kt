package com.lolzteam.runtime

import kotlinx.coroutines.delay
import kotlin.math.min
import kotlin.random.Random

/**
 * Handles retry logic with exponential backoff for failed HTTP requests.
 */
class RetryHandler(private val config: RetryConfig = RetryConfig.DEFAULT) {

    /**
     * Execute a block with retry logic.
     *
     * @param block The suspending block to execute. Receives the attempt number (0-based).
     * @return The result of the block.
     * @throws LolzteamException if all retries are exhausted.
     */
    suspend fun <T> execute(block: suspend (attempt: Int) -> T): T {
        var lastException: Exception? = null

        for (attempt in 0..config.maxRetries) {
            try {
                return block(attempt)
            } catch (e: LolzteamException.RateLimitError) {
                lastException = e
                if (attempt >= config.maxRetries) break
                val waitMs = e.retryAfterMs ?: calculateDelay(attempt)
                delay(waitMs)
            } catch (e: LolzteamException.ServerError) {
                lastException = e
                if (attempt >= config.maxRetries) break
                if (e.statusCode !in config.retryableStatusCodes) throw e
                delay(calculateDelay(attempt))
            } catch (e: LolzteamException.NetworkError) {
                lastException = e
                if (attempt >= config.maxRetries) break
                if (!config.retryOnNetworkError) throw e
                delay(calculateDelay(attempt))
            } catch (e: LolzteamException.HttpError) {
                lastException = e
                if (attempt >= config.maxRetries) break
                if (e.statusCode !in config.retryableStatusCodes) throw e
                delay(calculateDelay(attempt))
            }
        }

        throw lastException ?: LolzteamException.NetworkError("All retry attempts exhausted")
    }

    /**
     * Calculate delay for a given attempt using exponential backoff with jitter.
     */
    fun calculateDelay(attempt: Int): Long {
        val baseDelay = config.initialDelayMs * Math.pow(config.backoffMultiplier, attempt.toDouble()).toLong()
        val jitter = (Random.nextDouble() * 0.5 - 0.25) * baseDelay  // ±25%
        val delay = (baseDelay + jitter).toLong().coerceIn(0, config.maxDelayMs)
        return delay
    }
}
