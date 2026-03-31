package com.lolzteam.generated.market.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.JsonElement

@Serializable
data class CategoryTikTokResponseItemsItem(
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

    @SerialName("tt_item_id")
    val ttItemId: Long? = null,

    @SerialName("tt_id")
    val ttId: Long? = null,

    @SerialName("tt_permalink")
    val ttPermalink: String? = null,

    @SerialName("tt_uniqueId")
    val ttUniqueId: String? = null,

    @SerialName("tt_verified")
    val ttVerified: Long? = null,

    @SerialName("tt_createTime")
    val ttCreateTime: Long? = null,

    @SerialName("tt_privateAccount")
    val ttPrivateAccount: Long? = null,

    @SerialName("tt_followers")
    val ttFollowers: Long? = null,

    @SerialName("tt_following")
    val ttFollowing: Long? = null,

    @SerialName("tt_likes")
    val ttLikes: Long? = null,

    @SerialName("tt_videos")
    val ttVideos: Long? = null,

    @SerialName("tt_screen_name")
    val ttScreenName: String? = null,

    @SerialName("tt_hasEmail")
    val ttHasEmail: Long? = null,

    @SerialName("tt_hasMobile")
    val ttHasMobile: Long? = null,

    @SerialName("tt_top_country")
    val ttTopCountry: String? = null,

    @SerialName("tt_countries")
    val ttCountries: String? = null,

    @SerialName("tt_coins")
    val ttCoins: Long? = null,

    @SerialName("tt_hasLivePermission")
    val ttHasLivePermission: Long? = null,

    @SerialName("tt_cookie_login")
    val ttCookieLogin: Long? = null,

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
data class CategoryUplayResponse(
    @SerialName("items")
    val items: List<CategoryUplayResponseItemsItem>? = null,

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
data class CategoryUplayResponseItemsItem(
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

    @SerialName("uplay_item_id")
    val uplayItemId: Long? = null,

    @SerialName("uplay_last_activity")
    val uplayLastActivity: Long? = null,

    @SerialName("uplay_country")
    val uplayCountry: String? = null,

    @SerialName("uplay_created_date")
    val uplayCreatedDate: Long? = null,

    @SerialName("uplay_games")
    val uplayGames: CategoryUplayResponseItemsItemUplayGames? = null,

    @SerialName("uplay_game_count")
    val uplayGameCount: Long? = null,

    @SerialName("uplay_r6_level")
    val uplayR6Level: Long? = null,

    @SerialName("uplay_r6_ban")
    val uplayR6Ban: Long? = null,

    @SerialName("uplay_r6_operators")
    val uplayR6Operators: String? = null,

    @SerialName("uplay_r6_operators_count")
    val uplayR6OperatorsCount: Long? = null,

    @SerialName("uplay_r6_skins")
    val uplayR6Skins: String? = null,

    @SerialName("uplay_r6_skins_count")
    val uplayR6SkinsCount: Long? = null,

    @SerialName("uplay_subscription")
    val uplaySubscription: String? = null,

    @SerialName("uplay_subscription_end_date")
    val uplaySubscriptionEndDate: Long? = null,

    @SerialName("uplay_xbox_connected")
    val uplayXboxConnected: Long? = null,

    @SerialName("uplay_psn_connected")
    val uplayPsnConnected: Long? = null,

    @SerialName("uplay_steam_connected")
    val uplaySteamConnected: Long? = null,

    @SerialName("uplay_r6_rank")
    val uplayR6Rank: Long? = null,

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

    @SerialName("uplayLinkedAccounts")
    val uplayLinkedAccounts: String? = null,

    @SerialName("uplay_r6_steam_warning")
    val uplayR6SteamWarning: Boolean? = null,

    @SerialName("uplay_r6_external_warning")
    val uplayR6ExternalWarning: Boolean? = null,

    @SerialName("uplay_r6")
    val uplayR6: Boolean? = null,

    @SerialName("uplay_r6_ban_active")
    val uplayR6BanActive: Boolean? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("r6Skins")
    val r6Skins: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("r6Operators")
    val r6Operators: List<CategoryUplayResponseItemsItemR6OperatorsItem>? = null,

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
data class CategoryUplayResponseItemsItemR6OperatorsItem(
    @SerialName("img")
    val img: String? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("url")
    val url: String? = null
)

@Serializable
data class CategoryUplayResponseItemsItemUplayGames(
    @SerialName("ffffffff-ffff-ffff-ffff-ffffffffffff")
    val ffffffffFfffFfffFfffFfffffffffff: CategoryUplayResponseItemsItemUplayGamesFfffffffFfffFfffFfffFfffffffffff? = null
)

@Serializable
data class CategoryUplayResponseItemsItemUplayGamesFfffffffFfffFfffFfffFfffffffffff(
    @SerialName("title")
    val title: String? = null,

    @SerialName("img")
    val img: String? = null,

    @SerialName("pvpTimePlayed")
    val pvpTimePlayed: Long? = null,

    @SerialName("pveTimePlayed")
    val pveTimePlayed: Long? = null,

    @SerialName("abbr")
    val abbr: String? = null,

    @SerialName("gameId")
    val gameId: String? = null
)

@Serializable
data class CategoryVpnResponse(
    @SerialName("items")
    val items: List<CategoryVpnResponseItemsItem>? = null,

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
data class CategoryVpnResponseItemsItem(
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

    @SerialName("vpn_item_id")
    val vpnItemId: Long? = null,

    @SerialName("vpn_service")
    val vpnService: String? = null,

    @SerialName("vpn_expire_date")
    val vpnExpireDate: Long? = null,

    @SerialName("vpn_renewable")
    val vpnRenewable: Long? = null,

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

    @SerialName("vpnProductTitle")
    val vpnProductTitle: String? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

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
data class CategoryWarfaceResponse(
    @SerialName("items")
    val items: List<CategoryWarfaceResponseItemsItem>? = null,

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
data class CategoryWarfaceResponseItemsItem(
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

    @SerialName("wf_item_id")
    val wfItemId: Long? = null,

    @SerialName("wf_players")
    val wfPlayers: Boolean? = null,

    @SerialName("wf_server_1")
    val wfServer1: Long? = null,

    @SerialName("wf_server_2")
    val wfServer2: Long? = null,

    @SerialName("wf_server_3")
    val wfServer3: Long? = null,

    @SerialName("wf_mobile")
    val wfMobile: Long? = null,

    @SerialName("wf_bonus_rank")
    val wfBonusRank: Long? = null,

    @SerialName("wf_mail_mobile")
    val wfMailMobile: Long? = null,

    @SerialName("wf_last_game_date")
    val wfLastGameDate: Long? = null,

    @SerialName("wf_loan")
    val wfLoan: Boolean? = null,

    @SerialName("wf_active_loan")
    val wfActiveLoan: Long? = null,

    @SerialName("wf_rank")
    val wfRank: Long? = null,

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

    @SerialName("wf_servers")
    val wfServers: List<CategoryWarfaceResponseItemsItemWfServersItem>? = null,

    @SerialName("domain")
    val domain: String? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

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
data class CategoryWarfaceResponseItemsItemWfServersItem(
    @SerialName("id")
    val id: Long? = null,

    @SerialName("rank")
    val rank: Long? = null,

    @SerialName("title")
    val title: String? = null
)

@Serializable
data class CategoryWotBlitzResponse(
    @SerialName("items")
    val items: List<CategoryWotBlitzResponseItemsItem>? = null,

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
data class CategoryWotBlitzResponseItemsItem(
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

    @SerialName("wot_item_id")
    val wotItemId: Long? = null,

    @SerialName("wot_last_activity")
    val wotLastActivity: Long? = null,

    @SerialName("wot_register_date")
    val wotRegisterDate: Long? = null,

    @SerialName("wot_mobile")
    val wotMobile: Long? = null,

    @SerialName("wot_premium")
    val wotPremium: Long? = null,

    @SerialName("wot_premium_expires")
    val wotPremiumExpires: Long? = null,

    @SerialName("wot_gold")
    val wotGold: Long? = null,

    @SerialName("wot_credits")
    val wotCredits: Long? = null,

    @SerialName("wot_battle_count")
    val wotBattleCount: Long? = null,

    @SerialName("wot_win_count")
    val wotWinCount: Long? = null,

    @SerialName("wot_loss_count")
    val wotLossCount: Long? = null,

    @SerialName("wot_win_count_percents")
    val wotWinCountPercents: Long? = null,

    @SerialName("wot_top_tanks")
    val wotTopTanks: Long? = null,

    @SerialName("wot_premium_tanks")
    val wotPremiumTanks: Long? = null,

    @SerialName("wot_top_premium_tanks")
    val wotTopPremiumTanks: Long? = null,

    @SerialName("wot_region")
    val wotRegion: String? = null,

    @SerialName("wot_blitz")
    val wotBlitz: Long? = null,

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

    @SerialName("wotRegionPhrase")
    val wotRegionPhrase: String? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("wotTanks")
    val wotTanks: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("wotPremiumTankCount")
    val wotPremiumTankCount: Long? = null,

    @SerialName("wotTankCount")
    val wotTankCount: Long? = null,

    @SerialName("wotLauncherTitle")
    val wotLauncherTitle: String? = null,

    @SerialName("wot_has_clan")
    val wotHasClan: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

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
data class CategoryWotResponse(
    @SerialName("items")
    val items: List<CategoryWotResponseItemsItem>? = null,

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
data class CategoryWotResponseItemsItem(
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

    @SerialName("wot_item_id")
    val wotItemId: Long? = null,

    @SerialName("wot_last_activity")
    val wotLastActivity: Long? = null,

    @SerialName("wot_register_date")
    val wotRegisterDate: Long? = null,

    @SerialName("wot_mobile")
    val wotMobile: Long? = null,

    @SerialName("wot_premium")
    val wotPremium: Long? = null,

    @SerialName("wot_premium_expires")
    val wotPremiumExpires: Long? = null,

    @SerialName("wot_gold")
    val wotGold: Long? = null,

    @SerialName("wot_credits")
    val wotCredits: Long? = null,

    @SerialName("wot_battle_count")
    val wotBattleCount: Long? = null,

    @SerialName("wot_win_count")
    val wotWinCount: Long? = null,

    @SerialName("wot_loss_count")
    val wotLossCount: Long? = null,

    @SerialName("wot_win_count_percents")
    val wotWinCountPercents: Long? = null,

    @SerialName("wot_top_tanks")
    val wotTopTanks: Long? = null,

    @SerialName("wot_premium_tanks")
    val wotPremiumTanks: Long? = null,

    @SerialName("wot_top_premium_tanks")
    val wotTopPremiumTanks: Long? = null,

    @SerialName("wot_region")
    val wotRegion: String? = null,

    @SerialName("wot_blitz")
    val wotBlitz: Long? = null,

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

    @SerialName("wotRegionPhrase")
    val wotRegionPhrase: String? = null,

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("wotTanks")
    val wotTanks: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("wotPremiumTankCount")
    val wotPremiumTankCount: Long? = null,

    @SerialName("wotTankCount")
    val wotTankCount: Long? = null,

    @SerialName("wotLauncherTitle")
    val wotLauncherTitle: String? = null,

    @SerialName("wot_has_clan")
    val wotHasClan: Boolean? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<kotlinx.serialization.json.JsonElement>? = null,

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
data class ConfirmationCodeModel(
    @SerialName("item")
    val item: ConfirmationCodeModelItem? = null,

    @SerialName("codeData")
    val codeData: ConfirmationCodeModelCodeData? = null
)

@Serializable
data class ConfirmationCodeModelCodeData(
    @SerialName("code")
    val code: String? = null,

    @SerialName("date")
    val date: Long? = null,

    @SerialName("textPlain")
    val textPlain: String? = null
)

@Serializable
data class ConfirmationCodeModelItem(
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

    @SerialName("login")
    val login: String? = null,

    @SerialName("temp_email")
    val tempEmail: String? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("information")
    val information: String? = null,

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

    @SerialName("information_en")
    val informationEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("note_text")
    val noteText: String? = null,

    @SerialName("content_type")
    val contentType: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("content_id")
    val contentId: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("delete_date")
    val deleteDate: Long? = null,

    @SerialName("delete_user_id")
    val deleteUserId: Long? = null,

    @SerialName("delete_username")
    val deleteUsername: String? = null,

    @SerialName("delete_reason")
    val deleteReason: String? = null,

    @SerialName("user_allow_ask_discount")
    val userAllowAskDiscount: Long? = null,

    @SerialName("max_discount_percent")
    val maxDiscountPercent: Long? = null,

    @SerialName("market_custom_title")
    val marketCustomTitle: String? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("buyer_display_icon_group_id")
    val buyerDisplayIconGroupId: Long? = null,

    @SerialName("buyer_uniq_banner")
    val buyerUniqBanner: String? = null,

    @SerialName("buyer_avatar_date")
    val buyerAvatarDate: Long? = null,

    @SerialName("buyer_user_group_id")
    val buyerUserGroupId: Long? = null,

    @SerialName("is_fave")
    val isFave: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("in_cart")
    val inCart: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("cart_price")
    val cartPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canResellItem")
    val canResellItem: Boolean? = null,

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

    @SerialName("loginData")
    val loginData: ConfirmationCodeModelItemLoginData? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("copyFormatData")
    val copyFormatData: ConfirmationCodeModelItemCopyFormatData? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("getEmailCodeDisplayLogin")
    val getEmailCodeDisplayLogin: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("buyer")
    val buyer: ConfirmationCodeModelItemBuyer? = null,

    @SerialName("isPersonalAccount")
    val isPersonalAccount: Boolean? = null,

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

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("imagePreviewLinks")
    val imagePreviewLinks: List<String>? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("canChangeEmailPassword")
    val canChangeEmailPassword: Boolean? = null,

    @SerialName("uniqueKeyExists")
    val uniqueKeyExists: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("visitorIsAuthor")
    val visitorIsAuthor: Boolean? = null,

    @SerialName("canAskDiscount")
    val canAskDiscount: Boolean? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("customFields")
    val customFields: ConfirmationCodeModelItemCustomFields? = null,

    @SerialName("externalAuth")
    val externalAuth: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("isTrusted")
    val isTrusted: Boolean? = null,

    @SerialName("isBirthdayToday")
    val isBirthdayToday: Boolean? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("deposit")
    val deposit: Long? = null,

    @SerialName("extraPrices")
    val extraPrices: List<ConfirmationCodeModelItemExtraPricesItem>? = null,

    @SerialName("canViewAccountLoginAndTempEmail")
    val canViewAccountLoginAndTempEmail: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: ConfirmationCodeModelItemBumpSettings? = null,

    @SerialName("canCheckGuarantee")
    val canCheckGuarantee: Boolean? = null,

    @SerialName("canShareItem")
    val canShareItem: Boolean? = null,

    @SerialName("canCheckAiPrice")
    val canCheckAiPrice: Boolean? = null,

    @SerialName("aiPrice")
    val aiPrice: Long? = null,

    @SerialName("aiPriceCheckDate")
    val aiPriceCheckDate: Long? = null,

    @SerialName("needToRequireVideoToViewLoginData")
    val needToRequireVideoToViewLoginData: Boolean? = null,

    @SerialName("canCheckAutoBuyPrice")
    val canCheckAutoBuyPrice: Boolean? = null,

    @SerialName("autoBuyPrice")
    val autoBuyPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("autoBuyPriceCheckDate")
    val autoBuyPriceCheckDate: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: ConfirmationCodeModelItemSeller? = null
)

@Serializable
data class ConfirmationCodeModelItemAccountLinksItem(
    @SerialName("link")
    val link: String? = null,

    @SerialName("text")
    val text: String? = null,

    @SerialName("iconClass")
    val iconClass: String? = null
)

@Serializable
data class ConfirmationCodeModelItemBumpSettings(
    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBumpItemGlobally")
    val canBumpItemGlobally: Boolean? = null,

    @SerialName("shortErrorPhrase")
    val shortErrorPhrase: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("nextAllowedBumpDate")
    val nextAllowedBumpDate: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("errorPhrase")
    val errorPhrase: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class ConfirmationCodeModelItemBuyer(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("operation_date")
    val operationDate: Long? = null,

    @SerialName("visitorIsBuyer")
    val visitorIsBuyer: Boolean? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("is_banned")
    val isBanned: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,

    @SerialName("uniq_username_css")
    val uniqUsernameCss: String? = null,

    @SerialName("uniq_banner")
    val uniqBanner: String? = null,

    @SerialName("user_group_id")
    val userGroupId: Long? = null
)

@Serializable
data class ConfirmationCodeModelItemCopyFormatData(
    @SerialName("title_link")
    val titleLink: String? = null,

    @SerialName("login_data")
    val loginData: String? = null,

    @SerialName("full")
    val full: String? = null
)

@Serializable
data class ConfirmationCodeModelItemCustomFields(
    @SerialName("_4")
    val v4: String? = null,

    @SerialName("allowSelfUnban")
    val allowSelfUnban: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("ban_reason")
    val banReason: String? = null,

    @SerialName("discord")
    val discord: String? = null,

    @SerialName("github")
    val github: String? = null,

    @SerialName("jabber")
    val jabber: String? = null,

    @SerialName("lztUnbanAmount")
    val lztUnbanAmount: String? = null,

    @SerialName("steam")
    val steam: String? = null,

    @SerialName("telegram")
    val telegram: String? = null,

    @SerialName("vk")
    val vk: String? = null
)

@Serializable
data class ConfirmationCodeModelItemExtraPricesItem(
    @SerialName("currency")
    val currency: String? = null,

    @SerialName("price")
    val price: String? = null,

    @SerialName("priceValue")
    val priceValue: Double? = null
)

@Serializable
data class ConfirmationCodeModelItemLoginData(
    @SerialName("raw")
    val raw: String? = null,

    @SerialName("encodedRaw")
    val encodedRaw: String? = null,

    @SerialName("login")
    val login: String? = null,

    @SerialName("password")
    val password: String? = null,

    @SerialName("encodedPassword")
    val encodedPassword: String? = null,

    @SerialName("oldPassword")
    val oldPassword: String? = null,

    @SerialName("encodedOldPassword")
    val encodedOldPassword: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class ConfirmationCodeModelItemSeller(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("avatar_date")
    val avatarDate: Long? = null,

    @SerialName("is_banned")
    val isBanned: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("joined_date")
    val joinedDate: Long? = null,

    @SerialName("sold_items_count")
    val soldItemsCount: Long? = null,

    @SerialName("active_items_count")
    val activeItemsCount: Long? = null,

    @SerialName("restore_data")
    val restoreData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("effective_last_activity")
    val effectiveLastActivity: Long? = null,

    @SerialName("restore_percents")
    val restorePercents: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("isOnline")
    val isOnline: Boolean? = null,

    @SerialName("contacts")
    val contacts: ConfirmationCodeModelItemSellerContacts? = null
)

@Serializable
data class ConfirmationCodeModelItemSellerContacts(
    @SerialName("ban_reason")
    val banReason: String? = null,

    @SerialName("telegram")
    val telegram: String? = null
)

@Serializable
data class CustomDiscountsCreateResponse(
    @SerialName("discount")
    val discount: CustomDiscountsCreateResponseDiscount? = null,

    @SerialName("total")
    val total: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class CustomDiscountsCreateResponseDiscount(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("discount_id")
    val discountId: Long? = null,

    @SerialName("discount_percent")
    val discountPercent: Long? = null,

    @SerialName("discount_user_id")
    val discountUserId: Long? = null,

    @SerialName("max_price")
    val maxPrice: Long? = null,

    @SerialName("min_price")
    val minPrice: Long? = null,

    @SerialName("user_id")
    val userId: Long? = null
)

@Serializable
data class CustomDiscountsGetResponse(
    @SerialName("discounts")
    val discounts: List<DiscountModel>? = null,

    @SerialName("total")
    val total: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class DiscountModel(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("discount_id")
    val discountId: Long? = null,

    @SerialName("discount_percent")
    val discountPercent: Long? = null,

    @SerialName("discount_user_id")
    val discountUserId: Long? = null,

    @SerialName("max_price")
    val maxPrice: Long? = null,

    @SerialName("min_price")
    val minPrice: Long? = null,

    @SerialName("user_id")
    val userId: Long? = null
)

@Serializable
data class ExtraModel(
    @SerialName("proxy")
    val proxy: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("close_item")
    val closeItem: Boolean? = null,

    @SerialName("region")
    val region: String? = null,

    @SerialName("service")
    val service: Service? = null,

    @SerialName("system")
    val system: System? = null,

    @SerialName("confirmationCode")
    val confirmationCode: String? = null,

    @SerialName("cookies")
    val cookies: String? = null,

    @SerialName("login_without_cookies")
    val loginWithoutCookies: Boolean? = null,

    @SerialName("cookie_login")
    val cookieLogin: Boolean? = null,

    @SerialName("mfa_file")
    val mfaFile: String? = null,

    @SerialName("dota2_mmr")
    val dota2Mmr: Long? = null,

    @SerialName("ea_games")
    val eaGames: Boolean? = null,

    @SerialName("uplay_games")
    val uplayGames: Boolean? = null,

    @SerialName("the_quarry")
    val theQuarry: Boolean? = null,

    @SerialName("warframe")
    val warframe: Boolean? = null,

    @SerialName("ark")
    val ark: Boolean? = null,

    @SerialName("ark_ascended")
    val arkAscended: Boolean? = null,

    @SerialName("genshin_currency")
    val genshinCurrency: Long? = null,

    @SerialName("honkai_currency")
    val honkaiCurrency: Long? = null,

    @SerialName("zenless_currency")
    val zenlessCurrency: Long? = null,

    @SerialName("password")
    val password: String? = null,

    @SerialName("telegramClient")
    val telegramClient: String? = null,

    @SerialName("telegramJson")
    val telegramJson: String? = null,

    @SerialName("checkChannels")
    val checkChannels: Boolean? = null,

    @SerialName("checkSpam")
    val checkSpam: Boolean? = null,

    @SerialName("checkHypixelBan")
    val checkHypixelBan: Boolean? = null
)

@Serializable
data class InvoiceModel(
    @SerialName("additional_data")
    val additionalData: String? = null,

    @SerialName("amount")
    val amount: Long? = null,

    @SerialName("comment")
    val comment: String? = null,

    @SerialName("expires_at")
    val expiresAt: Long? = null,

    @SerialName("invoice_date")
    val invoiceDate: Long? = null,

    @SerialName("invoice_id")
    val invoiceId: Long? = null,

    @SerialName("is_test")
    val isTest: Boolean? = null,

    @SerialName("merchant_id")
    val merchantId: Long? = null,

    @SerialName("paid_date")
    val paidDate: Long? = null,

    @SerialName("payer_user_id")
    val payerUserId: Long? = null,

    @SerialName("payment_id")
    val paymentId: String? = null,

    @SerialName("resend_attempts")
    val resendAttempts: Long? = null,

    @SerialName("status")
    val status: String? = null,

    @SerialName("url")
    val url: String? = null,

    @SerialName("url_callback")
    val urlCallback: String? = null,

    @SerialName("url_success")
    val urlSuccess: String? = null,

    @SerialName("user_id")
    val userId: Long? = null
)

@Serializable
data class ItemFromListModel(
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

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("isIgnored")
    val isIgnored: Long? = null,

    @SerialName("guarantee")
    val guarantee: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("canUpdateItemStats")
    val canUpdateItemStats: Boolean? = null,

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
    val bumpSettings: ItemFromListModelBumpSettings? = null,

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

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("note_text")
    val noteText: String? = null,

    @SerialName("description_html")
    val descriptionHtml: String? = null,

    @SerialName("description_html_en")
    val descriptionHtmlEn: String? = null,

    @SerialName("seller")
    val seller: ItemFromListModelSeller? = null
)

@Serializable
data class ItemFromListModelBumpSettings(
    @SerialName("canBumpItem")
    val canBumpItem: Boolean? = null,

    @SerialName("canBumpItemGlobally")
    val canBumpItemGlobally: Boolean? = null,

    @SerialName("shortErrorPhrase")
    val shortErrorPhrase: String? = null,

    @SerialName("errorPhrase")
    val errorPhrase: String? = null
)

@Serializable
data class ItemFromListModelSeller(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("sold_items_count")
    val soldItemsCount: Long? = null,

    @SerialName("active_item_count")
    val activeItemCount: Long? = null,

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
data class ItemListModel(
    @SerialName("items")
    val items: List<ItemFromListModel>? = null,

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

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<ItemFromListModel>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ItemListModelSystemInfo(
    @SerialName("visitor_id")
    val visitorId: Long? = null,

    @SerialName("time")
    val time: Long? = null,

    @SerialName("log_id")
    val logId: Long? = null
)

@Serializable
data class ItemModel(
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

    @SerialName("login")
    val login: String? = null,

    @SerialName("temp_email")
    val tempEmail: String? = null,

    @SerialName("view_count")
    val viewCount: Long? = null,

    @SerialName("is_sticky")
    val isSticky: Long? = null,

    @SerialName("information")
    val information: String? = null,

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

    @SerialName("information_en")
    val informationEn: String? = null,

    @SerialName("email_type")
    val emailType: String? = null,

    @SerialName("email_provider")
    val emailProvider: String? = null,

    @SerialName("item_domain")
    val itemDomain: String? = null,

    @SerialName("resale_item_origin")
    val resaleItemOrigin: String? = null,

    @SerialName("note_text")
    val noteText: String? = null,

    @SerialName("content_type")
    val contentType: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("content_id")
    val contentId: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("delete_date")
    val deleteDate: Long? = null,

    @SerialName("delete_user_id")
    val deleteUserId: Long? = null,

    @SerialName("delete_username")
    val deleteUsername: String? = null,

    @SerialName("delete_reason")
    val deleteReason: String? = null,

    @SerialName("user_allow_ask_discount")
    val userAllowAskDiscount: Long? = null,

    @SerialName("max_discount_percent")
    val maxDiscountPercent: Long? = null,

    @SerialName("market_custom_title")
    val marketCustomTitle: String? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("buyer_display_icon_group_id")
    val buyerDisplayIconGroupId: Long? = null,

    @SerialName("buyer_uniq_banner")
    val buyerUniqBanner: String? = null,

    @SerialName("buyer_avatar_date")
    val buyerAvatarDate: Long? = null,

    @SerialName("buyer_user_group_id")
    val buyerUserGroupId: Long? = null,

    @SerialName("is_fave")
    val isFave: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("in_cart")
    val inCart: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("cart_price")
    val cartPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("canResellItem")
    val canResellItem: Boolean? = null,

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

    @SerialName("loginData")
    val loginData: ConfirmationCodeModelItemLoginData? = null,

    @SerialName("canViewEmailLoginData")
    val canViewEmailLoginData: Boolean? = null,

    @SerialName("copyFormatData")
    val copyFormatData: ConfirmationCodeModelItemCopyFormatData? = null,

    @SerialName("showGetEmailCodeButton")
    val showGetEmailCodeButton: Boolean? = null,

    @SerialName("getEmailCodeDisplayLogin")
    val getEmailCodeDisplayLogin: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("buyer")
    val buyer: ConfirmationCodeModelItemBuyer? = null,

    @SerialName("isPersonalAccount")
    val isPersonalAccount: Boolean? = null,

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

    @SerialName("isSmallExf")
    val isSmallExf: Boolean? = null,

    @SerialName("account_last_activity")
    val accountLastActivity: Long? = null,

    @SerialName("canViewAccountLink")
    val canViewAccountLink: Boolean? = null,

    @SerialName("accountLinks")
    val accountLinks: List<ConfirmationCodeModelItemAccountLinksItem>? = null,

    @SerialName("accountLink")
    val accountLink: String? = null,

    @SerialName("imagePreviewLinks")
    val imagePreviewLinks: List<String>? = null,

    @SerialName("canChangePassword")
    val canChangePassword: Boolean? = null,

    @SerialName("canChangeEmailPassword")
    val canChangeEmailPassword: Boolean? = null,

    @SerialName("uniqueKeyExists")
    val uniqueKeyExists: Boolean? = null,

    @SerialName("itemOriginPhrase")
    val itemOriginPhrase: String? = null,

    @SerialName("visitorIsAuthor")
    val visitorIsAuthor: Boolean? = null,

    @SerialName("canAskDiscount")
    val canAskDiscount: Boolean? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("customFields")
    val customFields: ConfirmationCodeModelItemCustomFields? = null,

    @SerialName("externalAuth")
    val externalAuth: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("isTrusted")
    val isTrusted: Boolean? = null,

    @SerialName("isBirthdayToday")
    val isBirthdayToday: Boolean? = null,

    @SerialName("isIgnored")
    val isIgnored: Boolean? = null,

    @SerialName("deposit")
    val deposit: Long? = null,

    @SerialName("extraPrices")
    val extraPrices: List<ConfirmationCodeModelItemExtraPricesItem>? = null,

    @SerialName("canViewAccountLoginAndTempEmail")
    val canViewAccountLoginAndTempEmail: Boolean? = null,

    @SerialName("bumpSettings")
    val bumpSettings: ConfirmationCodeModelItemBumpSettings? = null,

    @SerialName("canCheckGuarantee")
    val canCheckGuarantee: Boolean? = null,

    @SerialName("canShareItem")
    val canShareItem: Boolean? = null,

    @SerialName("canCheckAiPrice")
    val canCheckAiPrice: Boolean? = null,

    @SerialName("aiPrice")
    val aiPrice: Long? = null,

    @SerialName("aiPriceCheckDate")
    val aiPriceCheckDate: Long? = null,

    @SerialName("needToRequireVideoToViewLoginData")
    val needToRequireVideoToViewLoginData: Boolean? = null,

    @SerialName("canCheckAutoBuyPrice")
    val canCheckAutoBuyPrice: Boolean? = null,

    @SerialName("autoBuyPrice")
    val autoBuyPrice: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("autoBuyPriceCheckDate")
    val autoBuyPriceCheckDate: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("descriptionHtml")
    val descriptionHtml: String? = null,

    @SerialName("descriptionEnHtml")
    val descriptionEnHtml: String? = null,

    @SerialName("descriptionPlain")
    val descriptionPlain: String? = null,

    @SerialName("descriptionEnPlain")
    val descriptionEnPlain: String? = null,

    @SerialName("seller")
    val seller: ConfirmationCodeModelItemSeller? = null
)

@Serializable
data class ListStatesResponse(
    @SerialName("userItemStates")
    val userItemStates: ListStatesResponseUserItemStates? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ListStatesResponseUserItemStates(
    @SerialName("stickied")
    val stickied: ListStatesResponseUserItemStatesStickied? = null,

    @SerialName("discount_request")
    val discountRequest: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("in_buyers_favorites")
    val inBuyersFavorites: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("active")
    val active: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("paid")
    val paid: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("closed")
    val closed: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("deleted")
    val deleted: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("awaiting")
    val awaiting: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("pre_active")
    val preActive: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("pre_upload")
    val preUpload: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("pending_deletion")
    val pendingDeletion: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("closed_inactive")
    val closedInactive: ListStatesResponseUserItemStatesDiscountRequest? = null,

    @SerialName("auto_bump")
    val autoBump: ListStatesResponseUserItemStatesDiscountRequest? = null
)

@Serializable
data class ListStatesResponseUserItemStatesDiscountRequest(
    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("item_count")
    val itemCount: Long? = null,

    @SerialName("title")
    val title: String? = null
)

@Serializable
data class ListStatesResponseUserItemStatesStickied(
    @SerialName("item_state")
    val itemState: String? = null,

    @SerialName("item_count")
    val itemCount: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("stickyLimit")
    val stickyLimit: Long? = null
)

@Serializable
data class ListUserResponse(
    @SerialName("items")
    val items: List<ItemFromListModel>? = null,

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

    @SerialName("searchUrl")
    val searchUrl: String? = null,

    @SerialName("stickyItems")
    val stickyItems: List<ItemFromListModel>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingAIPriceResponse(
    @SerialName("price")
    val price: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingBulkGetResponse(
    @SerialName("items")
    val items: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("left_item_id")
    val leftItemId: List<Long>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingChangePasswordResponse(
    @SerialName("status")
    val status: String? = null,

    @SerialName("message")
    val message: String? = null,

    @SerialName("new_password")
    val newPassword: String? = null
)

@Serializable
data class ManagingCheckGuaranteeResponse(
    @SerialName("message")
    val message: String? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingCreateClaimResponse(
    @SerialName("thread")
    val thread: ManagingCreateClaimResponseThread? = null,

    @SerialName("system_info")
    val systemInfo: ManagingCreateClaimResponseSystemInfo? = null
)

@Serializable
data class ManagingCreateClaimResponseSystemInfo(
    @SerialName("visitor_id")
    val visitorId: Long? = null,

    @SerialName("time")
    val time: Long? = null
)

@Serializable
data class ManagingCreateClaimResponseThread(
    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("forum_id")
    val forumId: Long? = null,

    @SerialName("thread_title")
    val threadTitle: String? = null,

    @SerialName("thread_view_count")
    val threadViewCount: Long? = null,

    @SerialName("creator_user_id")
    val creatorUserId: Long? = null,

    @SerialName("creator_username")
    val creatorUsername: String? = null,

    @SerialName("thread_create_date")
    val threadCreateDate: Long? = null,

    @SerialName("thread_update_date")
    val threadUpdateDate: Long? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("thread_post_count")
    val threadPostCount: Long? = null,

    @SerialName("thread_is_published")
    val threadIsPublished: Boolean? = null,

    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean? = null,

    @SerialName("thread_is_sticky")
    val threadIsSticky: Boolean? = null,

    @SerialName("thread_is_followed")
    val threadIsFollowed: Boolean? = null,

    @SerialName("first_post")
    val firstPost: ManagingCreateClaimResponseThreadFirstPost? = null,

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: ManagingCreateClaimResponseThreadLinks? = null,

    @SerialName("permissions")
    val permissions: ManagingCreateClaimResponseThreadPermissions? = null,

    @SerialName("forum")
    val forum: ManagingCreateClaimResponseThreadForum? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPost(
    @SerialName("post_id")
    val postId: Long? = null,

    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("poster_user_id")
    val posterUserId: Long? = null,

    @SerialName("poster_username")
    val posterUsername: String? = null,

    @SerialName("post_create_date")
    val postCreateDate: Long? = null,

    @SerialName("post_body")
    val postBody: String? = null,

    @SerialName("post_body_html")
    val postBodyHtml: String? = null,

    @SerialName("post_body_plain_text")
    val postBodyPlainText: String? = null,

    @SerialName("signature")
    val signature: String? = null,

    @SerialName("signature_html")
    val signatureHtml: String? = null,

    @SerialName("signature_plain_text")
    val signaturePlainText: String? = null,

    @SerialName("post_like_count")
    val postLikeCount: Long? = null,

    @SerialName("post_attachment_count")
    val postAttachmentCount: Long? = null,

    @SerialName("like_users")
    val likeUsers: List<ManagingCreateClaimResponseThreadFirstPostLikeUsersItem>? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("post_is_published")
    val postIsPublished: Boolean? = null,

    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean? = null,

    @SerialName("post_update_date")
    val postUpdateDate: Long? = null,

    @SerialName("post_is_first_post")
    val postIsFirstPost: Boolean? = null,

    @SerialName("links")
    val links: ManagingCreateClaimResponseThreadFirstPostLinks? = null,

    @SerialName("permissions")
    val permissions: ManagingCreateClaimResponseThreadFirstPostPermissions? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostLikeUsersItem(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("is_banned")
    val isBanned: Long? = null,

    @SerialName("uniq_username_css")
    val uniqUsernameCss: String? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("thread")
    val thread: String? = null,

    @SerialName("poster")
    val poster: String? = null,

    @SerialName("likes")
    val likes: String? = null,

    @SerialName("report")
    val report: String? = null,

    @SerialName("attachments")
    val attachments: String? = null,

    @SerialName("poster_avatar")
    val posterAvatar: String? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadFirstPostPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("reply")
    val reply: Boolean? = null,

    @SerialName("like")
    val like: Boolean? = null,

    @SerialName("report")
    val report: Boolean? = null,

    @SerialName("upload_attachment")
    val uploadAttachment: Boolean? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadForum(
    @SerialName("forum_id")
    val forumId: Long? = null,

    @SerialName("forum_title")
    val forumTitle: String? = null,

    @SerialName("forum_description")
    val forumDescription: String? = null,

    @SerialName("forum_thread_count")
    val forumThreadCount: Long? = null,

    @SerialName("forum_post_count")
    val forumPostCount: Long? = null,

    @SerialName("forum_prefixes")
    val forumPrefixes: List<ManagingCreateClaimResponseThreadForumForumPrefixesItem>? = null,

    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long? = null,

    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean? = null,

    @SerialName("links")
    val links: ManagingCreateClaimResponseThreadForumLinks? = null,

    @SerialName("permissions")
    val permissions: ManagingCreateClaimResponseThreadForumPermissions? = null,

    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadForumForumPrefixesItem(
    @SerialName("group_title")
    val groupTitle: String? = null,

    @SerialName("group_prefixes")
    val groupPrefixes: List<ManagingCreateClaimResponseThreadForumForumPrefixesItemGroupPrefixesItem>? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadForumForumPrefixesItemGroupPrefixesItem(
    @SerialName("prefix_id")
    val prefixId: Long? = null,

    @SerialName("prefix_title")
    val prefixTitle: String? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadForumLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("sub-categories")
    val subCategories: String? = null,

    @SerialName("sub-forums")
    val subForums: String? = null,

    @SerialName("threads")
    val threads: String? = null,

    @SerialName("followers")
    val followers: String? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadForumPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("create_thread")
    val createThread: Boolean? = null,

    @SerialName("upload_attachment")
    val uploadAttachment: Boolean? = null,

    @SerialName("tag_thread")
    val tagThread: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("followers")
    val followers: String? = null,

    @SerialName("forum")
    val forum: String? = null,

    @SerialName("posts")
    val posts: String? = null,

    @SerialName("first_poster")
    val firstPoster: String? = null,

    @SerialName("first_poster_avatar")
    val firstPosterAvatar: String? = null,

    @SerialName("first_post")
    val firstPost: String? = null,

    @SerialName("last_poster")
    val lastPoster: String? = null,

    @SerialName("last_post")
    val lastPost: String? = null
)

@Serializable
data class ManagingCreateClaimResponseThreadPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("post")
    val post: Boolean? = null,

    @SerialName("upload_attachment")
    val uploadAttachment: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null
)

@Serializable
data class ManagingEmailCodeResponse(
    @SerialName("item")
    val item: ConfirmationCodeModelItem? = null,

    @SerialName("codeData")
    val codeData: ConfirmationCodeModelCodeData? = null
)

@Serializable
data class ManagingGetLetters2Response(
    @SerialName("email")
    val email: String? = null,

    @SerialName("letters")
    val letters: List<ManagingGetLetters2ResponseLettersItem>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingGetLetters2ResponseLettersItem(
    @SerialName("textHtml")
    val textHtml: String? = null,

    @SerialName("textPlain")
    val textPlain: String? = null,

    @SerialName("from")
    val from: String? = null,

    @SerialName("date")
    val date: Long? = null
)

@Serializable
data class ManagingGetResponse(
    @SerialName("item")
    val item: ConfirmationCodeModelItem? = null,

    @SerialName("canStickItem")
    val canStickItem: Boolean? = null,

    @SerialName("canUnstickItem")
    val canUnstickItem: Boolean? = null,

    @SerialName("canBuyItem")
    val canBuyItem: Boolean? = null,

    @SerialName("cannotBuyItemError")
    val cannotBuyItemError: String? = null,

    @SerialName("canCloseItem")
    val canCloseItem: Boolean? = null,

    @SerialName("canOpenItem")
    val canOpenItem: Boolean? = null,

    @SerialName("canReportItem")
    val canReportItem: Boolean? = null,

    @SerialName("canEditItem")
    val canEditItem: Boolean? = null,

    @SerialName("canDeleteItem")
    val canDeleteItem: Boolean? = null,

    @SerialName("canCancelConfirmedBuy")
    val canCancelConfirmedBuy: Boolean? = null,

    @SerialName("canViewItemHistory")
    val canViewItemHistory: Boolean? = null,

    @SerialName("faveCount")
    val faveCount: Boolean? = null,

    @SerialName("isVisibleItem")
    val isVisibleItem: Boolean? = null,

    @SerialName("canViewLoginData")
    val canViewLoginData: Boolean? = null,

    @SerialName("showToFavouritesButton")
    val showToFavouritesButton: Boolean? = null,

    @SerialName("itemLink")
    val itemLink: String? = null,

    @SerialName("canChangeOwner")
    val canChangeOwner: Boolean? = null,

    @SerialName("sameItemsIds")
    val sameItemsIds: List<Long>? = null,

    @SerialName("sameItemsCount")
    val sameItemsCount: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingImageResponse(
    @SerialName("base64")
    val base64: String? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingSteamGetMafileResponse(
    @SerialName("maFile")
    val maFile: ManagingSteamGetMafileResponseMaFile? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingSteamGetMafileResponseMaFile(
    @SerialName("shared_secret")
    val sharedSecret: String? = null,

    @SerialName("serial_number")
    val serialNumber: Long? = null,

    @SerialName("revocation_code")
    val revocationCode: String? = null,

    @SerialName("uri")
    val uri: String? = null,

    @SerialName("account_name")
    val accountName: String? = null,

    @SerialName("token_gid")
    val tokenGid: String? = null,

    @SerialName("identity_secret")
    val identitySecret: String? = null,

    @SerialName("secret_1")
    val secret1: String? = null,

    @SerialName("device_id")
    val deviceId: String? = null,

    @SerialName("fully_enrolled")
    val fullyEnrolled: Boolean? = null,

    @SerialName("Session")
    val session: ManagingSteamGetMafileResponseMaFileSession? = null
)

@Serializable
data class ManagingSteamGetMafileResponseMaFileSession(
    @SerialName("SessionID")
    val sessionID: String? = null,

    @SerialName("AccessToken")
    val accessToken: String? = null,

    @SerialName("RefreshToken")
    val refreshToken: String? = null,

    @SerialName("SteamID")
    val steamID: String? = null,

    @SerialName("SteamLoginSecure")
    val steamLoginSecure: String? = null
)

@Serializable
data class ManagingSteamInventoryValueResponse(
    @SerialName("query")
    val query: String? = null,

    @SerialName("data")
    val data: ManagingSteamInventoryValueResponseData? = null,

    @SerialName("appId")
    val appId: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingSteamInventoryValueResponseData(
    @SerialName("items")
    val items: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("steam_id")
    val steamId: String? = null,

    @SerialName("appId")
    val appId: Long? = null,

    @SerialName("appTitle")
    val appTitle: String? = null,

    @SerialName("totalValue")
    val totalValue: Double? = null,

    @SerialName("itemCount")
    val itemCount: Long? = null,

    @SerialName("marketableItemCount")
    val marketableItemCount: Long? = null,

    @SerialName("currency")
    val currency: String? = null,

    @SerialName("currencyIcon")
    val currencyIcon: String? = null,

    @SerialName("language")
    val language: String? = null,

    @SerialName("time")
    val time: Long? = null
)

@Serializable
data class ManagingSteamUpdateValueResponse(
    @SerialName("status")
    val status: String? = null,

    @SerialName("item")
    val item: ConfirmationCodeModelItem? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ManagingTelegramCodeResponse(
    @SerialName("item")
    val item: ConfirmationCodeModelItem? = null,

    @SerialName("codes")
    val codes: ManagingTelegramCodeResponseCodes? = null
)

@Serializable
data class ManagingTelegramCodeResponseCodes(
    @SerialName("code")
    val code: String? = null,

    @SerialName("date")
    val date: Long? = null
)

@Serializable
data class ManagingTempEmailPasswordResponse(
    @SerialName("item")
    val item: ManagingTempEmailPasswordResponseItem? = null
)

@Serializable
data class ManagingTempEmailPasswordResponseItem(
    @SerialName("account")
    val account: String? = null
)

@Serializable
data class PaymentsCurrencyResponse(
    @SerialName("currencyList")
    val currencyList: PaymentsCurrencyResponseCurrencyList? = null,

    @SerialName("lastUpdate")
    val lastUpdate: Long? = null,

    @SerialName("visitorCurrency")
    val visitorCurrency: String? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PaymentsCurrencyResponseCurrencyList(
    @SerialName("BTC")
    val bTC: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("ETH")
    val eTH: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("BNB")
    val bNB: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("BCH")
    val bCH: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("XMR")
    val xMR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("SOL")
    val sOL: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("LTC")
    val lTC: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("DASH")
    val dASH: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("TON")
    val tON: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("USDT")
    val uSDT: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("MATIC")
    val mATIC: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("TRX")
    val tRX: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("DOGE")
    val dOGE: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("KWD")
    val kWD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("GBP")
    val gBP: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("CHF")
    val cHF: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("EUR")
    val eUR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("USD")
    val uSD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("SGD")
    val sGD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("CAD")
    val cAD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("AUD")
    val aUD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("NZD")
    val nZD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("BGN")
    val bGN: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("GEL")
    val gEL: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("ILS")
    val iLS: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("QAR")
    val qAR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("PEN")
    val pEN: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("AED")
    val aED: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("SAR")
    val sAR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("PLN")
    val pLN: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("MYR")
    val mYR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("RON")
    val rON: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("BRL")
    val bRL: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("DKK")
    val dKK: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("CNY")
    val cNY: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("HKD")
    val hKD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("SEK")
    val sEK: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("NOK")
    val nOK: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("ZAR")
    val zAR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("MXN")
    val mXN: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("CZK")
    val cZK: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("TWD")
    val tWD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("THB")
    val tHB: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("TRY")
    val tRY: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("UAH")
    val uAH: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("UYU")
    val uYU: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("PHP")
    val pHP: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("INR")
    val iNR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("RUB")
    val rUB: PaymentsCurrencyResponseCurrencyListRUB? = null,

    @SerialName("RSD")
    val rSD: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("JPY")
    val jPY: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("HUF")
    val hUF: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("KZT")
    val kZT: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("CRC")
    val cRC: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("CLP")
    val cLP: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("ARS")
    val aRS: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("KRW")
    val kRW: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("COP")
    val cOP: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("IDR")
    val iDR: PaymentsCurrencyResponseCurrencyListBTC? = null,

    @SerialName("VND")
    val vND: PaymentsCurrencyResponseCurrencyListBTC? = null
)

@Serializable
data class PaymentsCurrencyResponseCurrencyListBTC(
    @SerialName("title")
    val title: String? = null,

    @SerialName("rate")
    val rate: Double? = null,

    @SerialName("formattedRate")
    val formattedRate: String? = null,

    @SerialName("symbol")
    val symbol: String? = null
)
