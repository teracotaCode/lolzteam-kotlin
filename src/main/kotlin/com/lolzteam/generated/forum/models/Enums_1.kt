package com.lolzteam.generated.forum.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
enum class AllowViewProfile {
    @SerialName("none")
    NONE,

    @SerialName("members")
    MEMBERS,

    @SerialName("followed")
    FOLLOWED
}

@Serializable
enum class ClaimState {
    @SerialName("active")
    ACTIVE,

    @SerialName("solved")
    SOLVED,

    @SerialName("rejected")
    REJECTED,

    @SerialName("settled")
    SETTLED
}

@Serializable
enum class ContentType {
    @SerialName("post")
    POST,

    @SerialName("post_comment")
    POST_COMMENT,

    @SerialName("profile_post")
    PROFILE_POST,

    @SerialName("profile_post_comment")
    PROFILE_POST_COMMENT
}

@Serializable
enum class ContestType {
    @SerialName("by_finish_date")
    BY_FINISH_DATE
}

@Serializable
enum class Currency {
    @SerialName("rub")
    RUB,

    @SerialName("uah")
    UAH,

    @SerialName("kzt")
    KZT,

    @SerialName("byn")
    BYN,

    @SerialName("usd")
    USD,

    @SerialName("eur")
    EUR,

    @SerialName("gbp")
    GBP,

    @SerialName("cny")
    CNY,

    @SerialName("try")
    TRY
}

@Serializable
enum class DeleteType {
    @SerialName("delete")
    DELETE,

    @SerialName("delete_ignore")
    DELETE_IGNORE
}

@Serializable
enum class Direction {
    @SerialName("asc")
    ASC,

    @SerialName("desc")
    DESC
}

@Serializable
enum class Duration {
    @SerialName("day")
    DAY,

    @SerialName("week")
    WEEK,

    @SerialName("month")
    MONTH
}

@Serializable
enum class FieldsIncludeItem {
    @SerialName("*")
    _,

    @SerialName("latest_posts")
    LATEST_POSTS
}

@Serializable
enum class FieldsIncludeItem2 {
    @SerialName("*")
    _,

    @SerialName("alerts")
    ALERTS
}

@Serializable
enum class FieldsIncludeItem3 {
    @SerialName("*")
    _,

    @SerialName("latest_comments")
    LATEST_COMMENTS
}

@Serializable
enum class Folder {
    @SerialName("all")
    ALL,

    @SerialName("unread")
    UNREAD,

    @SerialName("groups")
    GROUPS,

    @SerialName("market")
    MARKET,

    @SerialName("market_replacements")
    MARKET_REPLACEMENTS,

    @SerialName("staff")
    STAFF,

    @SerialName("giveaways")
    GIVEAWAYS,

    @SerialName("p2p")
    P2P
}

@Serializable
enum class FormId {
    @SerialName("1")
    V_1
}

@Serializable
enum class Gender {
    @SerialName("")
    UNKNOWN,

    @SerialName("male")
    MALE,

    @SerialName("female")
    FEMALE
}

@Serializable
enum class GrantType {
    @SerialName("client_credentials")
    CLIENT_CREDENTIALS
}

@Serializable
enum class LanguageId {
    @SerialName("1")
    V_1,

    @SerialName("2")
    V_2
}

@Serializable
enum class LengthOption {
    @SerialName("minutes")
    MINUTES,

    @SerialName("hours")
    HOURS,

    @SerialName("days")
    DAYS
}

@Serializable
enum class LikeType {
    @SerialName("like")
    LIKE,

    @SerialName("like2")
    LIKE2
}

@Serializable
enum class Order {
    @SerialName("natural")
    NATURAL,

    @SerialName("list")
    LIST
}

@Serializable
enum class Order2 {
    @SerialName("post_date")
    POST_DATE,

    @SerialName("last_post_date")
    LAST_POST_DATE,

    @SerialName("reply_count")
    REPLY_COUNT,

    @SerialName("reply_count_asc")
    REPLY_COUNT_ASC,

    @SerialName("first_post_likes")
    FIRST_POST_LIKES,

    @SerialName("vote_count")
    VOTE_COUNT
}
