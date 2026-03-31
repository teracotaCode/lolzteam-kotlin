package com.lolzteam.generated.market.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.JsonElement

@Serializable
data class AutoPaymentsCreateResponse(
    @SerialName("status")
    val status: String? = null,

    @SerialName("message")
    val message: String? = null,

    @SerialName("auto_payment_id")
    val autoPaymentId: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class AutoPaymentsListResponse(
    @SerialName("payments")
    val payments: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class BalanceModel(
    @SerialName("balance")
    val balance: String? = null,

    @SerialName("balance_id")
    val balanceId: Long? = null,

    @SerialName("custom_title")
    val customTitle: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("fullTitle")
    val fullTitle: String? = null,

    @SerialName("merchant_id")
    val merchantId: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("type")
    val `type`: String? = null,

    @SerialName("user_id")
    val userId: Long? = null
)

@Serializable
data class BatchResponse(
    @SerialName("jobs")
    val jobs: BatchResponseJobs? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class BatchResponseJobs(
    @SerialName("job_id")
    val jobId: BatchResponseJobsJobId? = null
)

@Serializable
data class BatchResponseJobsJobId(
    @SerialName("_job_result")
    val jobResult: String? = null,

    @SerialName("_job_error")
    val jobError: String? = null
)

@Serializable
data class CartAddResponse(
    @SerialName("success")
    val success: Boolean? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryBattleNetResponse(
    @SerialName("items")
    val items: List<CategoryBattleNetResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryBattleNetResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("battlenet_item_id")
    val battlenetItemId: Long? = null,

    @SerialName("battlenet_balance")
    val battlenetBalance: String? = null,

    @SerialName("battlenet_country")
    val battlenetCountry: String? = null,

    @SerialName("battlenet_last_activity")
    val battlenetLastActivity: Long? = null,

    @SerialName("battlenet_mobile")
    val battlenetMobile: Long? = null,

    @SerialName("battlenet_bans")
    val battlenetBans: String? = null,

    @SerialName("battlenet_can_change_tag")
    val battlenetCanChangeTag: Long? = null,

    @SerialName("battlenet_real_id_enabled")
    val battlenetRealIdEnabled: Long? = null,

    @SerialName("battlenet_change_full_name")
    val battlenetChangeFullName: Long? = null,

    @SerialName("battlenet_parent_control")
    val battlenetParentControl: Long? = null,

    @SerialName("battlenet_converted_balance")
    val battlenetConvertedBalance: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("battlenetGames")
    val battlenetGames: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasOverwatch")
    val hasOverwatch: Boolean? = null,

    @SerialName("battlenetTransactions")
    val battlenetTransactions: List<CategoryBattleNetResponseItemsItemBattlenetTransactionsItem>? = null,

    @SerialName("displayConvertedBalance")
    val displayConvertedBalance: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryBattleNetResponseItemsItemBattlenetTransactionsItem(
    @SerialName("date")
    val date: Long? = null,

    @SerialName("productTitle")
    val productTitle: String? = null,

    @SerialName("formattedTotal")
    val formattedTotal: String? = null,

    @SerialName("total")
    val total: String? = null
)

@Serializable
data class CategoryChatGPTResponse(
    @SerialName("items")
    val items: List<CategoryChatGPTResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryChatGPTResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("chatgpt_item_id")
    val chatgptItemId: Long? = null,

    @SerialName("chatgpt_country")
    val chatgptCountry: String? = null,

    @SerialName("chatgpt_register_date")
    val chatgptRegisterDate: Long? = null,

    @SerialName("chatgpt_phone")
    val chatgptPhone: Long? = null,

    @SerialName("chatgpt_subscription")
    val chatgptSubscription: String? = null,

    @SerialName("chatgpt_subscription_ends")
    val chatgptSubscriptionEnds: Long? = null,

    @SerialName("chatgpt_subscription_auto_renew")
    val chatgptSubscriptionAutoRenew: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewItemViews")
    val canViewItemViews: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("copyFormatData")
    val copyFormatData: CategoryChatGPTResponseItemsItemCopyFormatData? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("isPersonalAccount")
    val isPersonalAccount: Boolean? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("priceWithSellerFeeLabel")
    val priceWithSellerFeeLabel: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("gptSubType")
    val gptSubType: String? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("canChangeEmailPassword")
    val canChangeEmailPassword: Boolean? = null,

    @SerialName("uniqueKeyExists")
    val uniqueKeyExists: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryChatGPTResponseItemsItemCopyFormatData(
    @SerialName("title_link")
    val titleLink: String? = null
)

@Serializable
data class CategoryDiscordResponse(
    @SerialName("items")
    val items: List<CategoryDiscordResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryDiscordResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("discord_item_id")
    val discordItemId: Long? = null,

    @SerialName("discord_chat_count")
    val discordChatCount: Long? = null,

    @SerialName("discord_verified")
    val discordVerified: Long? = null,

    @SerialName("discord_condition")
    val discordCondition: String? = null,

    @SerialName("discord_gifts")
    val discordGifts: Long? = null,

    @SerialName("discord_billing")
    val discordBilling: Long? = null,

    @SerialName("discord_register_date")
    val discordRegisterDate: Long? = null,

    @SerialName("discord_locale")
    val discordLocale: String? = null,

    @SerialName("discord_nitro_end_date")
    val discordNitroEndDate: Long? = null,

    @SerialName("discord_available_boosts")
    val discordAvailableBoosts: Long? = null,

    @SerialName("discord_nitro_type")
    val discordNitroType: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("discord_admin_members_count")
    val discordAdminMembersCount: Long? = null,

    @SerialName("discord_admin_servers_count")
    val discordAdminServersCount: Long? = null,

    @SerialName("discord_admin_servers")
    val discordAdminServers: String? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("discordAccountConditionLabel")
    val discordAccountConditionLabel: String? = null,

    @SerialName("discordLocaleTitle")
    val discordLocaleTitle: String? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryEAResponse(
    @SerialName("items")
    val items: List<CategoryEAResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryEAResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("ea_item_id")
    val eaItemId: Long? = null,

    @SerialName("ea_id")
    val eaId: Long? = null,

    @SerialName("ea_country")
    val eaCountry: String? = null,

    @SerialName("ea_games")
    val eaGames: CategoryEAResponseItemsItemEaGames? = null,

    @SerialName("ea_game_count")
    val eaGameCount: Long? = null,

    @SerialName("ea_last_activity")
    val eaLastActivity: Long? = null,

    @SerialName("ea_al_level")
    val eaAlLevel: Long? = null,

    @SerialName("ea_al_rank_score")
    val eaAlRankScore: Long? = null,

    @SerialName("ea_subscription")
    val eaSubscription: String? = null,

    @SerialName("ea_subscription_end_date")
    val eaSubscriptionEndDate: Long? = null,

    @SerialName("ea_username")
    val eaUsername: String? = null,

    @SerialName("ea_xbox_connected")
    val eaXboxConnected: Long? = null,

    @SerialName("ea_steam_connected")
    val eaSteamConnected: Long? = null,

    @SerialName("ea_psn_connected")
    val eaPsnConnected: Long? = null,

    @SerialName("ea_bans")
    val eaBans: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("ea_has_ban")
    val eaHasBan: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryEAResponseItemsItemEaGames(
    @SerialName("apex-legends")
    val apexLegends: CategoryEAResponseItemsItemEaGamesApexLegends? = null
)

@Serializable
data class CategoryEAResponseItemsItemEaGamesApexLegends(
    @SerialName("game_id")
    val gameId: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("total_played")
    val totalPlayed: Long? = null,

    @SerialName("img")
    val img: String? = null
)

@Serializable
data class CategoryEpicGamesResponse(
    @SerialName("items")
    val items: List<CategoryEpicGamesResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryEpicGamesResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("eg_item_id")
    val egItemId: Long? = null,

    @SerialName("eg_country")
    val egCountry: String? = null,

    @SerialName("eg_code_redemption_history")
    val egCodeRedemptionHistory: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("eg_coupons")
    val egCoupons: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("eg_games")
    val egGames: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("eg_change_email")
    val egChangeEmail: Long? = null,

    @SerialName("eg_can_update_display_name")
    val egCanUpdateDisplayName: Long? = null,

    @SerialName("eg_last_activity")
    val egLastActivity: Long? = null,

    @SerialName("eg_payment_methods")
    val egPaymentMethods: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("eg_rl_purchases")
    val egRlPurchases: Long? = null,

    @SerialName("eg_username")
    val egUsername: String? = null,

    @SerialName("eg_rewards_balance")
    val egRewardsBalance: Long? = null,

    @SerialName("eg_rewards_expiration_date")
    val egRewardsExpirationDate: Long? = null,

    @SerialName("eg_next_change_email_date")
    val egNextChangeEmailDate: Long? = null,

    @SerialName("eg_game_count")
    val egGameCount: Long? = null,

    @SerialName("eg_balance")
    val egBalance: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("egTransactions")
    val egTransactions: List<CategoryFortniteResponseItemsItemFortniteTransactionsItem>? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryEscapeFromTarkovResponse(
    @SerialName("items")
    val items: List<CategoryEscapeFromTarkovResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryEscapeFromTarkovResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("tarkov_item_id")
    val tarkovItemId: Long? = null,

    @SerialName("tarkov_game_version")
    val tarkovGameVersion: String? = null,

    @SerialName("tarkov_register_date")
    val tarkovRegisterDate: Long? = null,

    @SerialName("tarkov_level")
    val tarkovLevel: Long? = null,

    @SerialName("tarkov_exp")
    val tarkovExp: Long? = null,

    @SerialName("tarkov_last_activity")
    val tarkovLastActivity: Long? = null,

    @SerialName("tarkov_side")
    val tarkovSide: String? = null,

    @SerialName("tarkov_rubles")
    val tarkovRubles: Long? = null,

    @SerialName("tarkov_secured_container")
    val tarkovSecuredContainer: String? = null,

    @SerialName("tarkov_euros")
    val tarkovEuros: Long? = null,

    @SerialName("tarkov_dollars")
    val tarkovDollars: Long? = null,

    @SerialName("tarkov_kd")
    val tarkovKd: Long? = null,

    @SerialName("tarkov_deaths")
    val tarkovDeaths: Long? = null,

    @SerialName("tarkov_kills")
    val tarkovKills: Long? = null,

    @SerialName("tarkov_sessions")
    val tarkovSessions: Long? = null,

    @SerialName("tarkov_region")
    val tarkovRegion: String? = null,

    @SerialName("tarkov_total_in_game")
    val tarkovTotalInGame: Long? = null,

    @SerialName("tarkov_mail_forwarding")
    val tarkovMailForwarding: Long? = null,

    @SerialName("tarkov_username")
    val tarkovUsername: String? = null,

    @SerialName("tarkov_purchase_date")
    val tarkovPurchaseDate: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("tarkovRegionPhrase")
    val tarkovRegionPhrase: String? = null,

    @SerialName("tarkovGameVersionPhrase")
    val tarkovGameVersionPhrase: String? = null,

    @SerialName("accountDomain")
    val accountDomain: String? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryFortniteResponse(
    @SerialName("items")
    val items: List<CategoryFortniteResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryFortniteResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("fortnite_item_id")
    val fortniteItemId: Long? = null,

    @SerialName("fortnite_platform")
    val fortnitePlatform: String? = null,

    @SerialName("fortnite_register_date")
    val fortniteRegisterDate: Long? = null,

    @SerialName("fortnite_last_activity")
    val fortniteLastActivity: Long? = null,

    @SerialName("fortnite_book_level")
    val fortniteBookLevel: Long? = null,

    @SerialName("fortnite_lifetime_wins")
    val fortniteLifetimeWins: Long? = null,

    @SerialName("fortnite_level")
    val fortniteLevel: Long? = null,

    @SerialName("fortnite_season_num")
    val fortniteSeasonNum: Long? = null,

    @SerialName("fortnite_books_purchased")
    val fortniteBooksPurchased: Long? = null,

    @SerialName("fortnite_balance")
    val fortniteBalance: Long? = null,

    @SerialName("fortnite_skin_count")
    val fortniteSkinCount: Long? = null,

    @SerialName("fortnite_change_email")
    val fortniteChangeEmail: Long? = null,

    @SerialName("fortnite_rl_purchases")
    val fortniteRlPurchases: Long? = null,

    @SerialName("fortnite_next_change_email_date")
    val fortniteNextChangeEmailDate: Long? = null,

    @SerialName("fortnite_last_trans_date")
    val fortniteLastTransDate: Long? = null,

    @SerialName("fortnite_xbox_linkable")
    val fortniteXboxLinkable: Long? = null,

    @SerialName("fortnite_psn_linkable")
    val fortnitePsnLinkable: Long? = null,

    @SerialName("fortnite_shop_skins_count")
    val fortniteShopSkinsCount: Long? = null,

    @SerialName("fortnite_shop_pickaxes_count")
    val fortniteShopPickaxesCount: Long? = null,

    @SerialName("fortnite_shop_dances_count")
    val fortniteShopDancesCount: Long? = null,

    @SerialName("fortnite_shop_gliders_count")
    val fortniteShopGlidersCount: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("fortniteSkins")
    val fortniteSkins: List<CategoryFortniteResponseItemsItemFortniteSkinsItem>? = null,

    @SerialName("fortnitePickaxe")
    val fortnitePickaxe: List<CategoryFortniteResponseItemsItemFortniteSkinsItem>? = null,

    @SerialName("fortniteDance")
    val fortniteDance: List<CategoryFortniteResponseItemsItemFortniteSkinsItem>? = null,

    @SerialName("fortniteGliders")
    val fortniteGliders: List<CategoryFortniteResponseItemsItemFortniteSkinsItem>? = null,

    @SerialName("fortnite_pickaxe_count")
    val fortnitePickaxeCount: Long? = null,

    @SerialName("fortnite_dance_count")
    val fortniteDanceCount: Long? = null,

    @SerialName("fortnite_glider_count")
    val fortniteGliderCount: Long? = null,

    @SerialName("fortnitePastSeasons")
    val fortnitePastSeasons: List<CategoryFortniteResponseItemsItemFortnitePastSeasonsItem>? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("fortniteTransactions")
    val fortniteTransactions: List<CategoryFortniteResponseItemsItemFortniteTransactionsItem>? = null,

    @SerialName("domain")
    val domain: String? = null,

    @SerialName("shopCounts")
    val shopCounts: CategoryFortniteResponseItemsItemShopCounts? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryFortniteResponseItemsItemFortnitePastSeasonsItem(
    @SerialName("numWins")
    val numWins: Long? = null,

    @SerialName("seasonXp")
    val seasonXp: Long? = null,

    @SerialName("purchasedVIP")
    val purchasedVIP: Boolean? = null,

    @SerialName("survivorPrestige")
    val survivorPrestige: Long? = null,

    @SerialName("seasonLevel")
    val seasonLevel: Long? = null,

    @SerialName("numLowBracket")
    val numLowBracket: Long? = null,

    @SerialName("bookLevel")
    val bookLevel: Long? = null,

    @SerialName("numRoyalRoyales")
    val numRoyalRoyales: Long? = null,

    @SerialName("seasonNumber")
    val seasonNumber: Long? = null,

    @SerialName("survivorTier")
    val survivorTier: Long? = null,

    @SerialName("numHighBracket")
    val numHighBracket: Long? = null
)

@Serializable
data class CategoryFortniteResponseItemsItemFortniteSkinsItem(
    @SerialName("id")
    val id: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("rarity")
    val rarity: String? = null,

    @SerialName("type")
    val `type`: String? = null,

    @SerialName("from_shop")
    val fromShop: Long? = null
)

@Serializable
data class CategoryFortniteResponseItemsItemFortniteTransactionsItem(
    @SerialName("date")
    val date: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("presentmentTotal")
    val presentmentTotal: String? = null,

    @SerialName("orderType")
    val orderType: String? = null
)

@Serializable
data class CategoryFortniteResponseItemsItemShopCounts(
    @SerialName("shopSkinsCount")
    val shopSkinsCount: Long? = null,

    @SerialName("shopPickaxesCount")
    val shopPickaxesCount: Long? = null,

    @SerialName("shopDancesCount")
    val shopDancesCount: Long? = null,

    @SerialName("shopGlidersCount")
    val shopGlidersCount: Long? = null
)

@Serializable
data class CategoryGamesResponse(
    @SerialName("games")
    val games: List<CategoryGamesResponseGamesItem>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryGamesResponseGamesItem(
    @SerialName("app_id")
    val appId: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("abbr")
    val abbr: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("img")
    val img: String? = null,

    @SerialName("url")
    val url: String? = null,

    @SerialName("ru")
    val ru: String? = null
)

@Serializable
data class CategoryGiftsResponse(
    @SerialName("items")
    val items: List<CategoryGiftsResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryGiftsResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("gifts_item_id")
    val giftsItemId: Long? = null,

    @SerialName("gifts_service")
    val giftsService: String? = null,

    @SerialName("gifts_duration")
    val giftsDuration: Long? = null,

    @SerialName("gifts_type")
    val giftsType: String? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("giftsSubscriptionName")
    val giftsSubscriptionName: String? = null,

    @SerialName("giftsServiceName")
    val giftsServiceName: String? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryHytaleResponse(
    @SerialName("items")
    val items: List<CategoryHytaleResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryHytaleResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("pending_deletion_date")
    val pendingDeletionDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("auto_bump_period")
    val autoBumpPeriod: Long? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("discount")
    val discount: Boolean? = null,

    @SerialName("hytale_item_id")
    val hytaleItemId: Long? = null,

    @SerialName("hytale_profiles")
    val hytaleProfiles: Long? = null,

    @SerialName("hytale_edition")
    val hytaleEdition: String? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("max_discount_percent")
    val maxDiscountPercent: Long? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("category")
    val category: CategoryHytaleResponseItemsItemCategory? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canViewTempEmail")
    val canViewTempEmail: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewItemViews")
    val canViewItemViews: Boolean? = null,

    @SerialName("canManagePublicTag")
    val canManagePublicTag: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("copyFormatData")
    val copyFormatData: CategoryChatGPTResponseItemsItemCopyFormatData? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canNotBumpItemReason")
    val canNotBumpItemReason: String? = null,

    @SerialName("buyer")
    val buyer: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isPersonalAccount")
    val isPersonalAccount: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("priceWithSellerFeeLabel")
    val priceWithSellerFeeLabel: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItem")
    val canResellItem: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("imagePreviewLinks")
    val imagePreviewLinks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("canChangeEmailPassword")
    val canChangeEmailPassword: Boolean? = null,

    @SerialName("uniqueKeyExists")
    val uniqueKeyExists: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("public_tag")
    val publicTag: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryHytaleResponseItemsItemCategory(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("category_title")
    val categoryTitle: String? = null,

    @SerialName("category_name")
    val categoryName: String? = null,

    @SerialName("category_url")
    val categoryUrl: String? = null
)

@Serializable
data class CategoryInstagramResponse(
    @SerialName("items")
    val items: List<CategoryInstagramResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryInstagramResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("instagram_item_id")
    val instagramItemId: Long? = null,

    @SerialName("instagram_id")
    val instagramId: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("instagram_follower_count")
    val instagramFollowerCount: Long? = null,

    @SerialName("instagram_follow_count")
    val instagramFollowCount: Long? = null,

    @SerialName("instagram_post_count")
    val instagramPostCount: Long? = null,

    @SerialName("instagram_country")
    val instagramCountry: String? = null,

    @SerialName("instagram_username")
    val instagramUsername: String? = null,

    @SerialName("instagram_mobile")
    val instagramMobile: Long? = null,

    @SerialName("instagram_register_date")
    val instagramRegisterDate: Long? = null,

    @SerialName("instagram_has_cookies")
    val instagramHasCookies: Long? = null,

    @SerialName("instagram_login_without_cookies")
    val instagramLoginWithoutCookies: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryListResponse(
    @SerialName("category")
    val category: CategoryListResponseCategory? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryListResponseCategory(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("category_title")
    val categoryTitle: String? = null,

    @SerialName("category_description")
    val categoryDescription: String? = null,

    @SerialName("links")
    val links: CategoryListResponseCategoryLinks? = null
)

@Serializable
data class CategoryListResponseCategoryLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("sub-categories")
    val subCategories: String? = null,

    @SerialName("sub-forums")
    val subForums: String? = null
)

@Serializable
data class CategoryMihoyoResponse(
    @SerialName("items")
    val items: List<CategoryMihoyoResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("mihoyo_item_id")
    val mihoyoItemId: Long? = null,

    @SerialName("mihoyo_id")
    val mihoyoId: Long? = null,

    @SerialName("mihoyo_email")
    val mihoyoEmail: Long? = null,

    @SerialName("mihoyo_has_linked_accounts")
    val mihoyoHasLinkedAccounts: Long? = null,

    @SerialName("mihoyo_region")
    val mihoyoRegion: String? = null,

    @SerialName("mihoyo_last_activity")
    val mihoyoLastActivity: Long? = null,

    @SerialName("mihoyo_genshin_level")
    val mihoyoGenshinLevel: Long? = null,

    @SerialName("mihoyo_genshin_character_count")
    val mihoyoGenshinCharacterCount: Long? = null,

    @SerialName("mihoyo_genshin_achievement_count")
    val mihoyoGenshinAchievementCount: Long? = null,

    @SerialName("mihoyo_genshin_abyss_process")
    val mihoyoGenshinAbyssProcess: String? = null,

    @SerialName("mihoyo_genshin_legendary_characters_count")
    val mihoyoGenshinLegendaryCharactersCount: Long? = null,

    @SerialName("mihoyo_genshin_constellations_count")
    val mihoyoGenshinConstellationsCount: Long? = null,

    @SerialName("mihoyo_genshin_legendary_weapons_count")
    val mihoyoGenshinLegendaryWeaponsCount: Long? = null,

    @SerialName("mihoyo_genshin_activity_days")
    val mihoyoGenshinActivityDays: Long? = null,

    @SerialName("mihoyo_genshin_currency")
    val mihoyoGenshinCurrency: Long? = null,

    @SerialName("mihoyo_honkai_level")
    val mihoyoHonkaiLevel: Long? = null,

    @SerialName("mihoyo_honkai_character_count")
    val mihoyoHonkaiCharacterCount: Long? = null,

    @SerialName("mihoyo_honkai_achievement_count")
    val mihoyoHonkaiAchievementCount: Long? = null,

    @SerialName("mihoyo_honkai_abyss_process")
    val mihoyoHonkaiAbyssProcess: String? = null,

    @SerialName("mihoyo_honkai_legendary_characters_count")
    val mihoyoHonkaiLegendaryCharactersCount: Long? = null,

    @SerialName("mihoyo_honkai_eidolons_count")
    val mihoyoHonkaiEidolonsCount: Long? = null,

    @SerialName("mihoyo_honkai_legendary_weapons_count")
    val mihoyoHonkaiLegendaryWeaponsCount: Long? = null,

    @SerialName("mihoyo_honkai_activity_days")
    val mihoyoHonkaiActivityDays: Long? = null,

    @SerialName("mihoyo_honkai_currency")
    val mihoyoHonkaiCurrency: Long? = null,

    @SerialName("mihoyo_zenless_level")
    val mihoyoZenlessLevel: Long? = null,

    @SerialName("mihoyo_zenless_character_count")
    val mihoyoZenlessCharacterCount: Long? = null,

    @SerialName("mihoyo_zenless_achievement_count")
    val mihoyoZenlessAchievementCount: Long? = null,

    @SerialName("mihoyo_zenless_abyss_process")
    val mihoyoZenlessAbyssProcess: String? = null,

    @SerialName("mihoyo_zenless_legendary_characters_count")
    val mihoyoZenlessLegendaryCharactersCount: Long? = null,

    @SerialName("mihoyo_zenless_cinemas_count")
    val mihoyoZenlessCinemasCount: Long? = null,

    @SerialName("mihoyo_zenless_legendary_weapons_count")
    val mihoyoZenlessLegendaryWeaponsCount: Long? = null,

    @SerialName("mihoyo_zenless_activity_days")
    val mihoyoZenlessActivityDays: Long? = null,

    @SerialName("mihoyo_zenless_currency")
    val mihoyoZenlessCurrency: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("mihoyoRegionPhrase")
    val mihoyoRegionPhrase: String? = null,

    @SerialName("mihoyoLinkedAccounts")
    val mihoyoLinkedAccounts: CategoryMihoyoResponseItemsItemMihoyoLinkedAccounts? = null,

    @SerialName("mihoyoLinkedAccountsString")
    val mihoyoLinkedAccountsString: String? = null,

    @SerialName("honkaiCharacters")
    val honkaiCharacters: List<CategoryMihoyoResponseItemsItemHonkaiCharactersItem>? = null,

    @SerialName("genshinCharacters")
    val genshinCharacters: List<CategoryMihoyoResponseItemsItemGenshinCharactersItem>? = null,

    @SerialName("zenlessCharacters")
    val zenlessCharacters: List<CategoryMihoyoResponseItemsItemZenlessCharactersItem>? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemGenshinCharactersItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("image")
    val image: String? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("element")
    val element: String? = null,

    @SerialName("fetter")
    val fetter: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("weapon")
    val weapon: CategoryMihoyoResponseItemsItemGenshinCharactersItemWeapon? = null,

    @SerialName("reliquaries")
    val reliquaries: List<CategoryMihoyoResponseItemsItemGenshinCharactersItemReliquariesItem>? = null,

    @SerialName("actived_constellation_num")
    val activedConstellationNum: Long? = null,

    @SerialName("costumes")
    val costumes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("external")
    val external: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("background")
    val background: String? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemGenshinCharactersItemReliquariesItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("pos")
    val pos: Long? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("pos_name")
    val posName: String? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemGenshinCharactersItemWeapon(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("type")
    val `type`: Long? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("promote_level")
    val promoteLevel: Long? = null,

    @SerialName("type_name")
    val typeName: String? = null,

    @SerialName("desc")
    val desc: String? = null,

    @SerialName("affix_level")
    val affixLevel: Long? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemHonkaiCharactersItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("element")
    val element: String? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("rank")
    val rank: Long? = null,

    @SerialName("image")
    val image: String? = null,

    @SerialName("equip")
    val equip: CategoryMihoyoResponseItemsItemHonkaiCharactersItemEquip? = null,

    @SerialName("relics")
    val relics: List<CategoryMihoyoResponseItemsItemHonkaiCharactersItemRelicsItem>? = null,

    @SerialName("ornaments")
    val ornaments: List<CategoryMihoyoResponseItemsItemHonkaiCharactersItemRelicsItem>? = null,

    @SerialName("base_type")
    val baseType: Long? = null,

    @SerialName("figure_path")
    val figurePath: String? = null,

    @SerialName("elementImage")
    val elementImage: String? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemHonkaiCharactersItemEquip(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("rank")
    val rank: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("desc")
    val desc: String? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("rarity")
    val rarity: Long? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemHonkaiCharactersItemRelicsItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("pos")
    val pos: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("desc")
    val desc: String? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("main_property")
    val mainProperty: CategoryMihoyoResponseItemsItemHonkaiCharactersItemRelicsItemMainProperty? = null,

    @SerialName("properties")
    val properties: List<CategoryMihoyoResponseItemsItemHonkaiCharactersItemRelicsItemMainProperty>? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemHonkaiCharactersItemRelicsItemMainProperty(
    @SerialName("property_type")
    val propertyType: Long? = null,

    @SerialName("value")
    val value: String? = null,

    @SerialName("times")
    val times: Long? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemMihoyoLinkedAccounts(
    @SerialName("links")
    val links: List<String>? = null,

    @SerialName("legacy")
    val legacy: Boolean? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemZenlessCharactersItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("name_mi18n")
    val nameMi18n: String? = null,

    @SerialName("full_name_mi18n")
    val fullNameMi18n: String? = null,

    @SerialName("element_type")
    val elementType: Long? = null,

    @SerialName("camp_name_mi18n")
    val campNameMi18n: String? = null,

    @SerialName("avatar_profession")
    val avatarProfession: Long? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("weapon")
    val weapon: CategoryMihoyoResponseItemsItemZenlessCharactersItemWeapon? = null,

    @SerialName("rank")
    val rank: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("rarityIcon")
    val rarityIcon: String? = null,

    @SerialName("elementIcon")
    val elementIcon: String? = null,

    @SerialName("professionIcon")
    val professionIcon: String? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemZenlessCharactersItemWeapon(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("level")
    val level: Long? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("star")
    val star: Long? = null,

    @SerialName("icon")
    val icon: String? = null,

    @SerialName("rarity")
    val rarity: Long? = null,

    @SerialName("properties")
    val properties: List<CategoryMihoyoResponseItemsItemZenlessCharactersItemWeaponPropertiesItem>? = null,

    @SerialName("main_properties")
    val mainProperties: List<CategoryMihoyoResponseItemsItemZenlessCharactersItemWeaponPropertiesItem>? = null,

    @SerialName("talent_title")
    val talentTitle: String? = null,

    @SerialName("talent_content")
    val talentContent: String? = null,

    @SerialName("profession")
    val profession: Long? = null,

    @SerialName("starIcon")
    val starIcon: String? = null,

    @SerialName("rarityIcon")
    val rarityIcon: String? = null
)

@Serializable
data class CategoryMihoyoResponseItemsItemZenlessCharactersItemWeaponPropertiesItem(
    @SerialName("property_name")
    val propertyName: String? = null,

    @SerialName("property_id")
    val propertyId: Long? = null,

    @SerialName("base")
    val base: String? = null
)

@Serializable
data class CategoryMinecraftResponse(
    @SerialName("items")
    val items: List<CategoryMinecraftResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryMinecraftResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("minecraft_item_id")
    val minecraftItemId: Long? = null,

    @SerialName("minecraft_id")
    val minecraftId: String? = null,

    @SerialName("minecraft_nickname")
    val minecraftNickname: String? = null,

    @SerialName("minecraft_country")
    val minecraftCountry: String? = null,

    @SerialName("minecraft_skin")
    val minecraftSkin: String? = null,

    @SerialName("minecraft_java")
    val minecraftJava: Long? = null,

    @SerialName("minecraft_bedrock")
    val minecraftBedrock: Long? = null,

    @SerialName("minecraft_can_change_nickname")
    val minecraftCanChangeNickname: Long? = null,

    @SerialName("minecraft_created_at")
    val minecraftCreatedAt: Long? = null,

    @SerialName("minecraft_hypixel_rank")
    val minecraftHypixelRank: String? = null,

    @SerialName("minecraft_hypixel_level")
    val minecraftHypixelLevel: Long? = null,

    @SerialName("minecraft_hypixel_achievement")
    val minecraftHypixelAchievement: Long? = null,

    @SerialName("minecraft_hypixel_last_login")
    val minecraftHypixelLastLogin: Long? = null,

    @SerialName("minecraft_hypixel_ban")
    val minecraftHypixelBan: Long? = null,

    @SerialName("minecraft_hypixel_ban_reason")
    val minecraftHypixelBanReason: String? = null,

    @SerialName("minecraft_hypixel_skyblock_level")
    val minecraftHypixelSkyblockLevel: Long? = null,

    @SerialName("minecraft_hypixel_skyblock_net_worth")
    val minecraftHypixelSkyblockNetWorth: Long? = null,

    @SerialName("minecraft_dungeons")
    val minecraftDungeons: Long? = null,

    @SerialName("minecraft_legends")
    val minecraftLegends: Long? = null,

    @SerialName("minecraft_capes_count")
    val minecraftCapesCount: Long? = null,

    @SerialName("minecraft_capes")
    val minecraftCapes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("minecraft_subscription_name")
    val minecraftSubscriptionName: String? = null,

    @SerialName("minecraft_subscription_ends")
    val minecraftSubscriptionEnds: Long? = null,

    @SerialName("minecraft_subscription_auto_renew")
    val minecraftSubscriptionAutoRenew: Long? = null,

    @SerialName("minecraft_email_reset_date")
    val minecraftEmailResetDate: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("minecraftHasPaidLicense")
    val minecraftHasPaidLicense: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryParamsResponse(
    @SerialName("category")
    val category: CategoryParamsResponseCategory? = null,

    @SerialName("params")
    val params: List<CategoryParamsResponseParamsItem>? = null,

    @SerialName("base_params")
    val baseParams: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryParamsResponseCategory(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("sub_category_id")
    val subCategoryId: Long? = null,

    @SerialName("category_order")
    val categoryOrder: Long? = null,

    @SerialName("category_title")
    val categoryTitle: String? = null,

    @SerialName("category_name")
    val categoryName: String? = null,

    @SerialName("category_url")
    val categoryUrl: String? = null,

    @SerialName("category_description_html")
    val categoryDescriptionHtml: String? = null,

    @SerialName("category_login_url")
    val categoryLoginUrl: String? = null,

    @SerialName("add_item_available")
    val addItemAvailable: Long? = null,

    @SerialName("mass_upload_item_available")
    val massUploadItemAvailable: Long? = null,

    @SerialName("has_guarantee")
    val hasGuarantee: Long? = null,

    @SerialName("has_account_link")
    val hasAccountLink: Long? = null,

    @SerialName("require_temp_email")
    val requireTempEmail: Long? = null,

    @SerialName("recovery_link")
    val recoveryLink: String? = null,

    @SerialName("check_button_enabled")
    val checkButtonEnabled: Long? = null,

    @SerialName("checker_enabled")
    val checkerEnabled: Long? = null,

    @SerialName("support_personal_proxy")
    val supportPersonalProxy: Long? = null,

    @SerialName("support_email_login_data")
    val supportEmailLoginData: Long? = null,

    @SerialName("require_email_login_data")
    val requireEmailLoginData: Long? = null,

    @SerialName("display_in_list")
    val displayInList: Long? = null,

    @SerialName("category_description_html_en")
    val categoryDescriptionHtmlEn: String? = null,

    @SerialName("category_h1_html_en")
    val categoryH1HtmlEn: String? = null,

    @SerialName("account_price_min")
    val accountPriceMin: Long? = null,

    @SerialName("require_video_recording")
    val requireVideoRecording: Long? = null,

    @SerialName("top_queries")
    val topQueries: String? = null,

    @SerialName("require_eld_for_native_accs")
    val requireEldForNativeAccs: Long? = null,

    @SerialName("can_be_resold")
    val canBeResold: Long? = null,

    @SerialName("support_temp_email")
    val supportTempEmail: Long? = null,

    @SerialName("cookies")
    val cookies: String? = null,

    @SerialName("login_type")
    val loginType: String? = null,

    @SerialName("guest_hidden")
    val guestHidden: Long? = null,

    @SerialName("available_temp_email")
    val availableTempEmail: Long? = null,

    @SerialName("resale_duration_limit_days")
    val resaleDurationLimitDays: Long? = null,

    @SerialName("buy_without_validation")
    val buyWithoutValidation: Long? = null,

    @SerialName("max_invalid_upload_tries")
    val maxInvalidUploadTries: Long? = null
)

@Serializable
data class CategoryParamsResponseParamsItem(
    @SerialName("name")
    val name: String? = null,

    @SerialName("input")
    val input: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("values")
    val values: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class CategoryRiotResponse(
    @SerialName("items")
    val items: List<CategoryRiotResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryRiotResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("riot_item_id")
    val riotItemId: Long? = null,

    @SerialName("riot_id")
    val riotId: String? = null,

    @SerialName("riot_account_verified")
    val riotAccountVerified: Long? = null,

    @SerialName("riot_email_verified")
    val riotEmailVerified: Long? = null,

    @SerialName("riot_country")
    val riotCountry: String? = null,

    @SerialName("riot_password_change")
    val riotPasswordChange: Long? = null,

    @SerialName("riot_phone_verified")
    val riotPhoneVerified: Long? = null,

    @SerialName("riot_last_activity")
    val riotLastActivity: Long? = null,

    @SerialName("riot_valorant_wallet_vp")
    val riotValorantWalletVp: Long? = null,

    @SerialName("riot_valorant_wallet_rp")
    val riotValorantWalletRp: Long? = null,

    @SerialName("riot_valorant_wallet_fa")
    val riotValorantWalletFa: Long? = null,

    @SerialName("riot_valorant_level")
    val riotValorantLevel: Long? = null,

    @SerialName("riot_username")
    val riotUsername: String? = null,

    @SerialName("riot_valorant_rank")
    val riotValorantRank: Long? = null,

    @SerialName("riot_valorant_region")
    val riotValorantRegion: String? = null,

    @SerialName("riot_valorant_skin_count")
    val riotValorantSkinCount: Long? = null,

    @SerialName("riot_valorant_agent_count")
    val riotValorantAgentCount: Long? = null,

    @SerialName("riot_valorant_previous_rank")
    val riotValorantPreviousRank: Long? = null,

    @SerialName("riot_valorant_last_rank")
    val riotValorantLastRank: Long? = null,

    @SerialName("riot_valorant_rank_type")
    val riotValorantRankType: String? = null,

    @SerialName("riot_valorant_inventory_value")
    val riotValorantInventoryValue: Long? = null,

    @SerialName("riot_valorant_knife")
    val riotValorantKnife: Long? = null,

    @SerialName("riot_lol_region")
    val riotLolRegion: String? = null,

    @SerialName("riot_lol_skin_count")
    val riotLolSkinCount: Long? = null,

    @SerialName("riot_lol_champion_count")
    val riotLolChampionCount: Long? = null,

    @SerialName("riot_lol_level")
    val riotLolLevel: Long? = null,

    @SerialName("riot_lol_wallet_blue")
    val riotLolWalletBlue: Long? = null,

    @SerialName("riot_lol_wallet_orange")
    val riotLolWalletOrange: Long? = null,

    @SerialName("riot_lol_wallet_mythic")
    val riotLolWalletMythic: Long? = null,

    @SerialName("riot_lol_wallet_riot")
    val riotLolWalletRiot: Long? = null,

    @SerialName("riot_lol_rank")
    val riotLolRank: String? = null,

    @SerialName("riot_lol_rank_win_rate")
    val riotLolRankWinRate: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("valorantRegionPhrase")
    val valorantRegionPhrase: String? = null,

    @SerialName("valorantRankTitle")
    val valorantRankTitle: String? = null,

    @SerialName("valorantRankImgPath")
    val valorantRankImgPath: String? = null,

    @SerialName("valorantPreviousRankTitle")
    val valorantPreviousRankTitle: String? = null,

    @SerialName("valorantLastRankTitle")
    val valorantLastRankTitle: String? = null,

    @SerialName("lolRegionPhrase")
    val lolRegionPhrase: String? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("valorantInventory")
    val valorantInventory: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("lolInventory")
    val lolInventory: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryRobloxResponse(
    @SerialName("items")
    val items: List<CategoryRobloxResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryRobloxResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("roblox_item_id")
    val robloxItemId: Long? = null,

    @SerialName("roblox_id")
    val robloxId: Long? = null,

    @SerialName("roblox_email_verified")
    val robloxEmailVerified: Long? = null,

    @SerialName("roblox_robux")
    val robloxRobux: Long? = null,

    @SerialName("roblox_username")
    val robloxUsername: String? = null,

    @SerialName("roblox_country")
    val robloxCountry: String? = null,

    @SerialName("roblox_register_date")
    val robloxRegisterDate: Long? = null,

    @SerialName("roblox_friends")
    val robloxFriends: Long? = null,

    @SerialName("roblox_followers")
    val robloxFollowers: Long? = null,

    @SerialName("roblox_subscription")
    val robloxSubscription: String? = null,

    @SerialName("roblox_subscription_end_date")
    val robloxSubscriptionEndDate: Long? = null,

    @SerialName("roblox_xbox_connected")
    val robloxXboxConnected: Long? = null,

    @SerialName("roblox_incoming_robux_total")
    val robloxIncomingRobuxTotal: Long? = null,

    @SerialName("roblox_limited_price")
    val robloxLimitedPrice: Long? = null,

    @SerialName("roblox_verified")
    val robloxVerified: Long? = null,

    @SerialName("roblox_age_verified")
    val robloxAgeVerified: Long? = null,

    @SerialName("roblox_psn_connected")
    val robloxPsnConnected: Long? = null,

    @SerialName("roblox_subscription_auto_renew")
    val robloxSubscriptionAutoRenew: Long? = null,

    @SerialName("roblox_game_pass_total_robux")
    val robloxGamePassTotalRobux: Long? = null,

    @SerialName("roblox_game_donations")
    val robloxGameDonations: String? = null,

    @SerialName("roblox_inventory_price")
    val robloxInventoryPrice: Long? = null,

    @SerialName("roblox_ugc_limited_price")
    val robloxUgcLimitedPrice: Long? = null,

    @SerialName("roblox_credit_balance")
    val robloxCreditBalance: Double? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("robloxLinkedAccounts")
    val robloxLinkedAccounts: String? = null,

    @SerialName("creditBalance")
    val creditBalance: String? = null,

    @SerialName("robloxGameDonationsDetails")
    val robloxGameDonationsDetails: List<CategoryRobloxResponseItemsItemRobloxGameDonationsDetailsItem>? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategoryRobloxResponseItemsItemRobloxGameDonationsDetailsItem(
    @SerialName("product")
    val product: String? = null,

    @SerialName("amount")
    val amount: Long? = null,

    @SerialName("type")
    val `type`: String? = null
)

@Serializable
data class CategoryRobloxResponseItemsItemRobloxGameDonationsItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("amount")
    val amount: Long? = null
)

@Serializable
data class CategorySocialClubResponse(
    @SerialName("items")
    val items: List<CategorySocialClubResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategorySocialClubResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("socialclub_item_id")
    val socialclubItemId: Long? = null,

    @SerialName("socialclub_level")
    val socialclubLevel: Long? = null,

    @SerialName("socialclub_cash")
    val socialclubCash: Long? = null,

    @SerialName("socialclub_bank_cash")
    val socialclubBankCash: Long? = null,

    @SerialName("socialclub_games")
    val socialclubGames: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("socialclub_last_activity")
    val socialclubLastActivity: Long? = null,

    @SerialName("socialclub_has_gtav")
    val socialclubHasGtav: Long? = null,

    @SerialName("socialclub_has_rdr2")
    val socialclubHasRdr2: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategorySteamResponse(
    @SerialName("items")
    val items: List<CategorySteamResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategorySteamResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("steam_item_id")
    val steamItemId: Long? = null,

    @SerialName("steam_country")
    val steamCountry: String? = null,

    @SerialName("steam_register_date")
    val steamRegisterDate: Long? = null,

    @SerialName("steam_last_activity")
    val steamLastActivity: Long? = null,

    @SerialName("steam_full_games")
    val steamFullGames: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("steam_community_ban")
    val steamCommunityBan: Long? = null,

    @SerialName("steam_bans")
    val steamBans: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("steam_cs2_profile_rank")
    val steamCs2ProfileRank: Long? = null,

    @SerialName("steam_balance")
    val steamBalance: String? = null,

    @SerialName("steam_cs2_rank_id")
    val steamCs2RankId: Long? = null,

    @SerialName("steam_is_limited")
    val steamIsLimited: Long? = null,

    @SerialName("steam_level")
    val steamLevel: Long? = null,

    @SerialName("steam_friend_count")
    val steamFriendCount: Long? = null,

    @SerialName("steam_cs2_last_activity")
    val steamCs2LastActivity: Long? = null,

    @SerialName("steam_dota2_solo_mmr")
    val steamDota2SoloMmr: Long? = null,

    @SerialName("steam_cs2_ban_date")
    val steamCs2BanDate: Long? = null,

    @SerialName("steam_converted_balance")
    val steamConvertedBalance: Long? = null,

    @SerialName("steam_cards_count")
    val steamCardsCount: Long? = null,

    @SerialName("steam_cards_games")
    val steamCardsGames: Long? = null,

    @SerialName("steam_pubg_inv_value")
    val steamPubgInvValue: Long? = null,

    @SerialName("steam_cs2_inv_value")
    val steamCs2InvValue: Long? = null,

    @SerialName("steam_dota2_inv_value")
    val steamDota2InvValue: Long? = null,

    @SerialName("steam_tf2_inv_value")
    val steamTf2InvValue: Long? = null,

    @SerialName("steam_rust_inv_value")
    val steamRustInvValue: Long? = null,

    @SerialName("steam_cs2_wingman_rank_id")
    val steamCs2WingmanRankId: Long? = null,

    @SerialName("steam_game_count")
    val steamGameCount: Long? = null,

    @SerialName("steam_steam_inv_value")
    val steamSteamInvValue: Long? = null,

    @SerialName("steam_inv_value")
    val steamInvValue: Long? = null,

    @SerialName("steam_cs2_win_count")
    val steamCs2WinCount: Long? = null,

    @SerialName("steam_dota2_game_count")
    val steamDota2GameCount: Long? = null,

    @SerialName("steam_dota2_lose_count")
    val steamDota2LoseCount: Long? = null,

    @SerialName("steam_dota2_win_count")
    val steamDota2WinCount: Long? = null,

    @SerialName("steam_hours_played_recently")
    val steamHoursPlayedRecently: String? = null,

    @SerialName("steam_faceit_level")
    val steamFaceitLevel: Long? = null,

    @SerialName("steam_points")
    val steamPoints: Long? = null,

    @SerialName("steam_last_transaction_date")
    val steamLastTransactionDate: Long? = null,

    @SerialName("steam_relevant_game_count")
    val steamRelevantGameCount: Long? = null,

    @SerialName("steam_gift_count")
    val steamGiftCount: Long? = null,

    @SerialName("steam_limit_spent")
    val steamLimitSpent: String? = null,

    @SerialName("steam_dota2_behavior")
    val steamDota2Behavior: Long? = null,

    @SerialName("steam_mfa")
    val steamMfa: Long? = null,

    @SerialName("steam_market")
    val steamMarket: Long? = null,

    @SerialName("steam_market_restrictions")
    val steamMarketRestrictions: Long? = null,

    @SerialName("steam_market_ban_end_date")
    val steamMarketBanEndDate: Long? = null,

    @SerialName("steam_unturned_inv_value")
    val steamUnturnedInvValue: Long? = null,

    @SerialName("steam_cs2_last_launched")
    val steamCs2LastLaunched: Long? = null,

    @SerialName("steam_kf2_inv_value")
    val steamKf2InvValue: Long? = null,

    @SerialName("steam_dst_inv_value")
    val steamDstInvValue: Long? = null,

    @SerialName("steam_cs2_premier_elo")
    val steamCs2PremierElo: Long? = null,

    @SerialName("steam_has_activated_keys")
    val steamHasActivatedKeys: Long? = null,

    @SerialName("steam_cs2_ban_type")
    val steamCs2BanType: Long? = null,

    @SerialName("steam_rust_kill_player")
    val steamRustKillPlayer: Long? = null,

    @SerialName("steam_rust_deaths")
    val steamRustDeaths: Long? = null,

    @SerialName("steam_total_gifts_rub")
    val steamTotalGiftsRub: Long? = null,

    @SerialName("steam_total_refunds_rub")
    val steamTotalRefundsRub: Long? = null,

    @SerialName("steam_total_ingame_rub")
    val steamTotalIngameRub: Long? = null,

    @SerialName("steam_total_games_rub")
    val steamTotalGamesRub: Long? = null,

    @SerialName("steam_total_purchased_rub")
    val steamTotalPurchasedRub: Long? = null,

    @SerialName("steam_dota2_last_match_date")
    val steamDota2LastMatchDate: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("steamData")
    val steamData: CategorySteamResponseItemsItemSteamData? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("hasCs2")
    val hasCs2: Boolean? = null,

    @SerialName("hasDota2")
    val hasDota2: Boolean? = null,

    @SerialName("hasPubg")
    val hasPubg: Boolean? = null,

    @SerialName("hasTf2")
    val hasTf2: Boolean? = null,

    @SerialName("hasRust")
    val hasRust: Boolean? = null,

    @SerialName("steam_cs2_ban_date_active")
    val steamCs2BanDateActive: Boolean? = null,

    @SerialName("dota2CalibrationWarning")
    val dota2CalibrationWarning: Boolean? = null,

    @SerialName("displayConvertedBalance")
    val displayConvertedBalance: Boolean? = null,

    @SerialName("inventoryValue")
    val inventoryValue: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("steamCs2Medals")
    val steamCs2Medals: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("cs2RankExpired")
    val cs2RankExpired: Boolean? = null,

    @SerialName("steamDota2WinRate")
    val steamDota2WinRate: Long? = null,

    @SerialName("steamTransactions")
    val steamTransactions: List<CategorySteamResponseItemsItemSteamTransactionsItem>? = null,

    @SerialName("hasPossibleBanInDota2")
    val hasPossibleBanInDota2: Boolean? = null,

    @SerialName("chineseAccount")
    val chineseAccount: Boolean? = null,

    @SerialName("cs2MapsRanks")
    val cs2MapsRanks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("cs2PremierElo")
    val cs2PremierElo: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("steamLifetimeTradeBan")
    val steamLifetimeTradeBan: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("sold_items_category_count")
    val soldItemsCategoryCount: Long? = null,

    @SerialName("restore_items_category_count")
    val restoreItemsCategoryCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategorySteamResponseItemsItemSeller? = null
)

@Serializable
data class CategorySteamResponseItemsItemBumpSettings(
    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBumpItemGlobally")
    val canBumpItemGlobally: Boolean? = null,

    @SerialName("shortErrorPhrase")
    val shortErrorPhrase: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("errorPhrase")
    val errorPhrase: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class CategorySteamResponseItemsItemSeller(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("sold_items_count")
    val soldItemsCount: Long? = null,

    @SerialName("active_items_count")
    val activeItemsCount: Long? = null,

    @SerialName("restore_data")
    val restoreData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("avatar_date")
    val avatarDate: Long? = null,

    @SerialName("is_banned")
    val isBanned: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("restore_percents")
    val restorePercents: Long? = null
)

@Serializable
data class CategorySteamResponseItemsItemSteamData(
    @SerialName("steam_ban_type_id")
    val steamBanTypeId: List<kotlinx.serialization.json.JsonElement>? = null
)

@Serializable
data class CategorySteamResponseItemsItemSteamTransactionsItem(
    @SerialName("date")
    val date: String? = null,

    @SerialName("product")
    val product: String? = null,

    @SerialName("type")
    val `type`: String? = null,

    @SerialName("source")
    val source: String? = null,

    @SerialName("amount")
    val amount: String? = null
)

@Serializable
data class CategorySupercellResponse(
    @SerialName("items")
    val items: List<CategorySupercellResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategorySupercellResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("supercell_item_id")
    val supercellItemId: Long? = null,

    @SerialName("supercell_id")
    val supercellId: String? = null,

    @SerialName("supercell_arena")
    val supercellArena: String? = null,

    @SerialName("supercell_brawler_count")
    val supercellBrawlerCount: Long? = null,

    @SerialName("supercell_last_activity")
    val supercellLastActivity: Long? = null,

    @SerialName("supercell_legendary_brawler_count")
    val supercellLegendaryBrawlerCount: Long? = null,

    @SerialName("supercell_town_hall_level")
    val supercellTownHallLevel: Long? = null,

    @SerialName("supercell_builder_hall_level")
    val supercellBuilderHallLevel: Long? = null,

    @SerialName("supercell_builder_hall_cup_count")
    val supercellBuilderHallCupCount: Long? = null,

    @SerialName("supercell_phone")
    val supercellPhone: Long? = null,

    @SerialName("supercell_laser_level")
    val supercellLaserLevel: Long? = null,

    @SerialName("supercell_scroll_level")
    val supercellScrollLevel: Long? = null,

    @SerialName("supercell_magic_level")
    val supercellMagicLevel: Long? = null,

    @SerialName("supercell_laser_trophies")
    val supercellLaserTrophies: Long? = null,

    @SerialName("supercell_scroll_trophies")
    val supercellScrollTrophies: Long? = null,

    @SerialName("supercell_magic_trophies")
    val supercellMagicTrophies: Long? = null,

    @SerialName("supercell_laser_victories")
    val supercellLaserVictories: Long? = null,

    @SerialName("supercell_scroll_victories")
    val supercellScrollVictories: Long? = null,

    @SerialName("supercell_magic_victories")
    val supercellMagicVictories: Long? = null,

    @SerialName("supercell_laser_battle_pass")
    val supercellLaserBattlePass: Long? = null,

    @SerialName("supercell_scroll_battle_pass")
    val supercellScrollBattlePass: Long? = null,

    @SerialName("supercell_magic_battle_pass")
    val supercellMagicBattlePass: Long? = null,

    @SerialName("supercell_systems")
    val supercellSystems: String? = null,

    @SerialName("supercell_king_level")
    val supercellKingLevel: Long? = null,

    @SerialName("supercell_total_heroes_level")
    val supercellTotalHeroesLevel: Long? = null,

    @SerialName("supercell_total_troops_level")
    val supercellTotalTroopsLevel: Long? = null,

    @SerialName("supercell_total_spells_level")
    val supercellTotalSpellsLevel: Long? = null,

    @SerialName("supercell_total_builder_heroes_level")
    val supercellTotalBuilderHeroesLevel: Long? = null,

    @SerialName("supercell_total_builder_troops_level")
    val supercellTotalBuilderTroopsLevel: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("supercellBrawlers")
    val supercellBrawlers: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("emailLoginUrl")
    val emailLoginUrl: String? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryTelegramResponse(
    @SerialName("items")
    val items: List<CategoryTelegramResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CategoryTelegramResponseItemsItem(
    @SerialName("item_id")
    val itemId: Long? = null,

    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("published_date")
    val publishedDate: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("price")
    val price: Long? = null,

    @SerialName("update_stat_date")
    val updateStatDate: Long? = null,

    @SerialName("refreshed_date")
    val refreshedDate: Long? = null,

    @SerialName("edit_date")
    val editDate: Long? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("item_origin")
    val itemOrigin: String? = null,

    @SerialName("extended_guarantee")
    val extendedGuarantee: Long? = null,

    @SerialName("nsb")
    val nsb: Long? = null,

    @SerialName("allow_ask_discount")
    val allowAskDiscount: Long? = null,

    @SerialName("title_en")
    val titleEn: String? = null,

    @SerialName("description_en")
    val descriptionEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("telegram_item_id")
    val telegramItemId: Long? = null,

    @SerialName("telegram_country")
    val telegramCountry: String? = null,

    @SerialName("telegram_last_seen")
    val telegramLastSeen: Long? = null,

    @SerialName("telegram_premium")
    val telegramPremium: Long? = null,

    @SerialName("telegram_stars_count")
    val telegramStarsCount: Long? = null,

    @SerialName("telegram_birthday")
    val telegramBirthday: Long? = null,

    @SerialName("telegram_password")
    val telegramPassword: Long? = null,

    @SerialName("telegram_premium_expires")
    val telegramPremiumExpires: Long? = null,

    @SerialName("telegram_spam_block")
    val telegramSpamBlock: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("telegram_channels_count")
    val telegramChannelsCount: Long? = null,

    @SerialName("telegram_chats_count")
    val telegramChatsCount: Long? = null,

    @SerialName("telegram_admin_count")
    val telegramAdminCount: Long? = null,

    @SerialName("telegram_admin_subs_count")
    val telegramAdminSubsCount: Long? = null,

    @SerialName("telegram_conversations_count")
    val telegramConversationsCount: Long? = null,

    @SerialName("telegram_id_count")
    val telegramIdCount: Long? = null,

    @SerialName("telegram_contacts_count")
    val telegramContactsCount: Long? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("priceWithSellerFee")
    val priceWithSellerFee: Double? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: CategorySteamResponseItemsItemBumpSettings? = null,

    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("rub_price")
    val rubPrice: Long? = null,

    @SerialName("price_currency")
    val priceCurrency: String? = null,

    @SerialName("canValidateAccount")
    val canValidateAccount: Boolean? = null,

    @SerialName("canResellItemAfterPurchase")
    val canResellItemAfterPurchase: Boolean? = null,

    @SerialName("telegram_group_counters")
    val telegramGroupCounters: CategoryTelegramResponseItemsItemTelegramGroupCounters? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasPendingAutoBuy")
    val hasPendingAutoBuy: Boolean? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: CategoryTelegramResponseItemsItemSeller? = null
)

@Serializable
data class CategoryTelegramResponseItemsItemSeller(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("sold_items_count")
    val soldItemsCount: Long? = null,

    @SerialName("active_items_count")
    val activeItemsCount: Long? = null,

    @SerialName("restore_data")
    val restoreData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("avatar_date")
    val avatarDate: Long? = null,

    @SerialName("is_banned")
    val isBanned: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("restore_percents")
    val restorePercents: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class CategoryTelegramResponseItemsItemTelegramGroupCounters(
    @SerialName("chats")
    val chats: Long? = null,

    @SerialName("channels")
    val channels: Long? = null,

    @SerialName("conversations")
    val conversations: Long? = null,

    @SerialName("admin")
    val admin: Long? = null
)

@Serializable
data class CategoryTikTokResponse(
    @SerialName("items")
    val items: List<CategoryTikTokResponseItemsItem>? = null,

    @SerialName("totalItems")
    val totalItems: Long? = null,

    @SerialName("totalItemsPrice")
    val totalItemsPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("wasCached")
    val wasCached: Boolean? = null,

    @SerialName("cacheTTL")
    val cacheTTL: Long? = null,

    @SerialName("lastModified")
    val lastModified: Long? = null,

    @SerialName("serverTime")
    val serverTime: Long? = null,

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)
