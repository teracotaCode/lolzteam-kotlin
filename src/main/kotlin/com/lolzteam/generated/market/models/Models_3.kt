package com.lolzteam.generated.market.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.JsonElement

@Serializable
data class PaymentsCurrencyResponseCurrencyListRUB(
    @SerialName("title")
    val title: String? = null,

    @SerialName("rate")
    val rate: Long? = null,

    @SerialName("formattedRate")
    val formattedRate: String? = null,

    @SerialName("symbol")
    val symbol: String? = null
)

@Serializable
data class PaymentsFeeResponse(
    @SerialName("commission_percentage")
    val commissionPercentage: Long? = null,

    @SerialName("spentCurrentMonth")
    val spentCurrentMonth: Long? = null,

    @SerialName("calculator")
    val calculator: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PaymentsHistoryResponse(
    @SerialName("payments")
    val payments: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("perPage")
    val perPage: String? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("pageNavLink")
    val pageNavLink: String? = null,

    @SerialName("pageNavParams")
    val pageNavParams: PaymentsHistoryResponsePageNavParams? = null,

    @SerialName("periodLabel")
    val periodLabel: String? = null,

    @SerialName("periodLabelPhrase")
    val periodLabelPhrase: String? = null,

    @SerialName("filterDatesDefault")
    val filterDatesDefault: Boolean? = null,

    @SerialName("input")
    val input: PaymentsHistoryResponseInput? = null,

    @SerialName("paymentStats")
    val paymentStats: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hasNextPage")
    val hasNextPage: Boolean? = null,

    @SerialName("lastOperationId")
    val lastOperationId: Long? = null,

    @SerialName("nextPageHref")
    val nextPageHref: String? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PaymentsHistoryResponseInput(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("type")
    val `type`: String? = null,

    @SerialName("startDate")
    val startDate: String? = null,

    @SerialName("endDate")
    val endDate: String? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("period_label")
    val periodLabel: String? = null,

    @SerialName("receiver")
    val receiver: String? = null,

    @SerialName("sender")
    val sender: String? = null,

    @SerialName("comment")
    val comment: String? = null,

    @SerialName("pmin")
    val pmin: String? = null,

    @SerialName("pmax")
    val pmax: String? = null,

    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("wallet")
    val wallet: String? = null,

    @SerialName("is_hold")
    val isHold: Boolean? = null,

    @SerialName("currency")
    val currency: String? = null,

    @SerialName("operation_id_lt")
    val operationIdLt: Long? = null
)

@Serializable
data class PaymentsHistoryResponsePageNavParams(
    @SerialName("type")
    val `type`: String? = null,

    @SerialName("startDate")
    val startDate: String? = null,

    @SerialName("endDate")
    val endDate: String? = null
)

@Serializable
data class PaymentsInvoiceGetResponse(
    @SerialName("invoice")
    val invoice: PaymentsInvoiceGetResponseInvoice? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PaymentsInvoiceGetResponseInvoice(
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
data class PaymentsInvoiceListResponse(
    @SerialName("invoices")
    val invoices: List<InvoiceModel>? = null,

    @SerialName("count")
    val count: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PaymentsPayoutExtra(
    @SerialName("provider")
    val provider: String? = null
)

@Serializable
data class PaymentsPayoutServicesResponse(
    @SerialName("systems")
    val systems: List<PaymentsPayoutServicesResponseSystemsItem>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PaymentsPayoutServicesResponseSystemsItem(
    @SerialName("system")
    val system: String? = null,

    @SerialName("commission")
    val commission: String? = null,

    @SerialName("min")
    val min: Long? = null,

    @SerialName("max")
    val max: Long? = null,

    @SerialName("instant_payout")
    val instantPayout: Boolean? = null,

    @SerialName("problematic_payout")
    val problematicPayout: Boolean? = null,

    @SerialName("is_unavailable")
    val isUnavailable: Boolean? = null,

    @SerialName("p2p")
    val p2p: Boolean? = null,

    @SerialName("has_wallet")
    val hasWallet: Boolean? = null,

    @SerialName("providers")
    val providers: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class ProfileClaimsResponse(
    @SerialName("claims")
    val claims: List<ProfileClaimsResponseClaimsItem>? = null,

    @SerialName("stats")
    val stats: ProfileClaimsResponseStats? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ProfileClaimsResponseClaimsItem(
    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("claim_date")
    val claimDate: Long? = null,

    @SerialName("claim_state")
    val claimState: String? = null,

    @SerialName("message_body")
    val messageBody: String? = null,

    @SerialName("amount_formatted")
    val amountFormatted: String? = null,

    @SerialName("author")
    val author: ProfileClaimsResponseClaimsItemAuthor? = null
)

@Serializable
data class ProfileClaimsResponseClaimsItemAuthor(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("username_html")
    val usernameHtml: String? = null,

    @SerialName("user_message_count")
    val userMessageCount: Long? = null,

    @SerialName("user_register_date")
    val userRegisterDate: Long? = null,

    @SerialName("user_like_count")
    val userLikeCount: Long? = null,

    @SerialName("user_like2_count")
    val userLike2Count: Long? = null,

    @SerialName("contest_count")
    val contestCount: Long? = null,

    @SerialName("trophy_count")
    val trophyCount: Long? = null,

    @SerialName("custom_title")
    val customTitle: String? = null,

    @SerialName("is_banned")
    val isBanned: Long? = null,

    @SerialName("user_title")
    val userTitle: String? = null,

    @SerialName("user_is_valid")
    val userIsValid: Boolean? = null,

    @SerialName("user_is_verified")
    val userIsVerified: Boolean? = null,

    @SerialName("user_is_followed")
    val userIsFollowed: Boolean? = null,

    @SerialName("user_last_seen_date")
    val userLastSeenDate: Long? = null,

    @SerialName("links")
    val links: ProfileClaimsResponseClaimsItemAuthorLinks? = null,

    @SerialName("permissions")
    val permissions: ProfileClaimsResponseClaimsItemAuthorPermissions? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean? = null,

    @SerialName("user_group_id")
    val userGroupId: Long? = null,

    @SerialName("ban_reason")
    val banReason: String? = null,

    @SerialName("fields")
    val fields: List<ProfileClaimsResponseClaimsItemAuthorFieldsItem>? = null
)

@Serializable
data class ProfileClaimsResponseClaimsItemAuthorFieldsItem(
    @SerialName("id")
    val id: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("position")
    val position: String? = null,

    @SerialName("is_required")
    val isRequired: Boolean? = null
)

@Serializable
data class ProfileClaimsResponseClaimsItemAuthorLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("avatar")
    val avatar: String? = null,

    @SerialName("avatar_big")
    val avatarBig: String? = null,

    @SerialName("avatar_small")
    val avatarSmall: String? = null,

    @SerialName("followers")
    val followers: String? = null,

    @SerialName("followings")
    val followings: String? = null,

    @SerialName("ignore")
    val ignore: String? = null,

    @SerialName("timeline")
    val timeline: String? = null
)

@Serializable
data class ProfileClaimsResponseClaimsItemAuthorPermissions(
    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("ignore")
    val ignore: Boolean? = null
)

@Serializable
data class ProfileClaimsResponseStats(
    @SerialName("market")
    val market: ProfileClaimsResponseStatsMarket? = null,

    @SerialName("noMarket")
    val noMarket: ProfileClaimsResponseStatsMarket? = null
)

@Serializable
data class ProfileClaimsResponseStatsMarket(
    @SerialName("total")
    val total: Long? = null,

    @SerialName("solved")
    val solved: Long? = null,

    @SerialName("settled")
    val settled: Long? = null,

    @SerialName("rejected")
    val rejected: Long? = null
)

@Serializable
data class ProfileEditOption(
    @SerialName("disable_steam_guard")
    val disableSteamGuard: Boolean? = null,

    @SerialName("deauthorize_steam")
    val deauthorizeSteam: Boolean? = null,

    @SerialName("change_password_on_purchase")
    val changePasswordOnPurchase: Boolean? = null,

    @SerialName("hide_favourites")
    val hideFavourites: Boolean? = null,

    @SerialName("show_too_low_price_change_warning")
    val showTooLowPriceChangeWarning: Boolean? = null
)

@Serializable
data class ProfileEditUser(
    @SerialName("currency")
    val currency: Currency? = null,

    @SerialName("user_allow_ask_discount")
    val userAllowAskDiscount: Boolean? = null,

    @SerialName("max_discount_percent")
    val maxDiscountPercent: Long? = null,

    @SerialName("market_custom_title")
    val marketCustomTitle: String? = null
)

@Serializable
data class ProfileGetResponse(
    @SerialName("user")
    val user: ProfileGetResponseUser? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ProfileGetResponseUser(
    @SerialName("active_items_count")
    val activeItemsCount: Long? = null,

    @SerialName("activity_visible")
    val activityVisible: Boolean? = null,

    @SerialName("age")
    val age: Long? = null,

    @SerialName("balance")
    val balance: String? = null,

    @SerialName("balances")
    val balances: List<UserModelBalancesItem>? = null,

    @SerialName("bump_item_period")
    val bumpItemPeriod: Long? = null,

    @SerialName("can_edit")
    val canEdit: Boolean? = null,

    @SerialName("can_follow")
    val canFollow: Boolean? = null,

    @SerialName("can_ignore")
    val canIgnore: Boolean? = null,

    @SerialName("can_post_profile")
    val canPostProfile: Boolean? = null,

    @SerialName("can_view_profile")
    val canViewProfile: Boolean? = null,

    @SerialName("can_view_profile_posts")
    val canViewProfilePosts: Boolean? = null,

    @SerialName("can_warn")
    val canWarn: Boolean? = null,

    @SerialName("contest_count")
    val contestCount: Long? = null,

    @SerialName("conv_welcome_message")
    val convWelcomeMessage: String? = null,

    @SerialName("convertedBalance")
    val convertedBalance: Long? = null,

    @SerialName("convertedDeposit")
    val convertedDeposit: Long? = null,

    @SerialName("convertedHold")
    val convertedHold: Long? = null,

    @SerialName("currency")
    val currency: String? = null,

    @SerialName("currencyPhrase")
    val currencyPhrase: String? = null,

    @SerialName("custom_account_download_format")
    val customAccountDownloadFormat: String? = null,

    @SerialName("custom_fields")
    val customFields: UserModelCustomFields? = null,

    @SerialName("custom_title")
    val customTitle: String? = null,

    @SerialName("deposit")
    val deposit: Long? = null,

    @SerialName("dob")
    val dob: UserModelDob? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hold")
    val hold: String? = null,

    @SerialName("homepage")
    val homepage: String? = null,

    @SerialName("imap_data")
    val imapData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("is_admin")
    val isAdmin: Boolean? = null,

    @SerialName("is_banned")
    val isBanned: Boolean? = null,

    @SerialName("is_followed")
    val isFollowed: Boolean? = null,

    @SerialName("is_ignored")
    val isIgnored: Boolean? = null,

    @SerialName("is_moderator")
    val isModerator: Boolean? = null,

    @SerialName("is_staff")
    val isStaff: Boolean? = null,

    @SerialName("is_super_admin")
    val isSuperAdmin: Boolean? = null,

    @SerialName("joined_date")
    val joinedDate: Long? = null,

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("like2_count")
    val like2Count: Long? = null,

    @SerialName("like_count")
    val likeCount: Long? = null,

    @SerialName("location")
    val location: String? = null,

    @SerialName("market_custom_title")
    val marketCustomTitle: String? = null,

    @SerialName("max_discount_percent")
    val maxDiscountPercent: Long? = null,

    @SerialName("message_count")
    val messageCount: Long? = null,

    @SerialName("paid_mail_left")
    val paidMailLeft: Long? = null,

    @SerialName("public_tags")
    val publicTags: List<UserModelPublicTagsItem>? = null,

    @SerialName("register_date")
    val registerDate: Long? = null,

    @SerialName("rendered")
    val rendered: UserModelRendered? = null,

    @SerialName("restore_count")
    val restoreCount: Long? = null,

    @SerialName("restore_data")
    val restoreData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("short_link")
    val shortLink: String? = null,

    @SerialName("sold_items_count")
    val soldItemsCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("telegram_client")
    val telegramClient: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("user_allow_ask_discount")
    val userAllowAskDiscount: Boolean? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("user_title")
    val userTitle: String? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("view_url")
    val viewUrl: String? = null,

    @SerialName("visible")
    val visible: Boolean? = null,

    @SerialName("warning_points")
    val warningPoints: Long? = null
)

@Serializable
data class ProxyGetResponse(
    @SerialName("proxies")
    val proxies: List<ProxyGetResponseProxiesItem>? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class ProxyGetResponseProxiesItem(
    @SerialName("proxy")
    val proxy: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class PublishingFastSellExtra(
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
data class PublishingFastSellResponse(
    @SerialName("item")
    val item: ConfirmationCodeModelItem? = null,

    @SerialName("itemLink")
    val itemLink: String? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PurchasingConfirmResponse(
    @SerialName("status")
    val status: String? = null,

    @SerialName("item")
    val item: PurchasingConfirmResponseItem? = null,

    @SerialName("system_info")
    val systemInfo: ItemListModelSystemInfo? = null
)

@Serializable
data class PurchasingConfirmResponseItem(
    @SerialName("loginData")
    val loginData: PurchasingConfirmResponseItemLoginData? = null
)

@Serializable
data class PurchasingConfirmResponseItemLoginData(
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
    val encodedOldPassword: String? = null,

    @SerialName("adviceToChangePassword")
    val adviceToChangePassword: Boolean? = null
)

@Serializable
data class RespSystemInfo(
    @SerialName("visitor_id")
    val visitorId: Long? = null,

    @SerialName("time")
    val time: Long? = null,

    @SerialName("log_id")
    val logId: Long? = null
)

@Serializable
data class SaveChangesResponse(
    @SerialName("status")
    val status: String? = null,

    @SerialName("message")
    val message: String? = null,

    @SerialName("system_info")
    val systemInfo: RespSystemInfo? = null
)

@Serializable
data class UserModel(
    @SerialName("active_items_count")
    val activeItemsCount: Long? = null,

    @SerialName("activity_visible")
    val activityVisible: Boolean? = null,

    @SerialName("age")
    val age: Long? = null,

    @SerialName("balance")
    val balance: String? = null,

    @SerialName("balances")
    val balances: List<UserModelBalancesItem>? = null,

    @SerialName("bump_item_period")
    val bumpItemPeriod: Long? = null,

    @SerialName("can_edit")
    val canEdit: Boolean? = null,

    @SerialName("can_follow")
    val canFollow: Boolean? = null,

    @SerialName("can_ignore")
    val canIgnore: Boolean? = null,

    @SerialName("can_post_profile")
    val canPostProfile: Boolean? = null,

    @SerialName("can_view_profile")
    val canViewProfile: Boolean? = null,

    @SerialName("can_view_profile_posts")
    val canViewProfilePosts: Boolean? = null,

    @SerialName("can_warn")
    val canWarn: Boolean? = null,

    @SerialName("contest_count")
    val contestCount: Long? = null,

    @SerialName("conv_welcome_message")
    val convWelcomeMessage: String? = null,

    @SerialName("convertedBalance")
    val convertedBalance: Long? = null,

    @SerialName("convertedDeposit")
    val convertedDeposit: Long? = null,

    @SerialName("convertedHold")
    val convertedHold: Long? = null,

    @SerialName("currency")
    val currency: String? = null,

    @SerialName("currencyPhrase")
    val currencyPhrase: String? = null,

    @SerialName("custom_account_download_format")
    val customAccountDownloadFormat: String? = null,

    @SerialName("custom_fields")
    val customFields: UserModelCustomFields? = null,

    @SerialName("custom_title")
    val customTitle: String? = null,

    @SerialName("deposit")
    val deposit: Long? = null,

    @SerialName("dob")
    val dob: UserModelDob? = null,

    @SerialName("feedback_data")
    val feedbackData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("hold")
    val hold: String? = null,

    @SerialName("homepage")
    val homepage: String? = null,

    @SerialName("imap_data")
    val imapData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("is_admin")
    val isAdmin: Boolean? = null,

    @SerialName("is_banned")
    val isBanned: Boolean? = null,

    @SerialName("is_followed")
    val isFollowed: Boolean? = null,

    @SerialName("is_ignored")
    val isIgnored: Boolean? = null,

    @SerialName("is_moderator")
    val isModerator: Boolean? = null,

    @SerialName("is_staff")
    val isStaff: Boolean? = null,

    @SerialName("is_super_admin")
    val isSuperAdmin: Boolean? = null,

    @SerialName("joined_date")
    val joinedDate: Long? = null,

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("like2_count")
    val like2Count: Long? = null,

    @SerialName("like_count")
    val likeCount: Long? = null,

    @SerialName("location")
    val location: String? = null,

    @SerialName("market_custom_title")
    val marketCustomTitle: String? = null,

    @SerialName("max_discount_percent")
    val maxDiscountPercent: Long? = null,

    @SerialName("message_count")
    val messageCount: Long? = null,

    @SerialName("paid_mail_left")
    val paidMailLeft: Long? = null,

    @SerialName("public_tags")
    val publicTags: List<UserModelPublicTagsItem>? = null,

    @SerialName("register_date")
    val registerDate: Long? = null,

    @SerialName("rendered")
    val rendered: UserModelRendered? = null,

    @SerialName("restore_count")
    val restoreCount: Long? = null,

    @SerialName("restore_data")
    val restoreData: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("short_link")
    val shortLink: String? = null,

    @SerialName("sold_items_count")
    val soldItemsCount: Long? = null,

    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("telegram_client")
    val telegramClient: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("user_allow_ask_discount")
    val userAllowAskDiscount: Boolean? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("user_title")
    val userTitle: String? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("view_url")
    val viewUrl: String? = null,

    @SerialName("visible")
    val visible: Boolean? = null,

    @SerialName("warning_points")
    val warningPoints: Long? = null
)

@Serializable
data class UserModelBalancesItem(
    @SerialName("balance")
    val balance: String? = null,

    @SerialName("balance_id")
    val balanceId: Long? = null,

    @SerialName("convertedBalance")
    val convertedBalance: Double? = null,

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
data class UserModelCustomFields(
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

    @SerialName("lztAwardUserTrophy")
    val lztAwardUserTrophy: String? = null,

    @SerialName("lztLikesIncreasing")
    val lztLikesIncreasing: String? = null,

    @SerialName("lztLikesZeroing")
    val lztLikesZeroing: String? = null,

    @SerialName("lztSympathyIncreasing")
    val lztSympathyIncreasing: String? = null,

    @SerialName("lztSympathyZeroing")
    val lztSympathyZeroing: String? = null,

    @SerialName("lztUnbanAmount")
    val lztUnbanAmount: String? = null,

    @SerialName("maecenasValue")
    val maecenasValue: String? = null,

    @SerialName("scamURL")
    val scamURL: String? = null,

    @SerialName("steam")
    val steam: String? = null,

    @SerialName("telegram")
    val telegram: String? = null,

    @SerialName("vk")
    val vk: String? = null,

    @SerialName("favoritePorn")
    val favoritePorn: String? = null,

    @SerialName("favoriteVape")
    val favoriteVape: String? = null,

    @SerialName("favoriteAnime")
    val favoriteAnime: String? = null,

    @SerialName("matrix")
    val matrix: String? = null
)

@Serializable
data class UserModelDob(
    @SerialName("year")
    val year: Long? = null,

    @SerialName("month")
    val month: Long? = null,

    @SerialName("day")
    val day: Long? = null
)

@Serializable
data class UserModelPublicTagsItem(
    @SerialName("background_color")
    val backgroundColor: String? = null,

    @SerialName("tag_id")
    val tagId: Long? = null,

    @SerialName("title")
    val title: String? = null
)

@Serializable
data class UserModelRendered(
    @SerialName("username")
    val username: String? = null,

    @SerialName("avatars")
    val avatars: UserModelRenderedAvatars? = null,

    @SerialName("backgrounds")
    val backgrounds: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("link")
    val link: String? = null
)

@Serializable
data class UserModelRenderedAvatars(
    @SerialName("l")
    val l: String? = null,

    @SerialName("m")
    val m: String? = null,

    @SerialName("s")
    val s: String? = null
)
