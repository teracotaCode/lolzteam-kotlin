package com.lolzteam.generated.forum.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.JsonElement

@Serializable
data class TagsListResponse(
    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("tags_total")
    val tagsTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class TagsPopularResponse(
    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsBumpResponse(
    @SerialName("status")
    val status: String? = null,

    @SerialName("message")
    val message: String? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsCreateResponse(
    @SerialName("thread")
    val thread: ThreadsCreateResponseThread? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsCreateResponseThread(
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

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

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

    @SerialName("thread_is_closed")
    val threadIsClosed: Boolean? = null,

    @SerialName("thread_is_followed")
    val threadIsFollowed: Boolean? = null,

    @SerialName("thread_is_starred")
    val threadIsStarred: Boolean? = null,

    @SerialName("first_post")
    val firstPost: RespThreadModelFirstPost? = null,

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: RespThreadModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespThreadModelPermissions? = null,

    @SerialName("node_title")
    val nodeTitle: String? = null,

    @SerialName("restrictions")
    val restrictions: RespThreadModelRestrictions? = null,

    @SerialName("last_post")
    val lastPost: RespThreadModelFirstPost? = null,

    @SerialName("contest")
    val contest: RespThreadModelContest? = null
)

@Serializable
data class ThreadsFollowedResponse(
    @SerialName("threads")
    val threads: List<ThreadsFollowedResponseThreadsItem>? = null,

    @SerialName("threads_total")
    val threadsTotal: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsFollowedResponseThreadsItem(
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

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

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
    val firstPost: ThreadsFollowedResponseThreadsItemFirstPost? = null,

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: RespThreadModelLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsFollowedResponseThreadsItemPermissions? = null,

    @SerialName("forum")
    val forum: ThreadsListResponseForum? = null,

    @SerialName("follow")
    val follow: ThreadsFollowersResponseUsersItemFollow? = null
)

@Serializable
data class ThreadsFollowedResponseThreadsItemFirstPost(
    @SerialName("post_id")
    val postId: Long? = null,

    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("poster_user_id")
    val posterUserId: Long? = null,

    @SerialName("poster_username")
    val posterUsername: String? = null,

    @SerialName("poster_username_html")
    val posterUsernameHtml: String? = null,

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
    val likeUsers: List<ThreadsFollowedResponseThreadsItemFirstPostLikeUsersItem>? = null,

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
    val links: ThreadsFollowedResponseThreadsItemFirstPostLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsFollowedResponseThreadsItemFirstPostPermissions? = null
)

@Serializable
data class ThreadsFollowedResponseThreadsItemFirstPostLikeUsersItem(
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
data class ThreadsFollowedResponseThreadsItemFirstPostLinks(
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
data class ThreadsFollowedResponseThreadsItemFirstPostPermissions(
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
data class ThreadsFollowedResponseThreadsItemPermissions(
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
    val edit: Boolean? = null,

    @SerialName("edit_title")
    val editTitle: Boolean? = null,

    @SerialName("edit_tags")
    val editTags: Boolean? = null
)

@Serializable
data class ThreadsFollowersResponse(
    @SerialName("users")
    val users: List<ThreadsFollowersResponseUsersItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsFollowersResponseUsersItem(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("follow")
    val follow: ThreadsFollowersResponseUsersItemFollow? = null
)

@Serializable
data class ThreadsFollowersResponseUsersItemFollow(
    @SerialName("alert")
    val alert: Boolean? = null,

    @SerialName("email")
    val email: Boolean? = null
)

@Serializable
data class ThreadsListResponse(
    @SerialName("threads")
    val threads: List<RespThreadModel>? = null,

    @SerialName("forum")
    val forum: ThreadsListResponseForum? = null,

    @SerialName("threads_total")
    val threadsTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsListResponseForum(
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
    val forumPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long? = null,

    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean? = null,

    @SerialName("links")
    val links: ForumsListResponseForumsItemLinks? = null,

    @SerialName("permissions")
    val permissions: ForumsGetResponseForumPermissions? = null,

    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean? = null
)

@Serializable
data class ThreadsListResponseLinks(
    @SerialName("pages")
    val pages: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("next")
    val next: String? = null
)

@Serializable
data class ThreadsNavigationResponse(
    @SerialName("elements")
    val elements: List<ThreadsNavigationResponseElementsItem>? = null,

    @SerialName("elements_count")
    val elementsCount: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsNavigationResponseElementsItem(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("category_title")
    val categoryTitle: String? = null,

    @SerialName("category_description")
    val categoryDescription: String? = null,

    @SerialName("links")
    val links: NavigationListResponseElementsItemLinks? = null,

    @SerialName("permissions")
    val permissions: CategoriesListResponseCategoriesItemPermissions? = null,

    @SerialName("navigation_type")
    val navigationType: String? = null,

    @SerialName("navigation_id")
    val navigationId: Long? = null,

    @SerialName("navigation_depth")
    val navigationDepth: Long? = null,

    @SerialName("navigation_parent_id")
    val navigationParentId: Long? = null,

    @SerialName("has_sub_elements")
    val hasSubElements: Boolean? = null
)

@Serializable
data class ThreadsPollGetResponse(
    @SerialName("poll")
    val poll: ThreadsPollGetResponsePoll? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsPollGetResponsePoll(
    @SerialName("poll_id")
    val pollId: Long? = null,

    @SerialName("poll_question")
    val pollQuestion: String? = null,

    @SerialName("poll_vote_count")
    val pollVoteCount: Long? = null,

    @SerialName("poll_max_votes")
    val pollMaxVotes: Long? = null,

    @SerialName("poll_is_open")
    val pollIsOpen: Boolean? = null,

    @SerialName("poll_is_voted")
    val pollIsVoted: Boolean? = null,

    @SerialName("responses")
    val responses: List<ThreadsPollGetResponsePollResponsesItem>? = null,

    @SerialName("permissions")
    val permissions: ThreadsPollGetResponsePollPermissions? = null,

    @SerialName("links")
    val links: ThreadsPollGetResponsePollLinks? = null
)

@Serializable
data class ThreadsPollGetResponsePollLinks(
    @SerialName("vote")
    val vote: String? = null
)

@Serializable
data class ThreadsPollGetResponsePollPermissions(
    @SerialName("vote")
    val vote: Boolean? = null,

    @SerialName("result")
    val result: Boolean? = null
)

@Serializable
data class ThreadsPollGetResponsePollResponsesItem(
    @SerialName("response_id")
    val responseId: Long? = null,

    @SerialName("response_answer")
    val responseAnswer: String? = null,

    @SerialName("response_vote_count")
    val responseVoteCount: Long? = null
)

@Serializable
data class ThreadsRecentResponse(
    @SerialName("threads")
    val threads: List<RespThreadModel>? = null,

    @SerialName("data")
    val data: List<ThreadsRecentResponseDataItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsRecentResponseDataItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

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

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

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
    val firstPost: ThreadsRecentResponseDataItemFirstPost? = null,

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: ThreadsUnreadResponseDataItemLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsUnreadResponseDataItemPermissions? = null,

    @SerialName("forum")
    val forum: ThreadsListResponseForum? = null
)

@Serializable
data class ThreadsRecentResponseDataItemFirstPost(
    @SerialName("post_id")
    val postId: Long? = null,

    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("poster_user_id")
    val posterUserId: Long? = null,

    @SerialName("poster_username")
    val posterUsername: String? = null,

    @SerialName("poster_username_html")
    val posterUsernameHtml: String? = null,

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
    val links: ThreadsFollowedResponseThreadsItemFirstPostLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsFollowedResponseThreadsItemFirstPostPermissions? = null
)

@Serializable
data class ThreadsUnreadResponse(
    @SerialName("threads")
    val threads: List<RespThreadModel>? = null,

    @SerialName("data")
    val data: List<ThreadsUnreadResponseDataItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ThreadsUnreadResponseDataItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

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

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

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
    val firstPost: ThreadsFollowedResponseThreadsItemFirstPost? = null,

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: ThreadsUnreadResponseDataItemLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsUnreadResponseDataItemPermissions? = null,

    @SerialName("forum")
    val forum: ThreadsListResponseForum? = null
)

@Serializable
data class ThreadsUnreadResponseDataItemLinks(
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
data class ThreadsUnreadResponseDataItemPermissions(
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
data class UsersClaimsResponse(
    @SerialName("claims")
    val claims: List<UsersClaimsResponseClaimsItem>? = null,

    @SerialName("stats")
    val stats: UsersClaimsResponseStats? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersClaimsResponseClaimsItem(
    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("claim_date")
    val claimDate: Long? = null,

    @SerialName("claim_state")
    val claimState: String? = null,

    @SerialName("message_body")
    val messageBody: String? = null,

    @SerialName("message_body_html")
    val messageBodyHtml: String? = null,

    @SerialName("message_body_plain_text")
    val messageBodyPlainText: String? = null,

    @SerialName("amount")
    val amount: Long? = null,

    @SerialName("amount_formatted")
    val amountFormatted: String? = null,

    @SerialName("author")
    val author: RespProfilePostModelTimelineUser? = null
)

@Serializable
data class UsersClaimsResponseStats(
    @SerialName("market")
    val market: UsersClaimsResponseStatsMarket? = null,

    @SerialName("noMarket")
    val noMarket: UsersClaimsResponseStatsMarket? = null
)

@Serializable
data class UsersClaimsResponseStatsMarket(
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
data class UsersContentsResponse(
    @SerialName("data")
    val data: List<UsersContentsResponseDataItem>? = null,

    @SerialName("data_total")
    val dataTotal: Long? = null,

    @SerialName("user")
    val user: RespProfilePostModelTimelineUser? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersContentsResponseDataItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

    @SerialName("post_id")
    val postId: Long? = null,

    @SerialName("thread_id")
    val threadId: Long? = null,

    @SerialName("poster_user_id")
    val posterUserId: Long? = null,

    @SerialName("poster_username")
    val posterUsername: String? = null,

    @SerialName("poster_username_html")
    val posterUsernameHtml: String? = null,

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
    val likeUsers: List<ThreadsFollowedResponseThreadsItemFirstPostLikeUsersItem>? = null,

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
    val links: ThreadsFollowedResponseThreadsItemFirstPostLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsFollowedResponseThreadsItemFirstPostPermissions? = null,

    @SerialName("thread")
    val thread: UsersContentsResponseDataItemThread? = null
)

@Serializable
data class UsersContentsResponseDataItemThread(
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

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

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

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: ThreadsUnreadResponseDataItemLinks? = null,

    @SerialName("permissions")
    val permissions: UsersContentsResponseDataItemThreadPermissions? = null
)

@Serializable
data class UsersContentsResponseDataItemThreadPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("post")
    val post: Boolean? = null,

    @SerialName("upload_attachment")
    val uploadAttachment: Boolean? = null
)

@Serializable
data class UsersEditFields(
    @SerialName("location")
    val location: String? = null,

    @SerialName("occupation")
    val occupation: String? = null,

    @SerialName("homepage")
    val homepage: String? = null,

    @SerialName("_4")
    val v4: String? = null,

    @SerialName("lztInnovationLink")
    val lztInnovationLink: String? = null,

    @SerialName("lztInnovation20Link")
    val lztInnovation20Link: String? = null,

    @SerialName("lztInnovation30Link")
    val lztInnovation30Link: String? = null,

    @SerialName("telegram")
    val telegram: String? = null,

    @SerialName("vk")
    val vk: String? = null,

    @SerialName("discord")
    val discord: String? = null,

    @SerialName("steam")
    val steam: String? = null,

    @SerialName("jabber")
    val jabber: String? = null,

    @SerialName("github")
    val github: String? = null,

    @SerialName("matrix")
    val matrix: String? = null
)

@Serializable
data class UsersFieldsResponse(
    @SerialName("fields")
    val fields: List<UsersFieldsResponseFieldsItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersFieldsResponseFieldsItem(
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
data class UsersFindResponse(
    @SerialName("users")
    val users: List<RespUserModel>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersFollowersResponse(
    @SerialName("users")
    val users: List<UsersFollowersResponseUsersItem>? = null,

    @SerialName("users_total")
    val usersTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersFollowersResponseUsersItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

    @SerialName("follow_date")
    val followDate: Long? = null,

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

    @SerialName("user_following_count")
    val userFollowingCount: Long? = null,

    @SerialName("user_followers_count")
    val userFollowersCount: Long? = null,

    @SerialName("links")
    val links: UsersFollowersResponseUsersItemLinks? = null,

    @SerialName("permissions")
    val permissions: RespUserModelPermissions? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean? = null,

    @SerialName("user_group_id")
    val userGroupId: Long? = null,

    @SerialName("custom_fields")
    val customFields: UsersFollowersResponseUsersItemCustomFields? = null
)

@Serializable
data class UsersFollowersResponseUsersItemCustomFields(
    @SerialName("_4")
    val v4: String? = null,

    @SerialName("lztInnovation20Link")
    val lztInnovation20Link: String? = null,

    @SerialName("lztInnovation30Link")
    val lztInnovation30Link: String? = null,

    @SerialName("lztInnovationLink")
    val lztInnovationLink: String? = null
)

@Serializable
data class UsersFollowersResponseUsersItemLinks(
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
data class UsersFollowingsResponse(
    @SerialName("users")
    val users: List<UsersFollowingsResponseUsersItem>? = null,

    @SerialName("users_total")
    val usersTotal: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersFollowingsResponseUsersItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

    @SerialName("follow_date")
    val followDate: Long? = null,

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

    @SerialName("short_link")
    val shortLink: String? = null,

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

    @SerialName("user_following_count")
    val userFollowingCount: Long? = null,

    @SerialName("user_followers_count")
    val userFollowersCount: Long? = null,

    @SerialName("links")
    val links: UsersFollowersResponseUsersItemLinks? = null,

    @SerialName("permissions")
    val permissions: RespUserModelPermissions? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean? = null,

    @SerialName("user_group_id")
    val userGroupId: Long? = null,

    @SerialName("custom_fields")
    val customFields: UsersFollowingsResponseUsersItemCustomFields? = null
)

@Serializable
data class UsersFollowingsResponseUsersItemCustomFields(
    @SerialName("_4")
    val v4: String? = null,

    @SerialName("allowSelfUnban")
    val allowSelfUnban: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("discord")
    val discord: String? = null,

    @SerialName("github")
    val github: String? = null,

    @SerialName("jabber")
    val jabber: String? = null,

    @SerialName("lztAwardUserTrophy")
    val lztAwardUserTrophy: String? = null,

    @SerialName("lztCuratorNodeTitle")
    val lztCuratorNodeTitle: String? = null,

    @SerialName("lztCuratorNodeTitleEn")
    val lztCuratorNodeTitleEn: String? = null,

    @SerialName("lztDeposit")
    val lztDeposit: String? = null,

    @SerialName("lztInnovation20Link")
    val lztInnovation20Link: String? = null,

    @SerialName("lztInnovation30Link")
    val lztInnovation30Link: String? = null,

    @SerialName("lztInnovationLink")
    val lztInnovationLink: String? = null,

    @SerialName("lztLikesIncreasing")
    val lztLikesIncreasing: String? = null,

    @SerialName("lztLikesZeroing")
    val lztLikesZeroing: String? = null,

    @SerialName("lztSympathyIncreasing")
    val lztSympathyIncreasing: String? = null,

    @SerialName("lztSympathyZeroing")
    val lztSympathyZeroing: String? = null,

    @SerialName("maecenasValue")
    val maecenasValue: String? = null,

    @SerialName("scamURL")
    val scamURL: String? = null,

    @SerialName("steam")
    val steam: String? = null,

    @SerialName("telegram")
    val telegram: String? = null,

    @SerialName("vk")
    val vk: String? = null
)

@Serializable
data class UsersGetResponse(
    @SerialName("user")
    val user: RespProfilePostModelTimelineUser? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersIgnoredResponse(
    @SerialName("users")
    val users: List<UsersIgnoredResponseUsersItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersIgnoredResponseUsersItem(
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

    @SerialName("convertedDeposit")
    val convertedDeposit: Long? = null,

    @SerialName("custom_fields")
    val customFields: UsersIgnoredResponseUsersItemCustomFields? = null,

    @SerialName("deposit")
    val deposit: Long? = null,

    @SerialName("homepage")
    val homepage: String? = null,

    @SerialName("ignored_info")
    val ignoredInfo: UsersIgnoredResponseUsersItemIgnoredInfo? = null,

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

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("like2_count")
    val like2Count: Long? = null,

    @SerialName("like_count")
    val likeCount: Long? = null,

    @SerialName("location")
    val location: String? = null,

    @SerialName("message_count")
    val messageCount: Long? = null,

    @SerialName("register_date")
    val registerDate: Long? = null,

    @SerialName("rendered")
    val rendered: UsersIgnoredResponseUsersItemRendered? = null,

    @SerialName("short_link")
    val shortLink: String? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("user_title")
    val userTitle: String? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("view_url")
    val viewUrl: String? = null,

    @SerialName("warning_points")
    val warningPoints: Long? = null
)

@Serializable
data class UsersIgnoredResponseUsersItemCustomFields(
    @SerialName("_4")
    val v4: String? = null,

    @SerialName("scamURL")
    val scamURL: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("lztLikesZeroing")
    val lztLikesZeroing: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("lztLikesIncreasing")
    val lztLikesIncreasing: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("lztSympathyZeroing")
    val lztSympathyZeroing: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("lztSympathyIncreasing")
    val lztSympathyIncreasing: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("telegram")
    val telegram: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("vk")
    val vk: String? = null,

    @SerialName("discord")
    val discord: String? = null,

    @SerialName("steam")
    val steam: String? = null,

    @SerialName("matrix")
    val matrix: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("jabber")
    val jabber: String? = null,

    @SerialName("github")
    val github: String? = null
)

@Serializable
data class UsersIgnoredResponseUsersItemIgnoredInfo(
    @SerialName("ignore_content")
    val ignoreContent: Long? = null,

    @SerialName("ignore_conversations")
    val ignoreConversations: Long? = null,

    @SerialName("restrict_view_profile")
    val restrictViewProfile: Long? = null
)

@Serializable
data class UsersIgnoredResponseUsersItemRendered(
    @SerialName("username")
    val username: String? = null,

    @SerialName("avatars")
    val avatars: RespChatboxMessageModelUserRenderedAvatars? = null,

    @SerialName("backgrounds")
    val backgrounds: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("link")
    val link: String? = null
)

@Serializable
data class UsersLikesResponse(
    @SerialName("page")
    val page: Long? = null,

    @SerialName("perPage")
    val perPage: Long? = null,

    @SerialName("contentType")
    val contentType: String? = null,

    @SerialName("totalLikes")
    val totalLikes: Long? = null,

    @SerialName("likes")
    val likes: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersListResponse(
    @SerialName("users")
    val users: List<RespUserModel>? = null,

    @SerialName("users_total")
    val usersTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersSAResetResponse(
    @SerialName("success")
    val success: Boolean? = null,

    @SerialName("waiting_time")
    val waitingTime: String? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersSecretAnswerTypesResponse(
    @SerialName("data")
    val data: List<UsersSecretAnswerTypesResponseDataItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersSecretAnswerTypesResponseDataItem(
    @SerialName("sa_id")
    val saId: Long? = null,

    @SerialName("renderedPhrase")
    val renderedPhrase: String? = null
)

@Serializable
data class UsersTrophiesResponse(
    @SerialName("trophies")
    val trophies: List<UsersTrophiesResponseTrophiesItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class UsersTrophiesResponseTrophiesItem(
    @SerialName("trophy_id")
    val trophyId: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("trophy_url")
    val trophyUrl: String? = null
)
