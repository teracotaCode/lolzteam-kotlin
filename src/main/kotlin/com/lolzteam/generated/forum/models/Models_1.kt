package com.lolzteam.generated.forum.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.JsonElement

@Serializable
data class AssetsCssResponse(
    @SerialName("contents")
    val contents: String? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class AssetsCssResponseSystemInfo(
    @SerialName("visitor_id")
    val visitorId: Long? = null,

    @SerialName("time")
    val time: Long? = null
)

@Serializable
data class BatchExecuteResponse(
    @SerialName("jobs")
    val jobs: BatchExecuteResponseJobs? = null
)

@Serializable
data class BatchExecuteResponseJobs(
    @SerialName("job_id")
    val jobId: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class CategoriesGetResponse(
    @SerialName("category")
    val category: CategoriesListResponseCategoriesItem? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class CategoriesListResponse(
    @SerialName("categories")
    val categories: List<CategoriesListResponseCategoriesItem>? = null,

    @SerialName("categories_total")
    val categoriesTotal: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class CategoriesListResponseCategoriesItem(
    @SerialName("category_id")
    val categoryId: Long? = null,

    @SerialName("category_title")
    val categoryTitle: String? = null,

    @SerialName("category_description")
    val categoryDescription: String? = null,

    @SerialName("links")
    val links: CategoriesListResponseCategoriesItemLinks? = null,

    @SerialName("permissions")
    val permissions: CategoriesListResponseCategoriesItemPermissions? = null
)

@Serializable
data class CategoriesListResponseCategoriesItemLinks(
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
data class CategoriesListResponseCategoriesItemPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null
)

@Serializable
data class ChatboxGetIgnoreResponse(
    @SerialName("ignored")
    val ignored: List<ChatboxGetIgnoreResponseIgnoredItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ChatboxGetIgnoreResponseIgnoredItem(
    @SerialName("avatar_date")
    val avatarDate: Long? = null,

    @SerialName("background_date")
    val backgroundDate: Long? = null,

    @SerialName("contest_count")
    val contestCount: Long? = null,

    @SerialName("custom_title")
    val customTitle: String? = null,

    @SerialName("display_banner_id")
    val displayBannerId: Long? = null,

    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("is_banned")
    val isBanned: Boolean? = null,

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("like2_count")
    val like2Count: Long? = null,

    @SerialName("like_count")
    val likeCount: Long? = null,

    @SerialName("message_count")
    val messageCount: Long? = null,

    @SerialName("register_date")
    val registerDate: Long? = null,

    @SerialName("rendered")
    val rendered: RespChatboxMessageModelUserRendered? = null,

    @SerialName("short_link")
    val shortLink: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("uniq_banner")
    val uniqBanner: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("uniq_username_css")
    val uniqUsernameCss: String? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null
)

@Serializable
data class ChatboxGetLeaderboardResponse(
    @SerialName("leaderboard")
    val leaderboard: List<ChatboxGetLeaderboardResponseLeaderboardItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardItem(
    @SerialName("count")
    val count: Long? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("avatar_date")
    val avatarDate: Long? = null,

    @SerialName("background_date")
    val backgroundDate: Long? = null,

    @SerialName("contest_count")
    val contestCount: Long? = null,

    @SerialName("custom_title")
    val customTitle: String? = null,

    @SerialName("display_banner_id")
    val displayBannerId: Long? = null,

    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("is_banned")
    val isBanned: Boolean? = null,

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("like2_count")
    val like2Count: Long? = null,

    @SerialName("like_count")
    val likeCount: Long? = null,

    @SerialName("message_count")
    val messageCount: Long? = null,

    @SerialName("register_date")
    val registerDate: Long? = null,

    @SerialName("rendered")
    val rendered: RespChatboxMessageModelUserRendered? = null,

    @SerialName("short_link")
    val shortLink: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("uniq_banner")
    val uniqBanner: ChatboxGetLeaderboardResponseLeaderboardItemUniqBanner? = null,

    @SerialName("uniq_username_css")
    val uniqUsernameCss: String? = null,

    @SerialName("username")
    val username: String? = null
)

@Serializable
data class ChatboxGetLeaderboardResponseLeaderboardItemUniqBanner(
    @SerialName("banner_css")
    val bannerCss: String? = null,

    @SerialName("banner_text")
    val bannerText: String? = null,

    @SerialName("banner_icon")
    val bannerIcon: String? = null
)

@Serializable
data class ChatboxGetMessagesResponse(
    @SerialName("messages")
    val messages: List<RespChatboxMessageModel>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ChatboxIndexResponse(
    @SerialName("rooms")
    val rooms: List<RespChatboxMessageModelRoom>? = null,

    @SerialName("ban")
    val ban: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("ignore")
    val ignore: List<ChatboxIndexResponseIgnoreItem>? = null,

    @SerialName("permissions")
    val permissions: ChatboxIndexResponsePermissions? = null,

    @SerialName("commands")
    val commands: List<String>? = null,

    @SerialName("roomsOnline")
    val roomsOnline: ChatboxIndexResponseRoomsOnline? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ChatboxIndexResponseIgnoreItem(
    @SerialName("avatar_date")
    val avatarDate: Long? = null,

    @SerialName("background_date")
    val backgroundDate: Long? = null,

    @SerialName("contest_count")
    val contestCount: Long? = null,

    @SerialName("custom_title")
    val customTitle: String? = null,

    @SerialName("display_banner_id")
    val displayBannerId: Long? = null,

    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,

    @SerialName("display_style_group_id")
    val displayStyleGroupId: Long? = null,

    @SerialName("is_admin")
    val isAdmin: Boolean? = null,

    @SerialName("is_banned")
    val isBanned: Boolean? = null,

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

    @SerialName("message_count")
    val messageCount: Long? = null,

    @SerialName("register_date")
    val registerDate: Long? = null,

    @SerialName("rendered")
    val rendered: RespChatboxMessageModelUserRendered? = null,

    @SerialName("short_link")
    val shortLink: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("uniq_banner")
    val uniqBanner: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("uniq_username_css")
    val uniqUsernameCss: String? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null
)

@Serializable
data class ChatboxIndexResponsePermissions(
    @SerialName("deleteAnyMessage")
    val deleteAnyMessage: Boolean? = null,

    @SerialName("editAnyMessage")
    val editAnyMessage: Boolean? = null,

    @SerialName("viewAnyMessage")
    val viewAnyMessage: Boolean? = null,

    @SerialName("viewMessages")
    val viewMessages: Boolean? = null,

    @SerialName("postMessage")
    val postMessage: Boolean? = null,

    @SerialName("ban")
    val ban: Boolean? = null
)

@Serializable
data class ChatboxIndexResponseRoomsOnline(
    @SerialName("chat:0")
    val chat0: Long? = null
)

@Serializable
data class ChatboxOnlineResponse(
    @SerialName("users")
    val users: List<RespChatboxMessageModelUser>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ChatboxPostMessageResponse(
    @SerialName("message")
    val message: ChatboxPostMessageResponseMessage? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ChatboxPostMessageResponseMessage(
    @SerialName("can_report")
    val canReport: Boolean? = null,

    @SerialName("date")
    val date: Long? = null,

    @SerialName("is_deleted")
    val isDeleted: Boolean? = null,

    @SerialName("message")
    val message: String? = null,

    @SerialName("message_id")
    val messageId: Long? = null,

    @SerialName("messageJson")
    val messageJson: String? = null,

    @SerialName("messageRaw")
    val messageRaw: String? = null,

    @SerialName("room")
    val room: RespChatboxMessageModelRoom? = null,

    @SerialName("user")
    val user: RespChatboxMessageModelUser? = null
)

@Serializable
data class ConversationsCreateResponse(
    @SerialName("conversation")
    val conversation: ConversationsCreateResponseConversation? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ConversationsCreateResponseConversation(
    @SerialName("conversation_id")
    val conversationId: Long? = null,

    @SerialName("conversation_title")
    val conversationTitle: String? = null,

    @SerialName("creator_user_id")
    val creatorUserId: Long? = null,

    @SerialName("creator_username")
    val creatorUsername: String? = null,

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

    @SerialName("conversation_create_date")
    val conversationCreateDate: Long? = null,

    @SerialName("conversation_update_date")
    val conversationUpdateDate: Long? = null,

    @SerialName("conversation_last_read_date")
    val conversationLastReadDate: Long? = null,

    @SerialName("conversation_online_count")
    val conversationOnlineCount: Long? = null,

    @SerialName("is_starred")
    val isStarred: Long? = null,

    @SerialName("is_group")
    val isGroup: Long? = null,

    @SerialName("is_unread")
    val isUnread: Long? = null,

    @SerialName("alerts")
    val alerts: Long? = null,

    @SerialName("permissions")
    val permissions: RespConversationModelPermissions? = null,

    @SerialName("conversation_message_count")
    val conversationMessageCount: Long? = null,

    @SerialName("conversation_is_new")
    val conversationIsNew: Boolean? = null,

    @SerialName("creator_is_ignored")
    val creatorIsIgnored: Boolean? = null,

    @SerialName("conversation_is_open")
    val conversationIsOpen: Boolean? = null,

    @SerialName("conversation_is_deleted")
    val conversationIsDeleted: Boolean? = null,

    @SerialName("recipient")
    val recipient: RespConversationModelRecipient? = null,

    @SerialName("recipients")
    val recipients: List<RespConversationModelRecipient>? = null,

    @SerialName("links")
    val links: RespConversationModelLinks? = null
)

@Serializable
data class ConversationsListResponse(
    @SerialName("conversations")
    val conversations: List<RespConversationModel>? = null,

    @SerialName("can_start")
    val canStart: Boolean? = null,

    @SerialName("folders")
    val folders: List<ConversationsListResponseFoldersItem>? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ConversationsListResponseFoldersItem(
    @SerialName("id")
    val id: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("name")
    val name: String? = null
)

@Serializable
data class ConversationsMessagesCreateResponse(
    @SerialName("message")
    val message: ConversationsMessagesCreateResponseMessage? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ConversationsMessagesCreateResponseMessage(
    @SerialName("message_id")
    val messageId: Long? = null,

    @SerialName("conversation_id")
    val conversationId: Long? = null,

    @SerialName("creator_user_id")
    val creatorUserId: Long? = null,

    @SerialName("creator_username")
    val creatorUsername: String? = null,

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

    @SerialName("message_create_date")
    val messageCreateDate: Long? = null,

    @SerialName("message_is_unread")
    val messageIsUnread: Long? = null,

    @SerialName("message_need_translate")
    val messageNeedTranslate: Boolean? = null,

    @SerialName("message_is_system")
    val messageIsSystem: Boolean? = null,

    @SerialName("message_edit_date")
    val messageEditDate: Long? = null,

    @SerialName("message_body")
    val messageBody: String? = null,

    @SerialName("message_body_html")
    val messageBodyHtml: String? = null,

    @SerialName("message_body_plain_text")
    val messageBodyPlainText: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("links")
    val links: RespConversationMessageModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespConversationMessageModelPermissions? = null
)

@Serializable
data class ConversationsMessagesGetResponse(
    @SerialName("message")
    val message: ConversationsCreateResponseConversation? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ConversationsMessagesListResponse(
    @SerialName("messages")
    val messages: List<RespConversationMessageModel>? = null,

    @SerialName("messages_total")
    val messagesTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ConversationsSearchResponse(
    @SerialName("conversations")
    val conversations: List<RespConversationModel>? = null,

    @SerialName("recipients")
    val recipients: Boolean? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class FormsCreateResponse(
    @SerialName("message")
    val message: String? = null,

    @SerialName("content")
    val content: FormsCreateResponseContent? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class FormsCreateResponseContent(
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

    @SerialName("thread_prefixes")
    val threadPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: FormsCreateResponseContentLinks? = null,

    @SerialName("permissions")
    val permissions: FormsCreateResponseContentPermissions? = null,

    @SerialName("node_title")
    val nodeTitle: String? = null
)

@Serializable
data class FormsCreateResponseContentLinks(
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
    val firstPost: String? = null
)

@Serializable
data class FormsCreateResponseContentPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("post")
    val post: Boolean? = null
)

@Serializable
data class FormsListResponse(
    @SerialName("forms")
    val forms: List<FormsListResponseFormsItem>? = null,

    @SerialName("formsPerPage")
    val formsPerPage: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("totalForms")
    val totalForms: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class FormsListResponseFormsItem(
    @SerialName("form_id")
    val formId: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("fields")
    val fields: List<FormsListResponseFormsItemFieldsItem>? = null
)

@Serializable
data class FormsListResponseFormsItemFieldsItem(
    @SerialName("field_id")
    val fieldId: Long? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("fieldChoices")
    val fieldChoices: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("required")
    val required: Long? = null,

    @SerialName("max_length")
    val maxLength: Long? = null,

    @SerialName("default_value")
    val defaultValue: String? = null
)

@Serializable
data class ForumsFollowedResponse(
    @SerialName("forums")
    val forums: List<ForumsFollowedResponseForumsItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ForumsFollowedResponseForumsItem(
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
    val forumPrefixes: List<ForumsListResponseForumsItemForumPrefixesItem>? = null,

    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long? = null,

    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean? = null,

    @SerialName("links")
    val links: ForumsListResponseForumsItemLinks? = null,

    @SerialName("permissions")
    val permissions: ForumsGetResponseForumPermissions? = null,

    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean? = null,

    @SerialName("follow")
    val follow: ForumsFollowersResponseUsersItemFollow? = null
)

@Serializable
data class ForumsFollowersResponse(
    @SerialName("users")
    val users: List<ForumsFollowersResponseUsersItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ForumsFollowersResponseUsersItem(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("follow")
    val follow: ForumsFollowersResponseUsersItemFollow? = null
)

@Serializable
data class ForumsFollowersResponseUsersItemFollow(
    @SerialName("post")
    val post: Boolean? = null,

    @SerialName("alert")
    val alert: Boolean? = null,

    @SerialName("email")
    val email: Boolean? = null
)

@Serializable
data class ForumsGetFeedOptionsResponse(
    @SerialName("forums")
    val forums: List<ForumsGetFeedOptionsResponseForumsItem>? = null,

    @SerialName("excluded_forums_ids")
    val excludedForumsIds: List<Long>? = null,

    @SerialName("default_excluded_forums_ids")
    val defaultExcludedForumsIds: List<Long>? = null,

    @SerialName("keywords")
    val keywords: String? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ForumsGetFeedOptionsResponseForumsItem(
    @SerialName("forum_id")
    val forumId: Long? = null,

    @SerialName("forum_title")
    val forumTitle: String? = null,

    @SerialName("forum_description")
    val forumDescription: String? = null,

    @SerialName("parent_node_id")
    val parentNodeId: Long? = null,

    @SerialName("links")
    val links: ForumsListResponseForumsItemLinks? = null,

    @SerialName("permissions")
    val permissions: ForumsListResponseForumsItemPermissions? = null,

    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean? = null,

    @SerialName("has_children")
    val hasChildren: Boolean? = null
)

@Serializable
data class ForumsGetResponse(
    @SerialName("forum")
    val forum: ForumsGetResponseForum? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ForumsGetResponseForum(
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
    val forumPrefixes: List<ForumsListResponseForumsItemForumPrefixesItem>? = null,

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
data class ForumsGetResponseForumPermissions(
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
data class ForumsGroupedResponse(
    @SerialName("data")
    val data: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("tabs")
    val tabs: List<ForumsListResponseTabsItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ForumsListResponse(
    @SerialName("forums")
    val forums: List<ForumsListResponseForumsItem>? = null,

    @SerialName("forums_total")
    val forumsTotal: Long? = null,

    @SerialName("tabs")
    val tabs: List<ForumsListResponseTabsItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ForumsListResponseForumsItem(
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
    val forumPrefixes: List<ForumsListResponseForumsItemForumPrefixesItem>? = null,

    @SerialName("thread_default_prefix_id")
    val threadDefaultPrefixId: Long? = null,

    @SerialName("thread_prefix_is_required")
    val threadPrefixIsRequired: Boolean? = null,

    @SerialName("links")
    val links: ForumsListResponseForumsItemLinks? = null,

    @SerialName("permissions")
    val permissions: ForumsListResponseForumsItemPermissions? = null,

    @SerialName("forum_is_followed")
    val forumIsFollowed: Boolean? = null
)

@Serializable
data class ForumsListResponseForumsItemForumPrefixesItem(
    @SerialName("group_title")
    val groupTitle: String? = null,

    @SerialName("group_prefixes")
    val groupPrefixes: List<ForumsListResponseForumsItemForumPrefixesItemGroupPrefixesItem>? = null
)

@Serializable
data class ForumsListResponseForumsItemForumPrefixesItemGroupPrefixesItem(
    @SerialName("prefix_id")
    val prefixId: Long? = null,

    @SerialName("prefix_title")
    val prefixTitle: String? = null
)

@Serializable
data class ForumsListResponseForumsItemLinks(
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
data class ForumsListResponseForumsItemPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("create_thread")
    val createThread: Boolean? = null,

    @SerialName("tag_thread")
    val tagThread: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null
)

@Serializable
data class ForumsListResponseTabsItem(
    @SerialName("link_title")
    val linkTitle: String? = null,

    @SerialName("isDefault")
    val isDefault: Boolean? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("isHidden")
    val isHidden: Boolean? = null
)

@Serializable
data class LinksGetResponse(
    @SerialName("link-forum")
    val linkForum: LinksGetResponseLinkForum? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class LinksGetResponseLinkForum(
    @SerialName("link_id")
    val linkId: Long? = null,

    @SerialName("link_title")
    val linkTitle: String? = null,

    @SerialName("link_description")
    val linkDescription: String? = null,

    @SerialName("links")
    val links: RespLinkModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespLinkModelPermissions? = null
)

@Serializable
data class LinksListResponse(
    @SerialName("link-forums")
    val linkForums: List<RespLinkModel>? = null,

    @SerialName("link-forums_total")
    val linkForumsTotal: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class NavigationListResponse(
    @SerialName("elements")
    val elements: List<NavigationListResponseElementsItem>? = null,

    @SerialName("elements_count")
    val elementsCount: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class NavigationListResponseElementsItem(
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

    @SerialName("navigation_parent_id")
    val navigationParentId: Long? = null,

    @SerialName("has_sub_elements")
    val hasSubElements: Boolean? = null
)

@Serializable
data class NavigationListResponseElementsItemLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("sub-categories")
    val subCategories: String? = null,

    @SerialName("sub-forums")
    val subForums: String? = null,

    @SerialName("sub-elements")
    val subElements: String? = null
)

@Serializable
data class NotificationsGetResponse(
    @SerialName("notification_id")
    val notificationId: Long? = null,

    @SerialName("notification")
    val notification: NotificationsGetResponseNotification? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class NotificationsGetResponseNotification(
    @SerialName("notification_id")
    val notificationId: Long? = null,

    @SerialName("notification_create_date")
    val notificationCreateDate: Long? = null,

    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

    @SerialName("content_action")
    val contentAction: String? = null,

    @SerialName("notification_is_unread")
    val notificationIsUnread: Boolean? = null,

    @SerialName("creator_user_id")
    val creatorUserId: Long? = null,

    @SerialName("creator_username")
    val creatorUsername: String? = null,

    @SerialName("creator_username_html")
    val creatorUsernameHtml: String? = null,

    @SerialName("notification_type")
    val notificationType: String? = null,

    @SerialName("links")
    val links: RespNotificationModelLinks? = null,

    @SerialName("notification_html")
    val notificationHtml: String? = null
)

@Serializable
data class NotificationsListResponse(
    @SerialName("notifications")
    val notifications: List<RespNotificationModel>? = null,

    @SerialName("notifications_total")
    val notificationsTotal: Long? = null,

    @SerialName("links")
    val links: NotificationsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class NotificationsListResponseLinks(
    @SerialName("read")
    val read: String? = null,

    @SerialName("pages")
    val pages: Long? = null,

    @SerialName("page")
    val page: Long? = null,

    @SerialName("next")
    val next: String? = null
)

@Serializable
data class OAuthTokenResponse(
    @SerialName("access_token")
    val accessToken: String? = null,

    @SerialName("token_type")
    val tokenType: String? = null,

    @SerialName("expires_in")
    val expiresIn: Long? = null,

    @SerialName("refresh_token")
    val refreshToken: String? = null,

    @SerialName("scope")
    val scope: String? = null
)

@Serializable
data class PagesGetResponse(
    @SerialName("page")
    val page: PagesGetResponsePage? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class PagesGetResponsePage(
    @SerialName("page_id")
    val pageId: Long? = null,

    @SerialName("page_title")
    val pageTitle: String? = null,

    @SerialName("page_description")
    val pageDescription: String? = null,

    @SerialName("page_view_count")
    val pageViewCount: Long? = null,

    @SerialName("links")
    val links: PagesListResponsePagesItemLinks? = null,

    @SerialName("permissions")
    val permissions: CategoriesListResponseCategoriesItemPermissions? = null,

    @SerialName("page_html")
    val pageHtml: String? = null
)

@Serializable
data class PagesListResponse(
    @SerialName("pages")
    val pages: List<PagesListResponsePagesItem>? = null,

    @SerialName("pages_total")
    val pagesTotal: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class PagesListResponsePagesItem(
    @SerialName("page_id")
    val pageId: Long? = null,

    @SerialName("page_title")
    val pageTitle: String? = null,

    @SerialName("page_description")
    val pageDescription: String? = null,

    @SerialName("links")
    val links: PagesListResponsePagesItemLinks? = null,

    @SerialName("permissions")
    val permissions: CategoriesListResponseCategoriesItemPermissions? = null
)

@Serializable
data class PagesListResponsePagesItemLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("sub-pages")
    val subPages: String? = null
)

@Serializable
data class PostsCommentsCreateResponse(
    @SerialName("comment")
    val comment: PostsCommentsCreateResponseComment? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class PostsCommentsCreateResponseComment(
    @SerialName("post_comment_id")
    val postCommentId: Long? = null,

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

    @SerialName("post_comment_body")
    val postCommentBody: String? = null,

    @SerialName("post_comment_body_html")
    val postCommentBodyHtml: String? = null,

    @SerialName("post_comment_body_plain_text")
    val postCommentBodyPlainText: String? = null,

    @SerialName("post_comment_like_count")
    val postCommentLikeCount: Long? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("post_comment_is_published")
    val postCommentIsPublished: Boolean? = null,

    @SerialName("post_comment_is_deleted")
    val postCommentIsDeleted: Boolean? = null,

    @SerialName("post_comment_update_date")
    val postCommentUpdateDate: Long? = null,

    @SerialName("links")
    val links: RespPostCommentModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespThreadModelFirstPostPermissions? = null
)

@Serializable
data class PostsCommentsGetResponse(
    @SerialName("comments")
    val comments: List<RespPostCommentModel>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class PostsCreateResponse(
    @SerialName("post")
    val post: PostsCreateResponsePost? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class PostsCreateResponsePost(
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
    val links: RespThreadModelFirstPostLinks? = null,

    @SerialName("permissions")
    val permissions: RespThreadModelFirstPostPermissions? = null,

    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean? = null
)

@Serializable
data class PostsLikesResponse(
    @SerialName("users")
    val users: List<PostsLikesResponseUsersItem>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class PostsLikesResponseUsersItem(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null
)

@Serializable
data class PostsListResponse(
    @SerialName("posts")
    val posts: List<RespThreadModel>? = null,

    @SerialName("thread")
    val thread: ThreadsCreateResponseThread? = null,

    @SerialName("posts_total")
    val postsTotal: Long? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)
