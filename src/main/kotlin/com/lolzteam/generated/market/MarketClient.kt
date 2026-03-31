package com.lolzteam.generated.market

import com.lolzteam.runtime.*
import com.lolzteam.generated.market.models.*
import kotlinx.serialization.json.JsonElement
import java.io.Closeable

/**
 * Market API client for Lolzteam.
 *
 * Base URL: https://prod-api.lzt.market
 */
class MarketClient(
    private val token: String,
    private val baseUrl: String = "https://prod-api.lzt.market",
    private val retryConfig: RetryConfig = RetryConfig.DEFAULT,
    private val rateLimitConfig: RateLimitConfig = RateLimitConfig.DEFAULT,
    private val proxyConfig: ProxyConfig? = null,
    private val timeoutMs: Long = 30_000L
) : Closeable {

    private val client = LolzteamHttpClient(
        baseUrl = baseUrl,
        token = token,
        retryConfig = retryConfig,
        rateLimitConfig = rateLimitConfig,
        proxyConfig = proxyConfig,
        timeoutMs = timeoutMs
    )

    /** Account publishing API endpoints. */
    val accountPublishing = AccountPublishingService(client)

    /** Account purchasing API endpoints. */
    val accountPurchasing = AccountPurchasingService(client)

    /** Accounts list API endpoints. */
    val accountsList = AccountsListService(client)

    /** Accounts managing API endpoints. */
    val accountsManaging = AccountsManagingService(client)

    /** Batch requests API endpoints. */
    val batchRequests = BatchRequestsService(client)

    /** Cart API endpoints. */
    val cart = CartService(client)

    /** Categories API endpoints. */
    val categories = CategoriesService(client)

    /** Category Search API endpoints. */
    val categorySearch = CategorySearchService(client)

    /** Custom Discounts API endpoints. */
    val customDiscounts = CustomDiscountsService(client)

    /** IMAP API endpoints. */
    val iMAP = IMAPService(client)

    /** Invoices API endpoints. */
    val invoices = InvoicesService(client)

    /** Payments API endpoints. */
    val payments = PaymentsService(client)

    /** Profile API endpoints. */
    val profile = ProfileService(client)

    /** Proxy API endpoints. */
    val proxy = ProxyService(client)

    override fun close() {
        client.close()
    }
}

/**
 * Account publishing API service.
 */
class AccountPublishingService(private val client: LolzteamHttpClient) {

    /**
     * Fast Account Upload
     *
     * `POST /item/fast-sell`
     */
    suspend fun fastSell(
        price: Double,
        categoryId: CategoryId,
        currency: Currency,
        itemOrigin: OriginItem2,
        title: String? = null,
        titleEn: String? = null,
        extendedGuarantee: Eg? = null,
        allowAskDiscount: Boolean? = null,
        proxyId: Long? = null,
        randomProxy: Boolean? = null,
        description: String? = null,
        information: String? = null,
        login: String? = null,
        password: String? = null,
        loginPassword: String? = null,
        hasEmailLoginData: Boolean? = null,
        emailLoginData: String? = null,
        emailType: EmailType? = null,
        extra: PublishingFastSellExtra? = null
    ): PublishingFastSellResponse {
        return client.post(
            path = "/item/fast-sell",
            body = mapOf(
            "title" to title,
            "title_en" to titleEn,
            "price" to price,
            "category_id" to categoryId,
            "currency" to currency,
            "item_origin" to itemOrigin,
            "extended_guarantee" to extendedGuarantee,
            "allow_ask_discount" to allowAskDiscount,
            "proxy_id" to proxyId,
            "random_proxy" to randomProxy,
            "description" to description,
            "information" to information,
            "login" to login,
            "password" to password,
            "login_password" to loginPassword,
            "has_email_login_data" to hasEmailLoginData,
            "email_login_data" to emailLoginData,
            "email_type" to emailType,
            "extra" to extra
            )
        )
    }

    /**
     * Add Account
     *
     * `POST /item/add`
     */
    suspend fun add(
        price: Double,
        categoryId: CategoryId,
        currency: Currency,
        itemOrigin: OriginItem2,
        title: String? = null,
        titleEn: String? = null,
        extendedGuarantee: Eg? = null,
        description: String? = null,
        information: String? = null,
        forceTempEmail: Boolean? = null,
        resellItemId: Long? = null,
        hasEmailLoginData: Boolean? = null,
        emailLoginData: String? = null,
        emailType: EmailType? = null,
        allowAskDiscount: Boolean? = null,
        proxyId: Long? = null,
        randomProxy: Boolean? = null
    ): ManagingSteamUpdateValueResponse {
        return client.post(
            path = "/item/add",
            body = mapOf(
            "title" to title,
            "title_en" to titleEn,
            "price" to price,
            "category_id" to categoryId,
            "currency" to currency,
            "item_origin" to itemOrigin,
            "extended_guarantee" to extendedGuarantee,
            "description" to description,
            "information" to information,
            "forceTempEmail" to forceTempEmail,
            "resell_item_id" to resellItemId,
            "has_email_login_data" to hasEmailLoginData,
            "email_login_data" to emailLoginData,
            "email_type" to emailType,
            "allow_ask_discount" to allowAskDiscount,
            "proxy_id" to proxyId,
            "random_proxy" to randomProxy
            )
        )
    }

    /**
     * Check Account Details
     *
     * `POST /{item_id}/goods/check`
     */
    suspend fun check(
        itemId: Long,
        resellItemId: Long? = null,
        randomProxy: Boolean? = null,
        login: String? = null,
        password: String? = null,
        loginPassword: String? = null,
        hasEmailLoginData: Boolean? = null,
        emailLoginData: String? = null,
        emailType: EmailType? = null,
        extra: PublishingFastSellExtra? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/goods/check",
            body = mapOf(
            "resell_item_id" to resellItemId,
            "random_proxy" to randomProxy,
            "login" to login,
            "password" to password,
            "login_password" to loginPassword,
            "has_email_login_data" to hasEmailLoginData,
            "email_login_data" to emailLoginData,
            "email_type" to emailType,
            "extra" to extra
            )
        )
    }

    /**
     * Add an External Account
     *
     * `POST /{item_id}/external-account`
     */
    suspend fun external(
        itemId: Long,
        `type`: Type5,
        login: String? = null,
        emailLoginData: String? = null,
        cookies: String? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/external-account",
            body = mapOf(
            "type" to `type`,
            "login" to login,
            "email_login_data" to emailLoginData,
            "cookies" to cookies
            )
        )
    }

}

/**
 * Account purchasing API service.
 */
class AccountPurchasingService(private val client: LolzteamHttpClient) {

    /**
     * Fast Buy Account
     *
     * `POST /{item_id}/fast-buy`
     */
    suspend fun fastBuy(
        itemId: Long,
        price: Double? = null,
        balanceId: Long? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/fast-buy",
            body = mapOf(
            "price" to price,
            "balance_id" to balanceId
            )
        )
    }

    /**
     * Check Account
     *
     * `POST /{item_id}/check-account`
     */
    suspend fun check(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/check-account")
    }

    /**
     * Confirm Buy
     *
     * `POST /{item_id}/confirm-buy`
     */
    suspend fun confirm(
        itemId: Long,
        price: Long? = null,
        balanceId: Long? = null
    ): PurchasingConfirmResponse {
        return client.post(
            path = "/${itemId}/confirm-buy",
            body = mapOf(
            "price" to price,
            "balance_id" to balanceId
            )
        )
    }

    /**
     * Discount Request
     *
     * `POST /{item_id}/discount`
     */
    suspend fun discountRequest(
        itemId: Long,
        discountPrice: Double,
        message: String? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/discount",
            body = mapOf(
            "discount_price" to discountPrice,
            "message" to message
            )
        )
    }

    /**
     * Cancel Discount Request
     *
     * `DELETE /{item_id}/discount`
     */
    suspend fun discountCancel(
        itemId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/${itemId}/discount")
    }

}

/**
 * Accounts list API service.
 */
class AccountsListService(private val client: LolzteamHttpClient) {

    /**
     * Get All User Accounts
     *
     * `GET /user/items`
     */
    suspend fun user(
        userId: Long? = null,
        categoryId: CategoryId? = null,
        page: Long? = null,
        show: Show? = null,
        deleteReason: String? = null,
        title: String? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        login: String? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        orderBy: OrderBy? = null,
        sb: Boolean? = null,
        sbByMe: Boolean? = null,
        nsb: Boolean? = null,
        nsbByMe: Boolean? = null,
        username: String? = null,
        publishedStartDate: String? = null,
        publishedEndDate: String? = null,
        filterByPublishedDate: Boolean? = null,
        paidStartDate: String? = null,
        paidEndDate: String? = null,
        filterByBuyerOperationDate: Boolean? = null,
        deleteStartDate: String? = null,
        deleteEndDate: String? = null,
        filterByDeleteDate: Boolean? = null
    ): ListUserResponse {
        return client.get(
            path = "/user/items",
            params = mapOf(
            "user_id" to userId,
            "category_id" to categoryId,
            "page" to page,
            "show" to show,
            "delete_reason" to deleteReason,
            "title" to title,
            "pmin" to pmin,
            "pmax" to pmax,
            "login" to login,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "order_by" to orderBy,
            "sb" to sb,
            "sb_by_me" to sbByMe,
            "nsb" to nsb,
            "nsb_by_me" to nsbByMe,
            "username" to username,
            "published_startDate" to publishedStartDate,
            "published_endDate" to publishedEndDate,
            "filter_by_published_date" to filterByPublishedDate,
            "paid_startDate" to paidStartDate,
            "paid_endDate" to paidEndDate,
            "filter_by_buyer_operation_date" to filterByBuyerOperationDate,
            "delete_startDate" to deleteStartDate,
            "delete_endDate" to deleteEndDate,
            "filter_by_delete_date" to filterByDeleteDate
            )
        )
    }

    /**
     * Get All Purchased Accounts
     *
     * `GET /user/orders`
     */
    suspend fun orders(
        userId: Long? = null,
        categoryId: CategoryId? = null,
        page: Long? = null,
        show: Show? = null,
        title: String? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        login: String? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        orderBy: OrderBy? = null,
        sb: Boolean? = null,
        sbByMe: Boolean? = null,
        nsb: Boolean? = null,
        nsbByMe: Boolean? = null
    ): ListUserResponse {
        return client.get(
            path = "/user/orders",
            params = mapOf(
            "user_id" to userId,
            "category_id" to categoryId,
            "page" to page,
            "show" to show,
            "title" to title,
            "pmin" to pmin,
            "pmax" to pmax,
            "login" to login,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "order_by" to orderBy,
            "sb" to sb,
            "sb_by_me" to sbByMe,
            "nsb" to nsb,
            "nsb_by_me" to nsbByMe
            )
        )
    }

    /**
     * Get User Items States
     *
     * `GET /user/item-states`
     */
    suspend fun states(
        userId: kotlinx.serialization.json.JsonElement? = null
    ): ListStatesResponse {
        return client.get(
            path = "/user/item-states",
            params = mapOf(
            "user_id" to userId
            )
        )
    }

    /**
     * Download Accounts Data
     *
     * `GET /user/{type}/download`
     */
    suspend fun download(
        `type`: Type,
        format: Format? = null,
        customFormat: String? = null,
        categoryId: CategoryId? = null,
        page: Long? = null,
        show: Show? = null,
        deleteReason: String? = null,
        title: String? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        orderBy: OrderBy? = null,
        sb: Boolean? = null,
        sbByMe: Boolean? = null,
        nsb: Boolean? = null,
        nsbByMe: Boolean? = null,
        username: String? = null,
        publishedStartDate: String? = null,
        publishedEndDate: String? = null,
        filterByPublishedDate: Boolean? = null,
        paidStartDate: String? = null,
        paidEndDate: String? = null,
        filterByBuyerOperationDate: Boolean? = null,
        deleteStartDate: String? = null,
        deleteEndDate: String? = null,
        filterByDeleteDate: Boolean? = null
    ): String {
        return client.get(
            path = "/user/${`type`}/download",
            params = mapOf(
            "format" to format,
            "custom_format" to customFormat,
            "category_id" to categoryId,
            "page" to page,
            "show" to show,
            "delete_reason" to deleteReason,
            "title" to title,
            "pmin" to pmin,
            "pmax" to pmax,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "order_by" to orderBy,
            "sb" to sb,
            "sb_by_me" to sbByMe,
            "nsb" to nsb,
            "nsb_by_me" to nsbByMe,
            "username" to username,
            "published_startDate" to publishedStartDate,
            "published_endDate" to publishedEndDate,
            "filter_by_published_date" to filterByPublishedDate,
            "paid_startDate" to paidStartDate,
            "paid_endDate" to paidEndDate,
            "filter_by_buyer_operation_date" to filterByBuyerOperationDate,
            "delete_startDate" to deleteStartDate,
            "delete_endDate" to deleteEndDate,
            "filter_by_delete_date" to filterByDeleteDate
            )
        )
    }

    /**
     * Get All Favourites Accounts
     *
     * `GET /fave`
     */
    suspend fun favorites(
        page: Long? = null,
        show: Show? = null,
        title: String? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        orderBy: OrderBy? = null,
        sb: Boolean? = null,
        sbByMe: Boolean? = null,
        nsb: Boolean? = null,
        nsbByMe: Boolean? = null
    ): ListUserResponse {
        return client.get(
            path = "/fave",
            params = mapOf(
            "page" to page,
            "show" to show,
            "title" to title,
            "pmin" to pmin,
            "pmax" to pmax,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "order_by" to orderBy,
            "sb" to sb,
            "sb_by_me" to sbByMe,
            "nsb" to nsb,
            "nsb_by_me" to nsbByMe
            )
        )
    }

    /**
     * Get All Viewed Accounts
     *
     * `GET /viewed`
     */
    suspend fun viewed(
        page: Long? = null,
        show: Show? = null,
        title: String? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        orderBy: OrderBy? = null,
        sb: Boolean? = null,
        sbByMe: Boolean? = null,
        nsb: Boolean? = null,
        nsbByMe: Boolean? = null
    ): ListUserResponse {
        return client.get(
            path = "/viewed",
            params = mapOf(
            "page" to page,
            "show" to show,
            "title" to title,
            "pmin" to pmin,
            "pmax" to pmax,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "order_by" to orderBy,
            "sb" to sb,
            "sb_by_me" to sbByMe,
            "nsb" to nsb,
            "nsb_by_me" to nsbByMe
            )
        )
    }

}

/**
 * Accounts managing API service.
 */
class AccountsManagingService(private val client: LolzteamHttpClient) {

    /**
     * Get Account
     *
     * `GET /{item_id}`
     */
    suspend fun get(
        itemId: Long,
        parseSameItemIds: Boolean? = null
    ): ManagingGetResponse {
        return client.get(
            path = "/${itemId}",
            params = mapOf(
            "parse_same_item_ids" to parseSameItemIds
            )
        )
    }

    /**
     * Delete Account
     *
     * `DELETE /{item_id}`
     */
    suspend fun delete(
        itemId: Long,
        reason: String
    ): SaveChangesResponse {
        return client.delete(
            path = "/${itemId}",
            body = mapOf(
            "reason" to reason
            )
        )
    }

    /**
     * Get Claims
     *
     * `GET /claims`
     */
    suspend fun claims(
        `type`: Type2? = null,
        claimState: ClaimState? = null
    ): ProfileClaimsResponse {
        return client.get(
            path = "/claims",
            params = mapOf(
            "type" to `type`,
            "claim_state" to claimState
            )
        )
    }

    /**
     * Create Claim
     *
     * `POST /claims`
     */
    suspend fun createClaim(
        itemId: Long,
        postBody: String
    ): ManagingCreateClaimResponse {
        return client.post(
            path = "/claims",
            body = mapOf(
            "item_id" to itemId,
            "post_body" to postBody
            )
        )
    }

    /**
     * Bulk Get Accounts
     *
     * `POST /bulk/items`
     */
    suspend fun bulkGet(
        itemId: List<Long>? = null,
        parseSameItemIds: Boolean? = null
    ): ManagingBulkGetResponse {
        return client.post(
            path = "/bulk/items",
            body = mapOf(
            "item_id" to itemId,
            "parse_same_item_ids" to parseSameItemIds
            )
        )
    }

    /**
     * Get Account Steam Inventory Value
     *
     * `GET /{item_id}/inventory-value`
     */
    suspend fun steamInventoryValue(
        itemId: Long,
        appId: AppId? = null,
        currency: Currency? = null,
        ignoreCache: Boolean? = null
    ): ManagingSteamInventoryValueResponse {
        return client.get(
            path = "/${itemId}/inventory-value",
            params = mapOf(
            "app_id" to appId,
            "currency" to currency,
            "ignore_cache" to ignoreCache
            )
        )
    }

    /**
     * Get Steam Inventory Value
     *
     * `GET /steam-value`
     */
    suspend fun steamValue(
        link: String? = null,
        appId: AppId? = null,
        currency: Currency? = null,
        ignoreCache: Boolean? = null
    ): ManagingSteamInventoryValueResponse {
        return client.get(
            path = "/steam-value",
            params = mapOf(
            "link" to link,
            "app_id" to appId,
            "currency" to currency,
            "ignore_cache" to ignoreCache
            )
        )
    }

    /**
     * Get Steam HTML
     *
     * `GET /{item_id}/steam-preview`
     */
    suspend fun steamPreview(
        itemId: Long,
        `type`: Type3? = null
    ): String {
        return client.get(
            path = "/${itemId}/steam-preview",
            params = mapOf(
            "type" to `type`
            )
        )
    }

    /**
     * Edit Account
     *
     * `PUT /{item_id}/edit`
     */
    suspend fun edit(
        itemId: Long,
        title: String? = null,
        titleEn: String? = null,
        price: Long? = null,
        currency: Currency? = null,
        itemOrigin: ItemOrigin? = null,
        emailLoginData: String? = null,
        emailType: EmailType? = null,
        allowAskDiscount: Boolean? = null,
        proxyId: Long? = null,
        description: String? = null,
        information: String? = null
    ): SaveChangesResponse {
        return client.put(
            path = "/${itemId}/edit",
            body = mapOf(
            "title" to title,
            "title_en" to titleEn,
            "price" to price,
            "currency" to currency,
            "item_origin" to itemOrigin,
            "email_login_data" to emailLoginData,
            "email_type" to emailType,
            "allow_ask_discount" to allowAskDiscount,
            "proxy_id" to proxyId,
            "description" to description,
            "information" to information
            )
        )
    }

    /**
     * Get AI Price
     *
     * `GET /{item_id}/ai-price`
     */
    suspend fun aIPrice(
        itemId: Long
    ): ManagingAIPriceResponse {
        return client.get(path = "/${itemId}/ai-price")
    }

    /**
     * Get Auto Buy Price
     *
     * `GET /{item_id}/auto-buy-price`
     */
    suspend fun autoBuyPrice(
        itemId: Long
    ): ManagingAIPriceResponse {
        return client.get(path = "/${itemId}/auto-buy-price")
    }

    /**
     * Edit Note
     *
     * `POST /{item_id}/note-save`
     */
    suspend fun note(
        itemId: Long,
        text: String? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/note-save",
            body = mapOf(
            "text" to text
            )
        )
    }

    /**
     * Update Inventory Value
     *
     * `POST /{item_id}/update-inventory`
     */
    suspend fun steamUpdateValue(
        itemId: Long,
        all: Boolean? = null,
        appId: AppId? = null,
        authorize: Boolean? = null
    ): ManagingSteamUpdateValueResponse {
        return client.post(
            path = "/${itemId}/update-inventory",
            body = mapOf(
            "all" to all,
            "app_id" to appId,
            "authorize" to authorize
            )
        )
    }

    /**
     * Bump Account
     *
     * `POST /{item_id}/bump`
     */
    suspend fun bump(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/bump")
    }

    /**
     * Auto Bump
     *
     * `POST /{item_id}/auto-bump`
     */
    suspend fun autoBump(
        itemId: Long,
        hour: Long
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/auto-bump",
            body = mapOf(
            "hour" to hour
            )
        )
    }

    /**
     * Disable Auto Bump
     *
     * `DELETE /{item_id}/auto-bump`
     */
    suspend fun autoBumpDisable(
        itemId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/${itemId}/auto-bump")
    }

    /**
     * Open Account
     *
     * `POST /{item_id}/open`
     */
    suspend fun `open`(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/open")
    }

    /**
     * Close Account
     *
     * `POST /{item_id}/close`
     */
    suspend fun close(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/close")
    }

    /**
     * Get Account Image
     *
     * `GET /{item_id}/image`
     */
    suspend fun image(
        itemId: Long,
        `type`: Type4? = null
    ): ManagingImageResponse {
        return client.get(
            path = "/${itemId}/image",
            params = mapOf(
            "type" to `type`
            )
        )
    }

    /**
     * Get Email Confirmation Code
     *
     * `GET /{item_id}/email-code`
     */
    suspend fun emailCode(
        itemId: Long
    ): ManagingEmailCodeResponse {
        return client.get(path = "/${itemId}/email-code")
    }

    /**
     * Get Email Letters
     *
     * `GET /letters2`
     */
    suspend fun getLetters2(
        emailPassword: String? = null,
        email: String? = null,
        password: String? = null,
        limit: Long? = null
    ): ManagingGetLetters2Response {
        return client.get(
            path = "/letters2",
            params = mapOf(
            "email_password" to emailPassword,
            "email" to email,
            "password" to password,
            "limit" to limit
            )
        )
    }

    /**
     * Get Mafile
     *
     * `GET /{item_id}/mafile`
     */
    suspend fun steamGetMafile(
        itemId: Long
    ): ManagingSteamGetMafileResponse {
        return client.get(path = "/${itemId}/mafile")
    }

    /**
     * Add Mafile
     *
     * `POST /{item_id}/mafile`
     */
    suspend fun steamAddMafile(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/mafile")
    }

    /**
     * Remove Mafile
     *
     * `DELETE /{item_id}/mafile`
     */
    suspend fun steamRemoveMafile(
        itemId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/${itemId}/mafile")
    }

    /**
     * Get Mafile Confirmation Code
     *
     * `GET /{item_id}/guard-code`
     */
    suspend fun steamMafileCode(
        itemId: Long
    ): ManagingEmailCodeResponse {
        return client.get(path = "/${itemId}/guard-code")
    }

    /**
     * Confirm SDA
     *
     * `POST /{item_id}/confirm-sda`
     */
    suspend fun steamSDA(
        itemId: Long,
        id: Long? = null,
        nonce: Long? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/confirm-sda",
            body = mapOf(
            "id" to id,
            "nonce" to nonce
            )
        )
    }

    /**
     * Get Telegram Confirmation Code
     *
     * `GET /{item_id}/telegram-login-code`
     */
    suspend fun telegramCode(
        itemId: Long
    ): ManagingTelegramCodeResponse {
        return client.get(path = "/${itemId}/telegram-login-code")
    }

    /**
     * Telegram Reset Auth
     *
     * `POST /{item_id}/telegram-reset-authorizations`
     */
    suspend fun telegramResetAuth(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/telegram-reset-authorizations")
    }

    /**
     * Cancel Guarantee
     *
     * `POST /{item_id}/refuse-guarantee`
     */
    suspend fun refuseGuarantee(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/refuse-guarantee")
    }

    /**
     * Decline Video Recording Request
     *
     * `POST /{item_id}/decline-video-recording`
     */
    suspend fun declineVideoRecording(
        itemId: Long,
        iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem: Boolean
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/decline-video-recording",
            body = mapOf(
            "i_voluntarily_and_with_full_awareness_of_my_actions_waive_any_claims_regarding_this_item" to iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem
            )
        )
    }

    /**
     * Check Guarantee
     *
     * `POST /{item_id}/check-guarantee`
     */
    suspend fun checkGuarantee(
        itemId: Long
    ): ManagingCheckGuaranteeResponse {
        return client.post(path = "/${itemId}/check-guarantee")
    }

    /**
     * Change Password
     *
     * `POST /{item_id}/change-password`
     */
    suspend fun changePassword(
        itemId: Long,
        cancel: Cancel? = null
    ): ManagingChangePasswordResponse {
        return client.post(
            path = "/${itemId}/change-password",
            body = mapOf(
            "_cancel" to cancel
            )
        )
    }

    /**
     * Get Temp Email Password
     *
     * `GET /{item_id}/temp-email-password`
     */
    suspend fun tempEmailPassword(
        itemId: Long
    ): ManagingTempEmailPasswordResponse {
        return client.get(path = "/${itemId}/temp-email-password")
    }

    /**
     * Add a Tag
     *
     * `POST /{item_id}/tag`
     */
    suspend fun tag(
        itemId: Long,
        tagId: Long
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/tag",
            body = mapOf(
            "tag_id" to tagId
            )
        )
    }

    /**
     * Remove a Tag
     *
     * `DELETE /{item_id}/tag`
     */
    suspend fun untag(
        itemId: Long,
        tagId: Long
    ): SaveChangesResponse {
        return client.delete(
            path = "/${itemId}/tag",
            body = mapOf(
            "tag_id" to tagId
            )
        )
    }

    /**
     * Add a Public Tag
     *
     * `POST /{item_id}/public-tag`
     */
    suspend fun publicTag(
        itemId: Long,
        tagId: Long
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/public-tag",
            body = mapOf(
            "tag_id" to tagId
            )
        )
    }

    /**
     * Remove a Public Tag
     *
     * `DELETE /{item_id}/public-tag`
     */
    suspend fun publicUntag(
        itemId: Long,
        tagId: Long
    ): SaveChangesResponse {
        return client.delete(
            path = "/${itemId}/public-tag",
            body = mapOf(
            "tag_id" to tagId
            )
        )
    }

    /**
     * Favorite
     *
     * `POST /{item_id}/star`
     */
    suspend fun favorite(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/star")
    }

    /**
     * Unfavorite
     *
     * `DELETE /{item_id}/star`
     */
    suspend fun unfavorite(
        itemId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/${itemId}/star")
    }

    /**
     * Stick Account
     *
     * `POST /{item_id}/stick`
     */
    suspend fun stick(
        itemId: Long
    ): SaveChangesResponse {
        return client.post(path = "/${itemId}/stick")
    }

    /**
     * Unstick Account
     *
     * `DELETE /{item_id}/stick`
     */
    suspend fun unstick(
        itemId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/${itemId}/stick")
    }

    /**
     * Change Account Owner
     *
     * `POST /{item_id}/change-owner`
     */
    suspend fun transfer(
        itemId: Long,
        username: String,
        secretAnswer: String
    ): SaveChangesResponse {
        return client.post(
            path = "/${itemId}/change-owner",
            body = mapOf(
            "username" to username,
            "secret_answer" to secretAnswer
            )
        )
    }

}

/**
 * Batch requests API service.
 */
class BatchRequestsService(private val client: LolzteamHttpClient) {

    /**
     * Batch
     *
     * `POST /batch`
     */
    suspend fun batch(
        jobs: List<Map<String, Any?>>
    ): BatchResponse {
        return client.postJsonRaw(
            path = "/batch",
            jsonBody = jobs
        )
    }

}

/**
 * Cart API service.
 */
class CartService(private val client: LolzteamHttpClient) {

    /**
     * Get Cart Items
     *
     * `GET /cart`
     */
    suspend fun get(
        categoryId: CategoryId? = null,
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null
    ): SaveChangesResponse {
        return client.get(
            path = "/cart",
            params = mapOf(
            "category_id" to categoryId,
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds
            )
        )
    }

    /**
     * Add Item to Cart
     *
     * `POST /cart`
     */
    suspend fun add(
        itemId: Long
    ): CartAddResponse {
        return client.post(
            path = "/cart",
            body = mapOf(
            "item_id" to itemId
            )
        )
    }

    /**
     * Delete Item From Cart
     *
     * `DELETE /cart`
     */
    suspend fun delete(
        itemId: Long? = null
    ): CartAddResponse {
        return client.delete(
            path = "/cart",
            body = mapOf(
            "item_id" to itemId
            )
        )
    }

}

/**
 * Categories API service.
 */
class CategoriesService(private val client: LolzteamHttpClient) {

    /**
     * Get Categories
     *
     * `GET /category`
     */
    suspend fun list(
        topQueries: Boolean? = null
    ): CategoryListResponse {
        return client.get(
            path = "/category",
            params = mapOf(
            "top_queries" to topQueries
            )
        )
    }

    /**
     * Get Category Search Params
     *
     * `GET /{categoryName}/params`
     */
    suspend fun params(
        categoryName: CategoryName
    ): CategoryParamsResponse {
        return client.get(path = "/${categoryName}/params")
    }

    /**
     * Get Category Games
     *
     * `GET /{categoryName}/games`
     */
    suspend fun games(
        categoryName: CategoryName
    ): CategoryGamesResponse {
        return client.get(path = "/${categoryName}/games")
    }

}

/**
 * Category Search API service.
 */
class CategorySearchService(private val client: LolzteamHttpClient) {

    /**
     * Get Last Accounts
     *
     * `GET /`
     */
    suspend fun all(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null
    ): SaveChangesResponse {
        return client.get(
            path = "/",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds
            )
        )
    }

    /**
     * Steam
     *
     * `GET /steam`
     */
    suspend fun steam(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailType: List<EmailTypeItem>? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        itemDomain: String? = null,
        game: List<Long>? = null,
        hoursPlayed: Map<String, Long>? = null,
        hoursPlayedMax: Map<String, Long>? = null,
        eg: Eg? = null,
        vac: List<Long>? = null,
        vacSkipGameCheck: Boolean? = null,
        rt: Rt? = null,
        tradeBan: Rt? = null,
        tradeLimit: Rt? = null,
        daybreak: Long? = null,
        limit: Rt? = null,
        mafile: Rt? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        lmin: Long? = null,
        lmax: Long? = null,
        rmin: Long? = null,
        rmax: Long? = null,
        wingmanRmin: Long? = null,
        wingmanRmax: Long? = null,
        noVac: Boolean? = null,
        mmBan: Rt? = null,
        balanceMin: Long? = null,
        balanceMax: Long? = null,
        invGame: Long? = null,
        invMin: Double? = null,
        invMax: Double? = null,
        friendsMin: Long? = null,
        friendsMax: Long? = null,
        gmin: Long? = null,
        gmax: Long? = null,
        winCountMin: Long? = null,
        winCountMax: Long? = null,
        medalId: List<Int>? = null,
        medalOperatorOr: Boolean? = null,
        medalMin: Long? = null,
        medalMax: Long? = null,
        gift: List<String>? = null,
        giftMin: Long? = null,
        giftMax: Long? = null,
        recentlyHoursMin: Long? = null,
        recentlyHoursMax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        cs2ProfileRankMin: Long? = null,
        cs2ProfileRankMax: Long? = null,
        solommrMin: Long? = null,
        solommrMax: Long? = null,
        d2GameCountMin: Long? = null,
        d2GameCountMax: Long? = null,
        d2WinCountMin: Long? = null,
        d2WinCountMax: Long? = null,
        d2BehaviorMin: Long? = null,
        d2BehaviorMax: Long? = null,
        faceitLvlMin: Long? = null,
        faceitLvlMax: Long? = null,
        pointsMin: Long? = null,
        pointsMax: Long? = null,
        relevantGmin: Long? = null,
        relevantGmax: Long? = null,
        lastTransDate: Long? = null,
        lastTransDatePeriod: RegPeriod? = null,
        lastTransDateLater: Long? = null,
        lastTransDatePeriodLater: RegPeriod? = null,
        noTrans: Boolean? = null,
        trans: Boolean? = null,
        giftsPurchaseMin: Double? = null,
        giftsPurchaseMax: Double? = null,
        refundsPurchaseMin: Double? = null,
        refundsPurchaseMax: Double? = null,
        ingamePurchaseMin: Double? = null,
        ingamePurchaseMax: Double? = null,
        gamesPurchaseMin: Double? = null,
        gamesPurchaseMax: Double? = null,
        purchaseMin: Double? = null,
        purchaseMax: Double? = null,
        hasActivatedKeys: Rt? = null,
        eloMin: Long? = null,
        eloMax: Long? = null,
        cs2MapRank: Cs2MapRank? = null,
        cs2MapRmin: Long? = null,
        cs2MapRmax: Long? = null,
        hasFaceit: Rt? = null,
        faceitCsgoLvlMin: Long? = null,
        faceitCsgoLvlMax: Long? = null,
        rustDeathsMin: Long? = null,
        rustDeathsMax: Long? = null,
        rustKillsMin: Long? = null,
        rustKillsMax: Long? = null,
        d2LastMatchDate: Long? = null,
        d2LastMatchDatePeriod: RegPeriod? = null,
        cardsMin: Long? = null,
        cardsMax: Long? = null,
        cardsGamesMin: Long? = null,
        cardsGamesMax: Long? = null,
        skipVacInv: Boolean? = null
    ): CategorySteamResponse {
        return client.get(
            path = "/steam",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_type[]" to emailType,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "item_domain" to itemDomain,
            "game[]" to game,
            "hours_played" to hoursPlayed,
            "hours_played_max" to hoursPlayedMax,
            "eg" to eg,
            "vac[]" to vac,
            "vac_skip_game_check" to vacSkipGameCheck,
            "rt" to rt,
            "trade_ban" to tradeBan,
            "trade_limit" to tradeLimit,
            "daybreak" to daybreak,
            "limit" to limit,
            "mafile" to mafile,
            "reg" to reg,
            "reg_period" to regPeriod,
            "lmin" to lmin,
            "lmax" to lmax,
            "rmin" to rmin,
            "rmax" to rmax,
            "wingman_rmin" to wingmanRmin,
            "wingman_rmax" to wingmanRmax,
            "no_vac" to noVac,
            "mm_ban" to mmBan,
            "balance_min" to balanceMin,
            "balance_max" to balanceMax,
            "inv_game" to invGame,
            "inv_min" to invMin,
            "inv_max" to invMax,
            "friends_min" to friendsMin,
            "friends_max" to friendsMax,
            "gmin" to gmin,
            "gmax" to gmax,
            "win_count_min" to winCountMin,
            "win_count_max" to winCountMax,
            "medal_id[]" to medalId,
            "medal_operator_or" to medalOperatorOr,
            "medal_min" to medalMin,
            "medal_max" to medalMax,
            "gift[]" to gift,
            "gift_min" to giftMin,
            "gift_max" to giftMax,
            "recently_hours_min" to recentlyHoursMin,
            "recently_hours_max" to recentlyHoursMax,
            "country[]" to country,
            "not_country[]" to notCountry,
            "cs2_profile_rank_min" to cs2ProfileRankMin,
            "cs2_profile_rank_max" to cs2ProfileRankMax,
            "solommr_min" to solommrMin,
            "solommr_max" to solommrMax,
            "d2_game_count_min" to d2GameCountMin,
            "d2_game_count_max" to d2GameCountMax,
            "d2_win_count_min" to d2WinCountMin,
            "d2_win_count_max" to d2WinCountMax,
            "d2_behavior_min" to d2BehaviorMin,
            "d2_behavior_max" to d2BehaviorMax,
            "faceit_lvl_min" to faceitLvlMin,
            "faceit_lvl_max" to faceitLvlMax,
            "points_min" to pointsMin,
            "points_max" to pointsMax,
            "relevant_gmin" to relevantGmin,
            "relevant_gmax" to relevantGmax,
            "last_trans_date" to lastTransDate,
            "last_trans_date_period" to lastTransDatePeriod,
            "last_trans_date_later" to lastTransDateLater,
            "last_trans_date_period_later" to lastTransDatePeriodLater,
            "no_trans" to noTrans,
            "trans" to trans,
            "gifts_purchase_min" to giftsPurchaseMin,
            "gifts_purchase_max" to giftsPurchaseMax,
            "refunds_purchase_min" to refundsPurchaseMin,
            "refunds_purchase_max" to refundsPurchaseMax,
            "ingame_purchase_min" to ingamePurchaseMin,
            "ingame_purchase_max" to ingamePurchaseMax,
            "games_purchase_min" to gamesPurchaseMin,
            "games_purchase_max" to gamesPurchaseMax,
            "purchase_min" to purchaseMin,
            "purchase_max" to purchaseMax,
            "has_activated_keys" to hasActivatedKeys,
            "elo_min" to eloMin,
            "elo_max" to eloMax,
            "cs2_map_rank" to cs2MapRank,
            "cs2_map_rmin" to cs2MapRmin,
            "cs2_map_rmax" to cs2MapRmax,
            "has_faceit" to hasFaceit,
            "faceit_csgo_lvl_min" to faceitCsgoLvlMin,
            "faceit_csgo_lvl_max" to faceitCsgoLvlMax,
            "rust_deaths_min" to rustDeathsMin,
            "rust_deaths_max" to rustDeathsMax,
            "rust_kills_min" to rustKillsMin,
            "rust_kills_max" to rustKillsMax,
            "d2_last_match_date" to d2LastMatchDate,
            "d2_last_match_date_period" to d2LastMatchDatePeriod,
            "cards_min" to cardsMin,
            "cards_max" to cardsMax,
            "cards_games_min" to cardsGamesMin,
            "cards_games_max" to cardsGamesMax,
            "skip_vac_inv" to skipVacInv
            )
        )
    }

    /**
     * Fortnite
     *
     * `GET /fortnite`
     */
    suspend fun fortnite(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        emailType: List<EmailTypeItem2>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        tempEmail: Rt? = null,
        itemDomain: String? = null,
        eg: Eg2? = null,
        smin: Long? = null,
        smax: Long? = null,
        vbmin: Long? = null,
        vbmax: Long? = null,
        skin: List<String>? = null,
        pickaxe: List<String>? = null,
        glider: List<String>? = null,
        dance: List<String>? = null,
        changeEmail: Rt? = null,
        platform: List<PlatformItem>? = null,
        skinsShopMin: Long? = null,
        skinsShopMax: Long? = null,
        pickaxesShopMin: Long? = null,
        pickaxesShopMax: Long? = null,
        dancesShopMin: Long? = null,
        dancesShopMax: Long? = null,
        glidersShopMin: Long? = null,
        glidersShopMax: Long? = null,
        skinsShopVbmin: Long? = null,
        skinsShopVbmax: Long? = null,
        pickaxesShopVbmin: Long? = null,
        pickaxesShopVbmax: Long? = null,
        dancesShopVbmin: Long? = null,
        dancesShopVbmax: Long? = null,
        glidersShopVbmin: Long? = null,
        glidersShopVbmax: Long? = null,
        bp: Rt? = null,
        lmin: Long? = null,
        lmax: Long? = null,
        bpLmin: Long? = null,
        bpLmax: Long? = null,
        lastTransDate: Long? = null,
        lastTransDatePeriod: RegPeriod? = null,
        noTrans: Boolean? = null,
        xboxLinkable: Rt? = null,
        psnLinkable: Rt? = null,
        daybreak: Long? = null,
        rlPurchases: Boolean? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        refundCreditsMin: Long? = null,
        refundCreditsMax: Long? = null,
        pickaxeMin: Long? = null,
        pickaxeMax: Long? = null,
        dmin: Long? = null,
        dmax: Long? = null,
        gmin: Long? = null,
        gmax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null
    ): CategoryFortniteResponse {
        return client.get(
            path = "/fortnite",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "email_type[]" to emailType,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "temp_email" to tempEmail,
            "item_domain" to itemDomain,
            "eg" to eg,
            "smin" to smin,
            "smax" to smax,
            "vbmin" to vbmin,
            "vbmax" to vbmax,
            "skin[]" to skin,
            "pickaxe[]" to pickaxe,
            "glider[]" to glider,
            "dance[]" to dance,
            "change_email" to changeEmail,
            "platform[]" to platform,
            "skins_shop_min" to skinsShopMin,
            "skins_shop_max" to skinsShopMax,
            "pickaxes_shop_min" to pickaxesShopMin,
            "pickaxes_shop_max" to pickaxesShopMax,
            "dances_shop_min" to dancesShopMin,
            "dances_shop_max" to dancesShopMax,
            "gliders_shop_min" to glidersShopMin,
            "gliders_shop_max" to glidersShopMax,
            "skins_shop_vbmin" to skinsShopVbmin,
            "skins_shop_vbmax" to skinsShopVbmax,
            "pickaxes_shop_vbmin" to pickaxesShopVbmin,
            "pickaxes_shop_vbmax" to pickaxesShopVbmax,
            "dances_shop_vbmin" to dancesShopVbmin,
            "dances_shop_vbmax" to dancesShopVbmax,
            "gliders_shop_vbmin" to glidersShopVbmin,
            "gliders_shop_vbmax" to glidersShopVbmax,
            "bp" to bp,
            "lmin" to lmin,
            "lmax" to lmax,
            "bp_lmin" to bpLmin,
            "bp_lmax" to bpLmax,
            "last_trans_date" to lastTransDate,
            "last_trans_date_period" to lastTransDatePeriod,
            "no_trans" to noTrans,
            "xbox_linkable" to xboxLinkable,
            "psn_linkable" to psnLinkable,
            "daybreak" to daybreak,
            "rl_purchases" to rlPurchases,
            "reg" to reg,
            "reg_period" to regPeriod,
            "refund_credits_min" to refundCreditsMin,
            "refund_credits_max" to refundCreditsMax,
            "pickaxe_min" to pickaxeMin,
            "pickaxe_max" to pickaxeMax,
            "dmin" to dmin,
            "dmax" to dmax,
            "gmin" to gmin,
            "gmax" to gmax,
            "country[]" to country,
            "not_country[]" to notCountry
            )
        )
    }

    /**
     * miHoYo
     *
     * `GET /mihoyo`
     */
    suspend fun mihoyo(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        emailType: List<EmailTypeItem3>? = null,
        parseSameItemIds: Boolean? = null,
        itemDomain: String? = null,
        email: Rt? = null,
        ea: Rt? = null,
        region: List<RegionItem>? = null,
        notRegion: List<RegionItem>? = null,
        genshinCharacter: List<Int>? = null,
        genshinCharacterConstellations: Map<String, Long>? = null,
        genshinCharacterConstellationsMax: Map<String, Long>? = null,
        genshinWeapon: List<Int>? = null,
        genshinCharMin: Long? = null,
        genshinCharMax: Long? = null,
        genshinLegendaryMin: Long? = null,
        genshinLegendaryMax: Long? = null,
        genshinLevelMin: Long? = null,
        genshinLevelMax: Long? = null,
        genshinLegendaryWeaponMin: Long? = null,
        genshinLegendaryWeaponMax: Long? = null,
        constellationsMin: Long? = null,
        constellationsMax: Long? = null,
        genshinAchievementMin: Long? = null,
        genshinAchievementMax: Long? = null,
        genshinCurrencyMin: Long? = null,
        genshinCurrencyMax: Long? = null,
        honkaiCharacter: List<Int>? = null,
        honkaiCharacterEidolons: Map<String, Long>? = null,
        honkaiCharacterEidolonsMax: Map<String, Long>? = null,
        honkaiWeapon: List<Int>? = null,
        honkaiCharMin: Long? = null,
        honkaiCharMax: Long? = null,
        honkaiLegendaryMin: Long? = null,
        honkaiLegendaryMax: Long? = null,
        honkaiLevelMin: Long? = null,
        honkaiLevelMax: Long? = null,
        honkaiLegendaryWeaponMin: Long? = null,
        honkaiLegendaryWeaponMax: Long? = null,
        eidolonsMin: Long? = null,
        eidolonsMax: Long? = null,
        honkaiAchievementMin: Long? = null,
        honkaiAchievementMax: Long? = null,
        honkaiCurrencyMin: Long? = null,
        honkaiCurrencyMax: Long? = null,
        zenlessCharacter: List<ZenlessCharacterItem>? = null,
        zenlessCharacterCinemas: Map<String, Long>? = null,
        zenlessCharacterCinemasMax: Map<String, Long>? = null,
        zenlessWeapon: List<Int>? = null,
        zenlessLegendaryMin: Long? = null,
        zenlessLegendaryMax: Long? = null,
        cinemasMin: Long? = null,
        cinemasMax: Long? = null,
        zenlessLegendaryWeaponMin: Long? = null,
        zenlessLegendaryWeaponMax: Long? = null,
        zenlessCharMin: Long? = null,
        zenlessCharMax: Long? = null,
        zenlessLevelMin: Long? = null,
        zenlessLevelMax: Long? = null,
        zenlessAchievementMin: Long? = null,
        zenlessAchievementMax: Long? = null,
        zenlessCurrencyMin: Long? = null,
        zenlessCurrencyMax: Long? = null,
        daybreak: Long? = null
    ): CategoryMihoyoResponse {
        return client.get(
            path = "/mihoyo",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "email_type[]" to emailType,
            "parse_same_item_ids" to parseSameItemIds,
            "item_domain" to itemDomain,
            "email" to email,
            "ea" to ea,
            "region" to region,
            "not_region" to notRegion,
            "genshin_character[]" to genshinCharacter,
            "genshin_character_constellations" to genshinCharacterConstellations,
            "genshin_character_constellations_max" to genshinCharacterConstellationsMax,
            "genshin_weapon[]" to genshinWeapon,
            "genshin_char_min" to genshinCharMin,
            "genshin_char_max" to genshinCharMax,
            "genshin_legendary_min" to genshinLegendaryMin,
            "genshin_legendary_max" to genshinLegendaryMax,
            "genshin_level_min" to genshinLevelMin,
            "genshin_level_max" to genshinLevelMax,
            "genshin_legendary_weapon_min" to genshinLegendaryWeaponMin,
            "genshin_legendary_weapon_max" to genshinLegendaryWeaponMax,
            "constellations_min" to constellationsMin,
            "constellations_max" to constellationsMax,
            "genshin_achievement_min" to genshinAchievementMin,
            "genshin_achievement_max" to genshinAchievementMax,
            "genshin_currency_min" to genshinCurrencyMin,
            "genshin_currency_max" to genshinCurrencyMax,
            "honkai_character[]" to honkaiCharacter,
            "honkai_character_eidolons" to honkaiCharacterEidolons,
            "honkai_character_eidolons_max" to honkaiCharacterEidolonsMax,
            "honkai_weapon[]" to honkaiWeapon,
            "honkai_char_min" to honkaiCharMin,
            "honkai_char_max" to honkaiCharMax,
            "honkai_legendary_min" to honkaiLegendaryMin,
            "honkai_legendary_max" to honkaiLegendaryMax,
            "honkai_level_min" to honkaiLevelMin,
            "honkai_level_max" to honkaiLevelMax,
            "honkai_legendary_weapon_min" to honkaiLegendaryWeaponMin,
            "honkai_legendary_weapon_max" to honkaiLegendaryWeaponMax,
            "eidolons_min" to eidolonsMin,
            "eidolons_max" to eidolonsMax,
            "honkai_achievement_min" to honkaiAchievementMin,
            "honkai_achievement_max" to honkaiAchievementMax,
            "honkai_currency_min" to honkaiCurrencyMin,
            "honkai_currency_max" to honkaiCurrencyMax,
            "zenless_character[]" to zenlessCharacter,
            "zenless_character_cinemas" to zenlessCharacterCinemas,
            "zenless_character_cinemas_max" to zenlessCharacterCinemasMax,
            "zenless_weapon[]" to zenlessWeapon,
            "zenless_legendary_min" to zenlessLegendaryMin,
            "zenless_legendary_max" to zenlessLegendaryMax,
            "cinemas_min" to cinemasMin,
            "cinemas_max" to cinemasMax,
            "zenless_legendary_weapon_min" to zenlessLegendaryWeaponMin,
            "zenless_legendary_weapon_max" to zenlessLegendaryWeaponMax,
            "zenless_char_min" to zenlessCharMin,
            "zenless_char_max" to zenlessCharMax,
            "zenless_level_min" to zenlessLevelMin,
            "zenless_level_max" to zenlessLevelMax,
            "zenless_achievement_min" to zenlessAchievementMin,
            "zenless_achievement_max" to zenlessAchievementMax,
            "zenless_currency_min" to zenlessCurrencyMin,
            "zenless_currency_max" to zenlessCurrencyMax,
            "daybreak" to daybreak
            )
        )
    }

    /**
     * Riot
     *
     * `GET /riot`
     */
    suspend fun riot(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        rmin: Long? = null,
        rmax: Long? = null,
        lastRmin: Long? = null,
        lastRmax: Long? = null,
        previousRmin: Long? = null,
        previousRmax: Long? = null,
        weaponSkin: List<String>? = null,
        buddy: List<String>? = null,
        agent: List<String>? = null,
        champion: List<String>? = null,
        skin: List<String>? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        daybreak: Long? = null,
        valorantLevelMin: Long? = null,
        valorantLevelMax: Long? = null,
        lolLevelMin: Long? = null,
        lolLevelMax: Long? = null,
        invMin: Long? = null,
        invMax: Long? = null,
        vpMin: Long? = null,
        vpMax: Long? = null,
        valorantSmin: Long? = null,
        valorantSmax: Long? = null,
        valorantRankType: List<ValorantRankTypeItem>? = null,
        amin: Long? = null,
        amax: Long? = null,
        valorantRegion: List<String>? = null,
        valorantNotRegion: List<String>? = null,
        lolRegion: List<String>? = null,
        lolNotRegion: List<String>? = null,
        knife: Boolean? = null,
        lolSmin: Long? = null,
        lolSmax: Long? = null,
        championMin: Long? = null,
        championMax: Long? = null,
        winRateMin: Long? = null,
        winRateMax: Long? = null,
        blueMin: Long? = null,
        blueMax: Long? = null,
        orangeMin: Long? = null,
        orangeMax: Long? = null,
        mythicMin: Long? = null,
        mythicMax: Long? = null,
        riotMin: Long? = null,
        riotMax: Long? = null,
        email: Rt? = null,
        tel: Rt? = null,
        valorantKnifeMin: Long? = null,
        valorantKnifeMax: Long? = null,
        rpMin: Long? = null,
        rpMax: Long? = null,
        faMin: Long? = null,
        faMax: Long? = null,
        lolRank: List<LolRankItem>? = null
    ): CategoryRiotResponse {
        return client.get(
            path = "/riot",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "rmin" to rmin,
            "rmax" to rmax,
            "last_rmin" to lastRmin,
            "last_rmax" to lastRmax,
            "previous_rmin" to previousRmin,
            "previous_rmax" to previousRmax,
            "weaponSkin[]" to weaponSkin,
            "buddy[]" to buddy,
            "agent[]" to agent,
            "champion[]" to champion,
            "skin[]" to skin,
            "country[]" to country,
            "not_country[]" to notCountry,
            "daybreak" to daybreak,
            "valorant_level_min" to valorantLevelMin,
            "valorant_level_max" to valorantLevelMax,
            "lol_level_min" to lolLevelMin,
            "lol_level_max" to lolLevelMax,
            "inv_min" to invMin,
            "inv_max" to invMax,
            "vp_min" to vpMin,
            "vp_max" to vpMax,
            "valorant_smin" to valorantSmin,
            "valorant_smax" to valorantSmax,
            "valorant_rank_type[]" to valorantRankType,
            "amin" to amin,
            "amax" to amax,
            "valorant_region[]" to valorantRegion,
            "valorant_not_region[]" to valorantNotRegion,
            "lol_region[]" to lolRegion,
            "lol_not_region[]" to lolNotRegion,
            "knife" to knife,
            "lol_smin" to lolSmin,
            "lol_smax" to lolSmax,
            "champion_min" to championMin,
            "champion_max" to championMax,
            "win_rate_min" to winRateMin,
            "win_rate_max" to winRateMax,
            "blue_min" to blueMin,
            "blue_max" to blueMax,
            "orange_min" to orangeMin,
            "orange_max" to orangeMax,
            "mythic_min" to mythicMin,
            "mythic_max" to mythicMax,
            "riot_min" to riotMin,
            "riot_max" to riotMax,
            "email" to email,
            "tel" to tel,
            "valorant_knife_min" to valorantKnifeMin,
            "valorant_knife_max" to valorantKnifeMax,
            "rp_min" to rpMin,
            "rp_max" to rpMax,
            "fa_min" to faMin,
            "fa_max" to faMax,
            "lol_rank[]" to lolRank
            )
        )
    }

    /**
     * Telegram
     *
     * `GET /telegram`
     */
    suspend fun telegram(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem2>? = null,
        notOrigin: List<OriginItem2>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        spam: Rt? = null,
        password: Rt? = null,
        premium: Rt? = null,
        premiumExpiration: Long? = null,
        premiumExpirationPeriod: RegPeriod? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        daybreak: Long? = null,
        minChannels: Long? = null,
        maxChannels: Long? = null,
        minChats: Long? = null,
        maxChats: Long? = null,
        minConversations: Long? = null,
        maxConversations: Long? = null,
        minAdmin: Long? = null,
        maxAdmin: Long? = null,
        minAdminSub: Long? = null,
        maxAdminSub: Long? = null,
        digMin: Long? = null,
        digMax: Long? = null,
        minContacts: Long? = null,
        maxContacts: Long? = null,
        minStars: Long? = null,
        maxStars: Long? = null,
        birthday: Long? = null,
        birthdayPeriod: RegPeriod? = null,
        birthdayAfter: Long? = null,
        birthdayAfterPeriod: RegPeriod? = null,
        minId: Long? = null,
        maxId: Long? = null,
        allowGeoSpamblock: Boolean? = null,
        minGifts: Long? = null,
        maxGifts: Long? = null,
        minNftGifts: Long? = null,
        maxNftGifts: Long? = null,
        minGiftsStars: Long? = null,
        maxGiftsStars: Long? = null,
        minGiftsConvertStars: Long? = null,
        maxGiftsConvertStars: Long? = null,
        dcId: List<Long>? = null,
        notDcId: List<Long>? = null,
        email: Rt? = null,
        minBots: Long? = null,
        maxBots: Long? = null,
        minBotActiveUsers: Long? = null,
        maxBotActiveUsers: Long? = null
    ): CategoryTelegramResponse {
        return client.get(
            path = "/telegram",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "spam" to spam,
            "password" to password,
            "premium" to premium,
            "premium_expiration" to premiumExpiration,
            "premium_expiration_period" to premiumExpirationPeriod,
            "country[]" to country,
            "not_country[]" to notCountry,
            "daybreak" to daybreak,
            "min_channels" to minChannels,
            "max_channels" to maxChannels,
            "min_chats" to minChats,
            "max_chats" to maxChats,
            "min_conversations" to minConversations,
            "max_conversations" to maxConversations,
            "min_admin" to minAdmin,
            "max_admin" to maxAdmin,
            "min_admin_sub" to minAdminSub,
            "max_admin_sub" to maxAdminSub,
            "dig_min" to digMin,
            "dig_max" to digMax,
            "min_contacts" to minContacts,
            "max_contacts" to maxContacts,
            "min_stars" to minStars,
            "max_stars" to maxStars,
            "birthday" to birthday,
            "birthday_period" to birthdayPeriod,
            "birthday_after" to birthdayAfter,
            "birthday_after_period" to birthdayAfterPeriod,
            "min_id" to minId,
            "max_id" to maxId,
            "allow_geo_spamblock" to allowGeoSpamblock,
            "min_gifts" to minGifts,
            "max_gifts" to maxGifts,
            "min_nft_gifts" to minNftGifts,
            "max_nft_gifts" to maxNftGifts,
            "min_gifts_stars" to minGiftsStars,
            "max_gifts_stars" to maxGiftsStars,
            "min_gifts_convert_stars" to minGiftsConvertStars,
            "max_gifts_convert_stars" to maxGiftsConvertStars,
            "dc_id[]" to dcId,
            "not_dc_id[]" to notDcId,
            "email" to email,
            "min_bots" to minBots,
            "max_bots" to maxBots,
            "min_bot_active_users" to minBotActiveUsers,
            "max_bot_active_users" to maxBotActiveUsers
            )
        )
    }

    /**
     * Supercell
     *
     * `GET /supercell`
     */
    suspend fun supercell(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        daybreak: Long? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        eg: Eg2? = null,
        tel: Rt? = null,
        brawlLevelMin: Long? = null,
        brawlLevelMax: Long? = null,
        brawlCupMin: Long? = null,
        brawlCupMax: Long? = null,
        brawlWinsMin: Long? = null,
        brawlWinsMax: Long? = null,
        brawlPass: Rt? = null,
        brawler: List<String>? = null,
        brawlersMin: Long? = null,
        brawlersMax: Long? = null,
        legendaryBrawlersMin: Long? = null,
        legendaryBrawlersMax: Long? = null,
        royaleLevelMin: Long? = null,
        royaleLevelMax: Long? = null,
        royaleCupMin: Long? = null,
        royaleCupMax: Long? = null,
        royaleWinsMin: Long? = null,
        royaleWinsMax: Long? = null,
        kingLevelMin: Long? = null,
        kingLevelMax: Long? = null,
        royalePass: Rt? = null,
        clashLevelMin: Long? = null,
        clashLevelMax: Long? = null,
        clashCupMin: Long? = null,
        clashCupMax: Long? = null,
        clashWinsMin: Long? = null,
        clashWinsMax: Long? = null,
        clashPass: Rt? = null,
        totalHeroesLevelMin: Long? = null,
        totalHeroesLevelMax: Long? = null,
        totalTroopsLevelMin: Long? = null,
        totalTroopsLevelMax: Long? = null,
        totalSpellsLevelMin: Long? = null,
        totalSpellsLevelMax: Long? = null,
        totalBuilderHeroesLevelMin: Long? = null,
        totalBuilderHeroesLevelMax: Long? = null,
        totalBuilderTroopsLevelMin: Long? = null,
        totalBuilderTroopsLevelMax: Long? = null,
        townHallLevelMin: Long? = null,
        townHallLevelMax: Long? = null,
        builderHallLevelMin: Long? = null,
        builderHallLevelMax: Long? = null,
        builderHallCupMin: Long? = null,
        builderHallCupMax: Long? = null,
        creationYearMin: Long? = null,
        creationYearMax: Long? = null
    ): CategorySupercellResponse {
        return client.get(
            path = "/supercell",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "daybreak" to daybreak,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "eg" to eg,
            "tel" to tel,
            "brawl_level_min" to brawlLevelMin,
            "brawl_level_max" to brawlLevelMax,
            "brawl_cup_min" to brawlCupMin,
            "brawl_cup_max" to brawlCupMax,
            "brawl_wins_min" to brawlWinsMin,
            "brawl_wins_max" to brawlWinsMax,
            "brawl_pass" to brawlPass,
            "brawler[]" to brawler,
            "brawlers_min" to brawlersMin,
            "brawlers_max" to brawlersMax,
            "legendary_brawlers_min" to legendaryBrawlersMin,
            "legendary_brawlers_max" to legendaryBrawlersMax,
            "royale_level_min" to royaleLevelMin,
            "royale_level_max" to royaleLevelMax,
            "royale_cup_min" to royaleCupMin,
            "royale_cup_max" to royaleCupMax,
            "royale_wins_min" to royaleWinsMin,
            "royale_wins_max" to royaleWinsMax,
            "king_level_min" to kingLevelMin,
            "king_level_max" to kingLevelMax,
            "royale_pass" to royalePass,
            "clash_level_min" to clashLevelMin,
            "clash_level_max" to clashLevelMax,
            "clash_cup_min" to clashCupMin,
            "clash_cup_max" to clashCupMax,
            "clash_wins_min" to clashWinsMin,
            "clash_wins_max" to clashWinsMax,
            "clash_pass" to clashPass,
            "total_heroes_level_min" to totalHeroesLevelMin,
            "total_heroes_level_max" to totalHeroesLevelMax,
            "total_troops_level_min" to totalTroopsLevelMin,
            "total_troops_level_max" to totalTroopsLevelMax,
            "total_spells_level_min" to totalSpellsLevelMin,
            "total_spells_level_max" to totalSpellsLevelMax,
            "total_builder_heroes_level_min" to totalBuilderHeroesLevelMin,
            "total_builder_heroes_level_max" to totalBuilderHeroesLevelMax,
            "total_builder_troops_level_min" to totalBuilderTroopsLevelMin,
            "total_builder_troops_level_max" to totalBuilderTroopsLevelMax,
            "town_hall_level_min" to townHallLevelMin,
            "town_hall_level_max" to townHallLevelMax,
            "builder_hall_level_min" to builderHallLevelMin,
            "builder_hall_level_max" to builderHallLevelMax,
            "builder_hall_cup_min" to builderHallCupMin,
            "builder_hall_cup_max" to builderHallCupMax,
            "creation_year_min" to creationYearMin,
            "creation_year_max" to creationYearMax
            )
        )
    }

    /**
     * EA (Origin)
     *
     * `GET /ea`
     */
    suspend fun eA(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        game: List<String>? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        gmin: Long? = null,
        gmax: Long? = null,
        alRankMin: Long? = null,
        alRankMax: Long? = null,
        alLevelMin: Long? = null,
        alLevelMax: Long? = null,
        hasBan: Rt? = null,
        xboxConnected: Rt? = null,
        steamConnected: Rt? = null,
        psnConnected: Rt? = null,
        subscription: Subscription? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null,
        hoursPlayed: Map<String, Long>? = null,
        hoursPlayedMax: Map<String, Long>? = null,
        transactions: Rt? = null
    ): CategoryEAResponse {
        return client.get(
            path = "/ea",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "game[]" to game,
            "country[]" to country,
            "not_country[]" to notCountry,
            "gmin" to gmin,
            "gmax" to gmax,
            "al_rank_min" to alRankMin,
            "al_rank_max" to alRankMax,
            "al_level_min" to alLevelMin,
            "al_level_max" to alLevelMax,
            "has_ban" to hasBan,
            "xbox_connected" to xboxConnected,
            "steam_connected" to steamConnected,
            "psn_connected" to psnConnected,
            "subscription" to subscription,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod,
            "hours_played" to hoursPlayed,
            "hours_played_max" to hoursPlayedMax,
            "transactions" to transactions
            )
        )
    }

    /**
     * World of Tanks
     *
     * `GET /world-of-tanks`
     */
    suspend fun wot(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        tel: Rt? = null,
        daybreak: Long? = null,
        battlesMin: Long? = null,
        battlesMax: Long? = null,
        goldMin: Long? = null,
        goldMax: Long? = null,
        silverMin: Long? = null,
        silverMax: Long? = null,
        topMin: Long? = null,
        topMax: Long? = null,
        premMin: Long? = null,
        premMax: Long? = null,
        topPremMin: Long? = null,
        topPremMax: Long? = null,
        winPmin: Long? = null,
        winPmax: Long? = null,
        tank: List<Long>? = null,
        region: List<RegionItem2>? = null,
        notRegion: List<RegionItem2>? = null,
        premium: Rt? = null,
        premiumExpiration: Long? = null,
        premiumExpirationPeriod: RegPeriod? = null,
        clan: Rt? = null,
        clanRole: List<ClanRoleItem>? = null,
        notClanRole: List<ClanRoleItem>? = null,
        clanGoldMin: Long? = null,
        clanGoldMax: Long? = null,
        clanCreditsMin: Long? = null,
        clanCreditsMax: Long? = null,
        clanCrystalMin: Long? = null,
        clanCrystalMax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null
    ): CategoryWotResponse {
        return client.get(
            path = "/world-of-tanks",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "tel" to tel,
            "daybreak" to daybreak,
            "battles_min" to battlesMin,
            "battles_max" to battlesMax,
            "gold_min" to goldMin,
            "gold_max" to goldMax,
            "silver_min" to silverMin,
            "silver_max" to silverMax,
            "top_min" to topMin,
            "top_max" to topMax,
            "prem_min" to premMin,
            "prem_max" to premMax,
            "top_prem_min" to topPremMin,
            "top_prem_max" to topPremMax,
            "win_pmin" to winPmin,
            "win_pmax" to winPmax,
            "tank[]" to tank,
            "region[]" to region,
            "not_region[]" to notRegion,
            "premium" to premium,
            "premium_expiration" to premiumExpiration,
            "premium_expiration_period" to premiumExpirationPeriod,
            "clan" to clan,
            "clan_role[]" to clanRole,
            "not_clan_role[]" to notClanRole,
            "clan_gold_min" to clanGoldMin,
            "clan_gold_max" to clanGoldMax,
            "clan_credits_min" to clanCreditsMin,
            "clan_credits_max" to clanCreditsMax,
            "clan_crystal_min" to clanCrystalMin,
            "clan_crystal_max" to clanCrystalMax,
            "country[]" to country,
            "not_country[]" to notCountry
            )
        )
    }

    /**
     * WoT Blitz
     *
     * `GET /wot-blitz`
     */
    suspend fun wotBlitz(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        tel: Rt? = null,
        daybreak: Long? = null,
        battlesMin: Long? = null,
        battlesMax: Long? = null,
        goldMin: Long? = null,
        goldMax: Long? = null,
        silverMin: Long? = null,
        silverMax: Long? = null,
        topMin: Long? = null,
        topMax: Long? = null,
        premMin: Long? = null,
        premMax: Long? = null,
        topPremMin: Long? = null,
        topPremMax: Long? = null,
        winPmin: Long? = null,
        winPmax: Long? = null,
        tank: List<Long>? = null,
        region: List<RegionItem2>? = null,
        notRegion: List<RegionItem2>? = null,
        premium: Rt? = null,
        premiumExpiration: Long? = null,
        premiumExpirationPeriod: RegPeriod? = null,
        clan: Rt? = null,
        clanRole: List<ClanRoleItem>? = null,
        notClanRole: List<ClanRoleItem>? = null,
        clanGoldMin: Long? = null,
        clanGoldMax: Long? = null,
        clanCreditsMin: Long? = null,
        clanCreditsMax: Long? = null,
        clanCrystalMin: Long? = null,
        clanCrystalMax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null
    ): CategoryWotBlitzResponse {
        return client.get(
            path = "/wot-blitz",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "tel" to tel,
            "daybreak" to daybreak,
            "battles_min" to battlesMin,
            "battles_max" to battlesMax,
            "gold_min" to goldMin,
            "gold_max" to goldMax,
            "silver_min" to silverMin,
            "silver_max" to silverMax,
            "top_min" to topMin,
            "top_max" to topMax,
            "prem_min" to premMin,
            "prem_max" to premMax,
            "top_prem_min" to topPremMin,
            "top_prem_max" to topPremMax,
            "win_pmin" to winPmin,
            "win_pmax" to winPmax,
            "tank[]" to tank,
            "region[]" to region,
            "not_region[]" to notRegion,
            "premium" to premium,
            "premium_expiration" to premiumExpiration,
            "premium_expiration_period" to premiumExpirationPeriod,
            "clan" to clan,
            "clan_role[]" to clanRole,
            "not_clan_role[]" to notClanRole,
            "clan_gold_min" to clanGoldMin,
            "clan_gold_max" to clanGoldMax,
            "clan_credits_min" to clanCreditsMin,
            "clan_credits_max" to clanCreditsMax,
            "clan_crystal_min" to clanCrystalMin,
            "clan_crystal_max" to clanCrystalMax,
            "country[]" to country,
            "not_country[]" to notCountry
            )
        )
    }

    /**
     * Gifts
     *
     * `GET /gifts`
     */
    suspend fun gifts(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        subscription: Subscription2? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null
    ): CategoryGiftsResponse {
        return client.get(
            path = "/gifts",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "subscription" to subscription,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod
            )
        )
    }

    /**
     * Epic Games
     *
     * `GET /epicgames`
     */
    suspend fun epicGames(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem2>? = null,
        itemDomain: String? = null,
        eg: Eg2? = null,
        game: List<String>? = null,
        changeEmail: Rt? = null,
        rlPurchases: Boolean? = null,
        balanceMin: Double? = null,
        balanceMax: Double? = null,
        rewardsBalanceMin: Double? = null,
        rewardsBalanceMax: Double? = null,
        gmin: Long? = null,
        gmax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        daybreak: Long? = null,
        hoursPlayed: Map<String, Long>? = null,
        hoursPlayedMax: Map<String, Long>? = null
    ): CategoryEpicGamesResponse {
        return client.get(
            path = "/epicgames",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "eg" to eg,
            "game[]" to game,
            "change_email" to changeEmail,
            "rl_purchases" to rlPurchases,
            "balance_min" to balanceMin,
            "balance_max" to balanceMax,
            "rewards_balance_min" to rewardsBalanceMin,
            "rewards_balance_max" to rewardsBalanceMax,
            "gmin" to gmin,
            "gmax" to gmax,
            "country[]" to country,
            "not_country[]" to notCountry,
            "daybreak" to daybreak,
            "hours_played" to hoursPlayed,
            "hours_played_max" to hoursPlayedMax
            )
        )
    }

    /**
     * Escape from Tarkov
     *
     * `GET /escape-from-tarkov`
     */
    suspend fun escapeFromTarkov(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        region: Region? = null,
        version: List<VersionItem>? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        levelMin: Long? = null,
        levelMax: Long? = null,
        pve: Rt? = null,
        side: Side? = null
    ): CategoryEscapeFromTarkovResponse {
        return client.get(
            path = "/escape-from-tarkov",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "region" to region,
            "version[]" to version,
            "reg" to reg,
            "reg_period" to regPeriod,
            "level_min" to levelMin,
            "level_max" to levelMax,
            "pve" to pve,
            "side" to side
            )
        )
    }

    /**
     * Social Club
     *
     * `GET /socialclub`
     */
    suspend fun socialClub(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        daybreak: Long? = null,
        levelMin: Long? = null,
        levelMax: Long? = null,
        cashMin: Long? = null,
        cashMax: Long? = null,
        bankCashMin: Long? = null,
        bankCashMax: Long? = null,
        game: List<String>? = null
    ): CategorySocialClubResponse {
        return client.get(
            path = "/socialclub",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "daybreak" to daybreak,
            "level_min" to levelMin,
            "level_max" to levelMax,
            "cash_min" to cashMin,
            "cash_max" to cashMax,
            "bank_cash_min" to bankCashMin,
            "bank_cash_max" to bankCashMax,
            "game[]" to game
            )
        )
    }

    /**
     * Uplay
     *
     * `GET /uplay`
     */
    suspend fun uplay(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        game: List<String>? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        daybreak: Long? = null,
        gmin: Long? = null,
        gmax: Long? = null,
        subscription: Subscription3? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null,
        r6LevelMin: Long? = null,
        r6LevelMax: Long? = null,
        r6RankMin: Long? = null,
        r6RankMax: Long? = null,
        r6OperatorsMin: Long? = null,
        r6OperatorsMax: Long? = null,
        r6Ban: Rt? = null,
        r6Smin: Long? = null,
        r6Smax: Long? = null,
        r6Skin: List<String>? = null,
        r6Operator: List<String>? = null,
        xboxConnected: Rt? = null,
        psnConnected: Rt? = null,
        steamConnected: Rt? = null,
        balanceMin: Double? = null,
        balanceMax: Double? = null,
        transactions: Rt? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null
    ): CategoryUplayResponse {
        return client.get(
            path = "/uplay",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "game[]" to game,
            "country[]" to country,
            "not_country[]" to notCountry,
            "daybreak" to daybreak,
            "gmin" to gmin,
            "gmax" to gmax,
            "subscription" to subscription,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod,
            "r6_level_min" to r6LevelMin,
            "r6_level_max" to r6LevelMax,
            "r6_rank_min" to r6RankMin,
            "r6_rank_max" to r6RankMax,
            "r6_operators_min" to r6OperatorsMin,
            "r6_operators_max" to r6OperatorsMax,
            "r6_ban" to r6Ban,
            "r6_smin" to r6Smin,
            "r6_smax" to r6Smax,
            "r6_skin[]" to r6Skin,
            "r6_operator[]" to r6Operator,
            "xbox_connected" to xboxConnected,
            "psn_connected" to psnConnected,
            "steam_connected" to steamConnected,
            "balance_min" to balanceMin,
            "balance_max" to balanceMax,
            "transactions" to transactions,
            "reg" to reg,
            "reg_period" to regPeriod
            )
        )
    }

    /**
     * Discord
     *
     * `GET /discord`
     */
    suspend fun discord(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        tel: Rt? = null,
        nitro: Rt? = null,
        nitroType: List<NitroTypeItem>? = null,
        nitroLength: Long? = null,
        nitroPeriod: RegPeriod? = null,
        boostsMin: Long? = null,
        boostsMax: Long? = null,
        billing: Rt? = null,
        gifts: Rt? = null,
        transactions: Rt? = null,
        badge: List<BadgeItem>? = null,
        condition: List<ConditionItem>? = null,
        chatMin: Long? = null,
        chatMax: Long? = null,
        minAdminMembers: Long? = null,
        maxAdminMembers: Long? = null,
        minAdmin: Long? = null,
        maxAdmin: Long? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        language: List<String>? = null,
        notLanguage: List<String>? = null,
        clans: Rt? = null,
        minAdminClans: Long? = null,
        maxAdminClans: Long? = null,
        minOwnerClans: Long? = null,
        maxOwnerClans: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        minServers: Long? = null,
        maxServers: Long? = null,
        v2fa: Rt? = null,
        minFullCredits: Long? = null,
        maxFullCredits: Long? = null,
        minBasicCredits: Long? = null,
        maxBasicCredits: Long? = null,
        minOrbs: Long? = null,
        maxOrbs: Long? = null
    ): CategoryDiscordResponse {
        return client.get(
            path = "/discord",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "tel" to tel,
            "nitro" to nitro,
            "nitro_type[]" to nitroType,
            "nitro_length" to nitroLength,
            "nitro_period" to nitroPeriod,
            "boosts_min" to boostsMin,
            "boosts_max" to boostsMax,
            "billing" to billing,
            "gifts" to gifts,
            "transactions" to transactions,
            "badge[]" to badge,
            "condition[]" to condition,
            "chat_min" to chatMin,
            "chat_max" to chatMax,
            "min_admin_members" to minAdminMembers,
            "max_admin_members" to maxAdminMembers,
            "min_admin" to minAdmin,
            "max_admin" to maxAdmin,
            "reg" to reg,
            "reg_period" to regPeriod,
            "language[]" to language,
            "not_language[]" to notLanguage,
            "clans" to clans,
            "min_admin_clans" to minAdminClans,
            "max_admin_clans" to maxAdminClans,
            "min_owner_clans" to minOwnerClans,
            "max_owner_clans" to maxOwnerClans,
            "country[]" to country,
            "not_country[]" to notCountry,
            "min_servers" to minServers,
            "max_servers" to maxServers,
            "2fa" to v2fa,
            "min_full_credits" to minFullCredits,
            "max_full_credits" to maxFullCredits,
            "min_basic_credits" to minBasicCredits,
            "max_basic_credits" to maxBasicCredits,
            "min_orbs" to minOrbs,
            "max_orbs" to maxOrbs
            )
        )
    }

    /**
     * TikTok
     *
     * `GET /tiktok`
     */
    suspend fun tikTok(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        tel: Rt? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        followersMin: Long? = null,
        followersMax: Long? = null,
        postMin: Long? = null,
        postMax: Long? = null,
        likeMin: Long? = null,
        likeMax: Long? = null,
        coinsMin: Long? = null,
        coinsMax: Long? = null,
        cookieLogin: Rt? = null,
        verified: Rt? = null,
        email: Rt? = null
    ): CategoryTikTokResponse {
        return client.get(
            path = "/tiktok",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "tel" to tel,
            "reg" to reg,
            "reg_period" to regPeriod,
            "followers_min" to followersMin,
            "followers_max" to followersMax,
            "post_min" to postMin,
            "post_max" to postMax,
            "like_min" to likeMin,
            "like_max" to likeMax,
            "coins_min" to coinsMin,
            "coins_max" to coinsMax,
            "cookie_login" to cookieLogin,
            "verified" to verified,
            "email" to email
            )
        )
    }

    /**
     * Instagram
     *
     * `GET /instagram`
     */
    suspend fun instagram(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem3>? = null,
        itemDomain: String? = null,
        tel: Rt? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        cookies: Rt? = null,
        loginWithoutCookies: Rt? = null,
        followersMin: Long? = null,
        followersMax: Long? = null,
        postMin: Long? = null,
        postMax: Long? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null
    ): CategoryInstagramResponse {
        return client.get(
            path = "/instagram",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "tel" to tel,
            "country[]" to country,
            "not_country[]" to notCountry,
            "cookies" to cookies,
            "login_without_cookies" to loginWithoutCookies,
            "followers_min" to followersMin,
            "followers_max" to followersMax,
            "post_min" to postMin,
            "post_max" to postMax,
            "reg" to reg,
            "reg_period" to regPeriod
            )
        )
    }

    /**
     * BattleNet
     *
     * `GET /battlenet`
     */
    suspend fun battleNet(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem4>? = null,
        itemDomain: String? = null,
        eg: Eg3? = null,
        game: List<Long>? = null,
        daybreak: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        tel: Rt? = null,
        editBtag: Rt? = null,
        changeableFn: Rt? = null,
        realId: Rt? = null,
        parentControl: Rt? = null,
        noBans: Rt? = null,
        balanceMin: Long? = null,
        balanceMax: Long? = null
    ): CategoryBattleNetResponse {
        return client.get(
            path = "/battlenet",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "eg" to eg,
            "game[]" to game,
            "daybreak" to daybreak,
            "country[]" to country,
            "not_country[]" to notCountry,
            "tel" to tel,
            "edit_btag" to editBtag,
            "changeable_fn" to changeableFn,
            "real_id" to realId,
            "parent_control" to parentControl,
            "no_bans" to noBans,
            "balance_min" to balanceMin,
            "balance_max" to balanceMax
            )
        )
    }

    /**
     * ChatGPT
     *
     * `GET /chatgpt`
     */
    suspend fun chatGPT(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        emailType: List<EmailTypeItem4>? = null,
        itemDomain: String? = null,
        subscription: List<SubscriptionItem>? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null,
        autorenewal: Rt? = null,
        tel: Rt? = null,
        transactions: Rt? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        openaiTier: List<OpenaiTierItem>? = null,
        openaiBalanceMin: Long? = null,
        openaiBalanceMax: Long? = null
    ): CategoryChatGPTResponse {
        return client.get(
            path = "/chatgpt",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email_type[]" to emailType,
            "item_domain" to itemDomain,
            "subscription[]" to subscription,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod,
            "autorenewal" to autorenewal,
            "tel" to tel,
            "transactions" to transactions,
            "reg" to reg,
            "reg_period" to regPeriod,
            "openai_tier[]" to openaiTier,
            "openai_balance_min" to openaiBalanceMin,
            "openai_balance_max" to openaiBalanceMax
            )
        )
    }

    /**
     * VPN
     *
     * `GET /vpn`
     */
    suspend fun vpn(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        service: List<ServiceItem>? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null,
        autorenewal: Rt? = null
    ): CategoryVpnResponse {
        return client.get(
            path = "/vpn",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "service[]" to service,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod,
            "autorenewal" to autorenewal
            )
        )
    }

    /**
     * Roblox
     *
     * `GET /roblox`
     */
    suspend fun roblox(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        email: Rt? = null,
        robuxMin: Long? = null,
        robuxMax: Long? = null,
        friendsMin: Long? = null,
        friendsMax: Long? = null,
        followersMin: Long? = null,
        followersMax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        subscription: Subscription4? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null,
        autorenewal: Rt? = null,
        xboxConnected: Rt? = null,
        psnConnected: Rt? = null,
        verified: Rt? = null,
        ageVerified: Rt? = null,
        incomingRobuxTotalMin: Long? = null,
        incomingRobuxTotalMax: Long? = null,
        limitedPriceMin: Long? = null,
        limitedPriceMax: Long? = null,
        gamepassMin: Long? = null,
        gamepassMax: Long? = null,
        gameDonations: Rt? = null,
        invMin: Long? = null,
        invMax: Long? = null,
        ugcLimitedPriceMin: Long? = null,
        ugcLimitedPriceMax: Long? = null,
        creditBalanceMin: Long? = null,
        creditBalanceMax: Long? = null,
        offsaleMin: Long? = null,
        offsaleMax: Long? = null,
        voice: Rt? = null,
        ageGroup: List<String>? = null,
        notAgeGroup: List<String>? = null
    ): CategoryRobloxResponse {
        return client.get(
            path = "/roblox",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "email" to email,
            "robux_min" to robuxMin,
            "robux_max" to robuxMax,
            "friends_min" to friendsMin,
            "friends_max" to friendsMax,
            "followers_min" to followersMin,
            "followers_max" to followersMax,
            "country" to country,
            "not_country" to notCountry,
            "reg" to reg,
            "reg_period" to regPeriod,
            "subscription" to subscription,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod,
            "autorenewal" to autorenewal,
            "xbox_connected" to xboxConnected,
            "psn_connected" to psnConnected,
            "verified" to verified,
            "age_verified" to ageVerified,
            "incoming_robux_total_min" to incomingRobuxTotalMin,
            "incoming_robux_total_max" to incomingRobuxTotalMax,
            "limited_price_min" to limitedPriceMin,
            "limited_price_max" to limitedPriceMax,
            "gamepass_min" to gamepassMin,
            "gamepass_max" to gamepassMax,
            "game_donations" to gameDonations,
            "inv_min" to invMin,
            "inv_max" to invMax,
            "ugc_limited_price_min" to ugcLimitedPriceMin,
            "ugc_limited_price_max" to ugcLimitedPriceMax,
            "credit_balance_min" to creditBalanceMin,
            "credit_balance_max" to creditBalanceMax,
            "offsale_min" to offsaleMin,
            "offsale_max" to offsaleMax,
            "voice" to voice,
            "age_group[]" to ageGroup,
            "not_age_group[]" to notAgeGroup
            )
        )
    }

    /**
     * Warface
     *
     * `GET /warface`
     */
    suspend fun warface(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        rankMin: Long? = null,
        rankMax: Long? = null,
        bonusRankMin: Long? = null,
        bonusRankMax: Long? = null,
        tel: Rt? = null,
        daybreak: Long? = null,
        kreditsMin: Long? = null,
        kreditsMax: Long? = null,
        totalKreditsMin: Long? = null,
        totalKreditsMax: Long? = null
    ): CategoryWarfaceResponse {
        return client.get(
            path = "/warface",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "rank_min" to rankMin,
            "rank_max" to rankMax,
            "bonus_rank_min" to bonusRankMin,
            "bonus_rank_max" to bonusRankMax,
            "tel" to tel,
            "daybreak" to daybreak,
            "kredits_min" to kreditsMin,
            "kredits_max" to kreditsMax,
            "total_kredits_min" to totalKreditsMin,
            "total_kredits_max" to totalKreditsMax
            )
        )
    }

    /**
     * Minecraft
     *
     * `GET /minecraft`
     */
    suspend fun minecraft(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        subscription: Subscription5? = null,
        subscriptionLength: Long? = null,
        subscriptionPeriod: RegPeriod? = null,
        autorenewal: Rt? = null,
        java: Rt? = null,
        bedrock: Rt? = null,
        dungeons: Rt? = null,
        legends: Rt? = null,
        changeNickname: Rt? = null,
        capes: List<String>? = null,
        capesMin: Long? = null,
        capesMax: Long? = null,
        country: List<String>? = null,
        notCountry: List<String>? = null,
        hypixelBan: Rt? = null,
        hypixelSkyblockApiEnabled: Rt? = null,
        rankHypixel: List<RankHypixelItem>? = null,
        levelHypixelMin: Long? = null,
        levelHypixelMax: Long? = null,
        achievementHypixelMin: Long? = null,
        achievementHypixelMax: Long? = null,
        levelHypixelSkyblockMin: Long? = null,
        levelHypixelSkyblockMax: Long? = null,
        netWorthHypixelSkyblockMin: Long? = null,
        netWorthHypixelSkyblockMax: Long? = null,
        reg: Long? = null,
        regPeriod: RegPeriod? = null,
        lastLoginHypixel: Long? = null,
        lastLoginHypixelPeriod: RegPeriod? = null,
        canChangeDetails: Rt? = null,
        nicknameLengthMin: Long? = null,
        nicknameLengthMax: Long? = null,
        hypixelBanParsed: Rt? = null,
        minecoinsMin: Long? = null,
        minecoinsMax: Long? = null
    ): CategoryMinecraftResponse {
        return client.get(
            path = "/minecraft",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "subscription" to subscription,
            "subscription_length" to subscriptionLength,
            "subscription_period" to subscriptionPeriod,
            "autorenewal" to autorenewal,
            "java" to java,
            "bedrock" to bedrock,
            "dungeons" to dungeons,
            "legends" to legends,
            "change_nickname" to changeNickname,
            "capes[]" to capes,
            "capes_min" to capesMin,
            "capes_max" to capesMax,
            "country[]" to country,
            "not_country[]" to notCountry,
            "hypixel_ban" to hypixelBan,
            "hypixel_skyblock_api_enabled" to hypixelSkyblockApiEnabled,
            "rank_hypixel[]" to rankHypixel,
            "level_hypixel_min" to levelHypixelMin,
            "level_hypixel_max" to levelHypixelMax,
            "achievement_hypixel_min" to achievementHypixelMin,
            "achievement_hypixel_max" to achievementHypixelMax,
            "level_hypixel_skyblock_min" to levelHypixelSkyblockMin,
            "level_hypixel_skyblock_max" to levelHypixelSkyblockMax,
            "net_worth_hypixel_skyblock_min" to netWorthHypixelSkyblockMin,
            "net_worth_hypixel_skyblock_max" to netWorthHypixelSkyblockMax,
            "reg" to reg,
            "reg_period" to regPeriod,
            "last_login_hypixel" to lastLoginHypixel,
            "last_login_hypixel_period" to lastLoginHypixelPeriod,
            "can_change_details" to canChangeDetails,
            "nickname_length_min" to nicknameLengthMin,
            "nickname_length_max" to nicknameLengthMax,
            "hypixel_ban_parsed" to hypixelBanParsed,
            "minecoins_min" to minecoinsMin,
            "minecoins_max" to minecoinsMax
            )
        )
    }

    /**
     * Hytale
     *
     * `GET /hytale`
     */
    suspend fun hytale(
        page: Long? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        title: String? = null,
        orderBy: OrderBy? = null,
        tagId: List<Long>? = null,
        notTagId: List<Long>? = null,
        publicTagId: List<Long>? = null,
        notPublicTagId: List<Long>? = null,
        origin: List<OriginItem>? = null,
        notOrigin: List<OriginItem>? = null,
        userId: Long? = null,
        nsb: Boolean? = null,
        sb: Boolean? = null,
        nsbByMe: Boolean? = null,
        sbByMe: Boolean? = null,
        currency: Currency? = null,
        emailLoginData: Boolean? = null,
        emailProvider: List<EmailProviderItem>? = null,
        notEmailProvider: EmailProviderItem? = null,
        parseSameItemIds: Boolean? = null,
        edition: List<EditionItem>? = null,
        profilesMin: Long? = null,
        profilesMax: Long? = null
    ): CategoryHytaleResponse {
        return client.get(
            path = "/hytale",
            params = mapOf(
            "page" to page,
            "pmin" to pmin,
            "pmax" to pmax,
            "title" to title,
            "order_by" to orderBy,
            "tag_id[]" to tagId,
            "not_tag_id[]" to notTagId,
            "public_tag_id[]" to publicTagId,
            "not_public_tag_id[]" to notPublicTagId,
            "origin[]" to origin,
            "not_origin[]" to notOrigin,
            "user_id" to userId,
            "nsb" to nsb,
            "sb" to sb,
            "nsb_by_me" to nsbByMe,
            "sb_by_me" to sbByMe,
            "currency" to currency,
            "email_login_data" to emailLoginData,
            "email_provider[]" to emailProvider,
            "not_email_provider[]" to notEmailProvider,
            "parse_same_item_ids" to parseSameItemIds,
            "edition[]" to edition,
            "profiles_min" to profilesMin,
            "profiles_max" to profilesMax
            )
        )
    }

}

/**
 * Custom Discounts API service.
 */
class CustomDiscountsService(private val client: LolzteamHttpClient) {

    /**
     * Get Custom Discounts
     *
     * `GET /custom-discounts`
     */
    suspend fun get(): CustomDiscountsGetResponse {
        return client.get(path = "/custom-discounts")
    }

    /**
     * Create Custom Discount
     *
     * `POST /custom-discounts`
     */
    suspend fun create(
        userId: Long,
        categoryId: CategoryId,
        discountPercent: Double,
        minPrice: Double,
        maxPrice: Double? = null,
        currency: Currency? = null
    ): CustomDiscountsCreateResponse {
        return client.post(
            path = "/custom-discounts",
            body = mapOf(
            "user_id" to userId,
            "category_id" to categoryId,
            "discount_percent" to discountPercent,
            "min_price" to minPrice,
            "max_price" to maxPrice,
            "currency" to currency
            )
        )
    }

    /**
     * Edit Custom Discount
     *
     * `PUT /custom-discounts`
     */
    suspend fun edit(
        discountId: Long,
        discountPercent: Double? = null,
        minPrice: Double? = null,
        maxPrice: Double? = null
    ): CustomDiscountsGetResponse {
        return client.put(
            path = "/custom-discounts",
            body = mapOf(
            "discount_id" to discountId,
            "discount_percent" to discountPercent,
            "min_price" to minPrice,
            "max_price" to maxPrice
            )
        )
    }

    /**
     * Delete Custom Discount
     *
     * `DELETE /custom-discounts`
     */
    suspend fun delete(
        discountId: Long
    ): SaveChangesResponse {
        return client.delete(
            path = "/custom-discounts",
            body = mapOf(
            "discount_id" to discountId
            )
        )
    }

}

/**
 * IMAP API service.
 */
class IMAPService(private val client: LolzteamHttpClient) {

    /**
     * Create IMAP Configuration
     *
     * `POST /imap`
     */
    suspend fun create(
        domain: String,
        imapServer: String,
        port: Long,
        secure: Boolean
    ): SaveChangesResponse {
        return client.post(
            path = "/imap",
            body = mapOf(
            "domain" to domain,
            "imap_server" to imapServer,
            "port" to port,
            "secure" to secure
            )
        )
    }

    /**
     * Delete IMAP Configuration
     *
     * `DELETE /imap`
     */
    suspend fun delete(
        domain: String
    ): SaveChangesResponse {
        return client.delete(
            path = "/imap",
            body = mapOf(
            "domain" to domain
            )
        )
    }

}

/**
 * Invoices API service.
 */
class InvoicesService(private val client: LolzteamHttpClient) {

    /**
     * Get Invoice
     *
     * `GET /invoice`
     */
    suspend fun invoiceGet(
        invoiceId: Long? = null,
        paymentId: String? = null
    ): PaymentsInvoiceGetResponse {
        return client.get(
            path = "/invoice",
            params = mapOf(
            "invoice_id" to invoiceId,
            "payment_id" to paymentId
            )
        )
    }

    /**
     * Create Invoice
     *
     * `POST /invoice`
     */
    suspend fun invoiceCreate(
        currency: Currency,
        amount: Double,
        paymentId: String,
        comment: String,
        urlSuccess: String,
        merchantId: Long,
        urlCallback: String? = null,
        requiredTelegramId: Long? = null,
        requiredTelegramUsername: String? = null,
        lifetime: Double? = null,
        additionalData: String? = null,
        isTest: Boolean? = null
    ): PaymentsInvoiceGetResponse {
        return client.post(
            path = "/invoice",
            body = mapOf(
            "currency" to currency,
            "amount" to amount,
            "payment_id" to paymentId,
            "comment" to comment,
            "url_success" to urlSuccess,
            "url_callback" to urlCallback,
            "merchant_id" to merchantId,
            "required_telegram_id" to requiredTelegramId,
            "required_telegram_username" to requiredTelegramUsername,
            "lifetime" to lifetime,
            "additional_data" to additionalData,
            "is_test" to isTest
            )
        )
    }

    /**
     * Get Invoice List
     *
     * `GET /invoice/list`
     */
    suspend fun invoiceList(
        page: Long? = null,
        currency: Currency? = null,
        status: Status? = null,
        amount: Double? = null,
        merchantId: Long? = null
    ): PaymentsInvoiceListResponse {
        return client.get(
            path = "/invoice/list",
            params = mapOf(
            "page" to page,
            "currency" to currency,
            "status" to status,
            "amount" to amount,
            "merchant_id" to merchantId
            )
        )
    }

}

/**
 * Payments API service.
 */
class PaymentsService(private val client: LolzteamHttpClient) {

    /**
     * Get Currency
     *
     * `GET /currency`
     */
    suspend fun currency(): PaymentsCurrencyResponse {
        return client.get(path = "/currency")
    }

    /**
     * Get List Of Balances
     *
     * `GET /balance/exchange`
     */
    suspend fun balanceList(): SaveChangesResponse {
        return client.get(path = "/balance/exchange")
    }

    /**
     * Exchange Balance
     *
     * `POST /balance/exchange`
     */
    suspend fun balanceExchange(
        fromBalance: String,
        toBalance: String,
        amount: Long
    ): SaveChangesResponse {
        return client.post(
            path = "/balance/exchange",
            body = mapOf(
            "from_balance" to fromBalance,
            "to_balance" to toBalance,
            "amount" to amount
            )
        )
    }

    /**
     * Transfer Money
     *
     * `POST /balance/transfer`
     */
    suspend fun transfer(
        amount: Long,
        currency: Currency,
        userId: Long? = null,
        username: String? = null,
        comment: String? = null,
        telegramDeal: Boolean? = null,
        telegramUsername: String? = null,
        transferHold: Boolean? = null,
        holdLengthValue: Long? = null,
        holdLengthOption: HoldLengthOption? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/balance/transfer",
            body = mapOf(
            "user_id" to userId,
            "username" to username,
            "amount" to amount,
            "currency" to currency,
            "comment" to comment,
            "telegram_deal" to telegramDeal,
            "telegram_username" to telegramUsername,
            "transfer_hold" to transferHold,
            "hold_length_value" to holdLengthValue,
            "hold_length_option" to holdLengthOption
            )
        )
    }

    /**
     * Check Transfer Fee
     *
     * `GET /balance/transfer/fee`
     */
    suspend fun fee(
        amount: Double? = null
    ): PaymentsFeeResponse {
        return client.get(
            path = "/balance/transfer/fee",
            params = mapOf(
            "amount" to amount
            )
        )
    }

    /**
     * Cancel Transfer
     *
     * `POST /balance/transfer/cancel`
     */
    suspend fun cancel(
        paymentId: Long
    ): SaveChangesResponse {
        return client.post(
            path = "/balance/transfer/cancel",
            body = mapOf(
            "payment_id" to paymentId
            )
        )
    }

    /**
     * Payments History
     *
     * `GET /user/payments`
     */
    suspend fun history(
        `type`: Type6? = null,
        pmin: Long? = null,
        pmax: Long? = null,
        currency: Currency? = null,
        page: Long? = null,
        operationIdLt: Long? = null,
        receiver: String? = null,
        sender: String? = null,
        isApi: Boolean? = null,
        startDate: String? = null,
        endDate: String? = null,
        wallet: String? = null,
        comment: String? = null,
        isHold: Boolean? = null,
        showPaymentStats: Boolean? = null
    ): PaymentsHistoryResponse {
        return client.get(
            path = "/user/payments",
            params = mapOf(
            "type" to `type`,
            "pmin" to pmin,
            "pmax" to pmax,
            "currency" to currency,
            "page" to page,
            "operation_id_lt" to operationIdLt,
            "receiver" to receiver,
            "sender" to sender,
            "is_api" to isApi,
            "startDate" to startDate,
            "endDate" to endDate,
            "wallet" to wallet,
            "comment" to comment,
            "is_hold" to isHold,
            "show_payment_stats" to showPaymentStats
            )
        )
    }

    /**
     * Get Auto Payments
     *
     * `GET /auto-payments`
     */
    suspend fun list(): AutoPaymentsListResponse {
        return client.get(path = "/auto-payments")
    }

    /**
     * Create Auto Payment
     *
     * `POST /auto-payment`
     */
    suspend fun create(
        usernameReceiver: String,
        day: Day,
        amount: Double,
        secretAnswer: String? = null,
        currency: Currency? = null,
        description: String? = null
    ): AutoPaymentsCreateResponse {
        return client.post(
            path = "/auto-payment",
            body = mapOf(
            "secret_answer" to secretAnswer,
            "username_receiver" to usernameReceiver,
            "day" to day,
            "amount" to amount,
            "currency" to currency,
            "description" to description
            )
        )
    }

    /**
     * Delete Auto Payment
     *
     * `DELETE /auto-payment`
     */
    suspend fun delete(
        autoPaymentId: Long
    ): SaveChangesResponse {
        return client.delete(
            path = "/auto-payment",
            body = mapOf(
            "auto_payment_id" to autoPaymentId
            )
        )
    }

    /**
     * Get Payout Services
     *
     * `GET /balance/payout/services`
     */
    suspend fun payoutServices(): PaymentsPayoutServicesResponse {
        return client.get(path = "/balance/payout/services")
    }

    /**
     * Create Payout
     *
     * `POST /balance/payout`
     */
    suspend fun payout(
        paymentSystem: String,
        wallet: String,
        amount: Double,
        currency: Currency,
        includeFee: Boolean? = null,
        extra: PaymentsPayoutExtra? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/balance/payout",
            body = mapOf(
            "payment_system" to paymentSystem,
            "wallet" to wallet,
            "amount" to amount,
            "currency" to currency,
            "include_fee" to includeFee,
            "extra" to extra
            )
        )
    }

}

/**
 * Profile API service.
 */
class ProfileService(private val client: LolzteamHttpClient) {

    /**
     * Get Profile
     *
     * `GET /me`
     */
    suspend fun get(
        fieldsInclude: List<FieldsIncludeItem>? = null
    ): ProfileGetResponse {
        return client.get(
            path = "/me",
            params = mapOf(
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Edit Market Settings
     *
     * `PUT /me`
     */
    suspend fun edit(
        user: ProfileEditUser? = null,
        option: ProfileEditOption? = null,
        allowAcceptAccounts: List<String>? = null,
        telegramApiId: String? = null,
        telegramApiHash: String? = null,
        telegramDeviceModel: String? = null,
        telegramSystemVersion: String? = null,
        telegramAppVersion: String? = null,
        telegramLangPack: String? = null,
        telegramLangCode: String? = null,
        telegramSystemLangCode: String? = null,
        clearTelegramClient: Boolean? = null
    ): SaveChangesResponse {
        return client.put(
            path = "/me",
            body = mapOf(
            "user" to user,
            "option" to option,
            "allow_accept_accounts" to allowAcceptAccounts,
            "telegram_api_id" to telegramApiId,
            "telegram_api_hash" to telegramApiHash,
            "telegram_device_model" to telegramDeviceModel,
            "telegram_system_version" to telegramSystemVersion,
            "telegram_app_version" to telegramAppVersion,
            "telegram_lang_pack" to telegramLangPack,
            "telegram_lang_code" to telegramLangCode,
            "telegram_system_lang_code" to telegramSystemLangCode,
            "clear_telegram_client" to clearTelegramClient
            )
        )
    }

}

/**
 * Proxy API service.
 */
class ProxyService(private val client: LolzteamHttpClient) {

    /**
     * Get Proxy
     *
     * `GET /proxy`
     */
    suspend fun get(): ProxyGetResponse {
        return client.get(path = "/proxy")
    }

    /**
     * Add Proxy
     *
     * `POST /proxy`
     */
    suspend fun add(
        proxyIp: String? = null,
        proxyPort: Long? = null,
        proxyUser: String? = null,
        proxyPass: String? = null,
        proxyRow: String? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/proxy",
            body = mapOf(
            "proxy_ip" to proxyIp,
            "proxy_port" to proxyPort,
            "proxy_user" to proxyUser,
            "proxy_pass" to proxyPass,
            "proxy_row" to proxyRow
            )
        )
    }

    /**
     * Delete Proxy
     *
     * `DELETE /proxy`
     */
    suspend fun delete(
        proxyId: Long? = null,
        deleteAll: Boolean? = null
    ): SaveChangesResponse {
        return client.delete(
            path = "/proxy",
            body = mapOf(
            "proxy_id" to proxyId,
            "delete_all" to deleteAll
            )
        )
    }

}
