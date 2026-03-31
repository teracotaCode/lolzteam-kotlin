package com.lolzteam.generated.market.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
enum class EmailTypeItem {
    @SerialName("autoreg")
    AUTOREG,

    @SerialName("native")
    NATIVE,

    @SerialName("no")
    NO,

    @SerialName("no_market")
    NO_MARKET
}

@Serializable
enum class EmailTypeItem2 {
    @SerialName("market")
    MARKET,

    @SerialName("autoreg")
    AUTOREG,

    @SerialName("native")
    NATIVE,

    @SerialName("no")
    NO
}

@Serializable
enum class EmailTypeItem3 {
    @SerialName("autoreg")
    AUTOREG,

    @SerialName("native")
    NATIVE,

    @SerialName("no")
    NO
}

@Serializable
enum class EmailTypeItem4 {
    @SerialName("native")
    NATIVE,

    @SerialName("no")
    NO
}

@Serializable
enum class FieldsIncludeItem {
    @SerialName("*")
    _,

    @SerialName("searchHistory")
    SEARCHHISTORY,

    @SerialName("savedSearch")
    SAVEDSEARCH
}

@Serializable
enum class Format {
    @SerialName("short")
    SHORT,

    @SerialName("custom")
    CUSTOM,

    @SerialName("mfa_file_steam_id")
    MFA_FILE_STEAM_ID,

    @SerialName("mfa_file_login")
    MFA_FILE_LOGIN
}

@Serializable
enum class HoldLengthOption {
    @SerialName("hour")
    HOUR,

    @SerialName("day")
    DAY,

    @SerialName("week")
    WEEK,

    @SerialName("month")
    MONTH,

    @SerialName("year")
    YEAR
}

@Serializable
enum class ItemOrigin {
    @SerialName("brute")
    BRUTE,

    @SerialName("phishing")
    PHISHING,

    @SerialName("stealer")
    STEALER,

    @SerialName("personal")
    PERSONAL,

    @SerialName("resale")
    RESALE,

    @SerialName("autoreg")
    AUTOREG,

    @SerialName("dummy")
    DUMMY
}

@Serializable
enum class LolRankItem {
    @SerialName("Unranked")
    UNRANKED,

    @SerialName("IRON IV")
    IRON_IV,

    @SerialName("IRON III")
    IRON_III,

    @SerialName("IRON II")
    IRON_II,

    @SerialName("IRON I")
    IRON_I,

    @SerialName("BRONZE IV")
    BRONZE_IV,

    @SerialName("BRONZE III")
    BRONZE_III,

    @SerialName("BRONZE II")
    BRONZE_II,

    @SerialName("BRONZE I")
    BRONZE_I,

    @SerialName("SILVER IV")
    SILVER_IV,

    @SerialName("SILVER III")
    SILVER_III,

    @SerialName("SILVER II")
    SILVER_II,

    @SerialName("SILVER I")
    SILVER_I,

    @SerialName("GOLD IV")
    GOLD_IV,

    @SerialName("GOLD III")
    GOLD_III,

    @SerialName("GOLD II")
    GOLD_II,

    @SerialName("GOLD I")
    GOLD_I,

    @SerialName("PLATINUM IV")
    PLATINUM_IV,

    @SerialName("PLATINUM III")
    PLATINUM_III,

    @SerialName("PLATINUM II")
    PLATINUM_II,

    @SerialName("PLATINUM I")
    PLATINUM_I,

    @SerialName("EMERALD IV")
    EMERALD_IV,

    @SerialName("EMERALD III")
    EMERALD_III,

    @SerialName("EMERALD II")
    EMERALD_II,

    @SerialName("EMERALD I")
    EMERALD_I,

    @SerialName("DIAMOND IV")
    DIAMOND_IV,

    @SerialName("DIAMOND III")
    DIAMOND_III,

    @SerialName("DIAMOND II")
    DIAMOND_II,

    @SerialName("DIAMOND I")
    DIAMOND_I,

    @SerialName("MASTER I")
    MASTER_I,

    @SerialName("GRANDMASTER I")
    GRANDMASTER_I,

    @SerialName("CHALLENGER I")
    CHALLENGER_I
}

@Serializable
enum class NitroTypeItem {
    @SerialName("basic")
    BASIC,

    @SerialName("classic")
    CLASSIC,

    @SerialName("full")
    FULL,

    @SerialName("none")
    NONE,

    @SerialName("trial")
    TRIAL
}

@Serializable
enum class OpenaiTierItem {
    @SerialName("tier1")
    TIER1,

    @SerialName("tier2")
    TIER2,

    @SerialName("tier3")
    TIER3,

    @SerialName("tier4")
    TIER4,

    @SerialName("tier5")
    TIER5
}

@Serializable
enum class OrderBy {
    @SerialName("price_to_up")
    PRICE_TO_UP,

    @SerialName("price_to_down")
    PRICE_TO_DOWN,

    @SerialName("pdate_to_down")
    PDATE_TO_DOWN,

    @SerialName("pdate_to_up")
    PDATE_TO_UP,

    @SerialName("pdate_to_down_upload")
    PDATE_TO_DOWN_UPLOAD,

    @SerialName("pdate_to_up_upload")
    PDATE_TO_UP_UPLOAD,

    @SerialName("edate_to_up")
    EDATE_TO_UP,

    @SerialName("edate_to_down")
    EDATE_TO_DOWN,

    @SerialName("ddate_to_up")
    DDATE_TO_UP,

    @SerialName("ddate_to_down")
    DDATE_TO_DOWN
}

@Serializable
enum class OriginItem {
    @SerialName("brute")
    BRUTE,

    @SerialName("phishing")
    PHISHING,

    @SerialName("stealer")
    STEALER,

    @SerialName("personal")
    PERSONAL,

    @SerialName("resale")
    RESALE,

    @SerialName("autoreg")
    AUTOREG,

    @SerialName("self_registration")
    SELF_REGISTRATION,

    @SerialName("retrieve")
    RETRIEVE,

    @SerialName("retrieve_via_support")
    RETRIEVE_VIA_SUPPORT,

    @SerialName("dummy")
    DUMMY
}

@Serializable
enum class OriginItem2 {
    @SerialName("brute")
    BRUTE,

    @SerialName("phishing")
    PHISHING,

    @SerialName("stealer")
    STEALER,

    @SerialName("personal")
    PERSONAL,

    @SerialName("resale")
    RESALE,

    @SerialName("autoreg")
    AUTOREG,

    @SerialName("dummy")
    DUMMY,

    @SerialName("self_registration")
    SELF_REGISTRATION
}

@Serializable
enum class PlatformItem {
    @SerialName("Epic")
    EPIC,

    @SerialName("EpicAndroid")
    EPICANDROID,

    @SerialName("EpicIOS")
    EPICIOS,

    @SerialName("EpicPC")
    EPICPC,

    @SerialName("EpicPCKorea")
    EPICPCKOREA,

    @SerialName("GooglePlay")
    GOOGLEPLAY,

    @SerialName("IOSAppStore")
    IOSAPPSTORE,

    @SerialName("Live")
    LIVE,

    @SerialName("Nintendo")
    NINTENDO,

    @SerialName("OneStoreKorea")
    ONESTOREKOREA,

    @SerialName("PSN")
    PSN,

    @SerialName("Samsung")
    SAMSUNG
}

@Serializable
enum class RankHypixelItem {
    @SerialName("MVP")
    MVP,

    @SerialName("MVP+")
    MVP_,

    @SerialName("MVP++")
    MVP__,

    @SerialName("VIP")
    VIP,

    @SerialName("VIP+")
    VIP_,

    @SerialName("YOUTUBE")
    YOUTUBE
}

@Serializable
enum class RegPeriod {
    @SerialName("day")
    DAY,

    @SerialName("month")
    MONTH,

    @SerialName("year")
    YEAR
}

@Serializable
enum class Region {
    @SerialName("af")
    AF,

    @SerialName("as")
    AS,

    @SerialName("cis")
    CIS,

    @SerialName("eu")
    EU,

    @SerialName("me")
    ME,

    @SerialName("oc")
    OC,

    @SerialName("us")
    US
}

@Serializable
enum class RegionItem {
    @SerialName("asia")
    ASIA,

    @SerialName("cht")
    CHT,

    @SerialName("eu")
    EU,

    @SerialName("usa")
    USA
}

@Serializable
enum class RegionItem2 {
    @SerialName("asia")
    ASIA,

    @SerialName("eu")
    EU,

    @SerialName("na")
    NA,

    @SerialName("ru")
    RU
}
