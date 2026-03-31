package com.lolzteam.generated.forum.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
enum class Order3 {
    @SerialName("natural")
    NATURAL,

    @SerialName("natural_reverse")
    NATURAL_REVERSE,

    @SerialName("post_likes")
    POST_LIKES,

    @SerialName("post_likes_reverse")
    POST_LIKES_REVERSE
}

@Serializable
enum class Order4 {
    @SerialName("natural")
    NATURAL,

    @SerialName("follow_date")
    FOLLOW_DATE,

    @SerialName("follow_date_reverse")
    FOLLOW_DATE_REVERSE
}

@Serializable
enum class Order5 {
    @SerialName("natural")
    NATURAL,

    @SerialName("natural_reverse")
    NATURAL_REVERSE
}

@Serializable
enum class PayClaim {
    @SerialName("now")
    NOW,

    @SerialName("later")
    LATER
}

@Serializable
enum class Period {
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
enum class PrizeDataUpgrade {
    @SerialName("1")
    V_1,

    @SerialName("6")
    V_6,

    @SerialName("12")
    V_12,

    @SerialName("14")
    V_14,

    @SerialName("17")
    V_17,

    @SerialName("19")
    V_19,

    @SerialName("20")
    V_20,

    @SerialName("21")
    V_21,

    @SerialName("22")
    V_22
}

@Serializable
enum class PrizeType {
    @SerialName("money")
    MONEY,

    @SerialName("upgrades")
    UPGRADES
}

@Serializable
enum class ReplyGroup {
    @SerialName("0")
    V_0,

    @SerialName("2")
    V_2,

    @SerialName("21")
    V_21,

    @SerialName("22")
    V_22,

    @SerialName("23")
    V_23,

    @SerialName("60")
    V_60,

    @SerialName("351")
    V_351
}

@Serializable
enum class RoomIDModel {
    @SerialName("1")
    V_1,

    @SerialName("2")
    V_2,

    @SerialName("3")
    V_3,

    @SerialName("4")
    V_4,

    @SerialName("13")
    V_13
}

@Serializable
enum class RoomId {
    @SerialName("1")
    V_1,

    @SerialName("2")
    V_2,

    @SerialName("3")
    V_3,

    @SerialName("4")
    V_4,

    @SerialName("13")
    V_13
}

@Serializable
enum class ScopeItem {
    @SerialName("basic")
    BASIC,

    @SerialName("read")
    READ,

    @SerialName("post")
    POST,

    @SerialName("conversate")
    CONVERSATE,

    @SerialName("market")
    MARKET,

    @SerialName("payment")
    PAYMENT,

    @SerialName("invoice")
    INVOICE
}

@Serializable
enum class State {
    @SerialName("active")
    ACTIVE,

    @SerialName("closed")
    CLOSED
}

@Serializable
enum class TransferType {
    @SerialName("guarantor")
    GUARANTOR,

    @SerialName("safe")
    SAFE,

    @SerialName("notsafe")
    NOTSAFE
}

@Serializable
enum class Type {
    @SerialName("market")
    MARKET,

    @SerialName("nomarket")
    NOMARKET
}

@Serializable
enum class Type2 {
    @SerialName("gotten")
    GOTTEN,

    @SerialName("given")
    GIVEN
}
