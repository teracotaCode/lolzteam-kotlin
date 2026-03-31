package com.lolzteam.generated.forum.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.json.JsonElement

@Serializable
data class PostsReportReasonsResponse(
    @SerialName("reasons")
    val reasons: List<String>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ProfilePostsCommentsCreateResponse(
    @SerialName("comment")
    val comment: ProfilePostsCommentsCreateResponseComment? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ProfilePostsCommentsCreateResponseComment(
    @SerialName("comment_id")
    val commentId: Long? = null,

    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("comment_user_id")
    val commentUserId: Long? = null,

    @SerialName("comment_username")
    val commentUsername: String? = null,

    @SerialName("comment_username_html")
    val commentUsernameHtml: String? = null,

    @SerialName("comment_create_date")
    val commentCreateDate: Long? = null,

    @SerialName("comment_body")
    val commentBody: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

    @SerialName("links")
    val links: RespProfilePostCommentModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespProfilePostCommentModelPermissions? = null
)

@Serializable
data class ProfilePostsCommentsGetResponse(
    @SerialName("comment")
    val comment: ProfilePostsCommentsGetResponseComment? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ProfilePostsCommentsGetResponseComment(
    @SerialName("comment_id")
    val commentId: Long? = null,

    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("comment_user_id")
    val commentUserId: Long? = null,

    @SerialName("comment_username")
    val commentUsername: String? = null,

    @SerialName("comment_username_html")
    val commentUsernameHtml: String? = null,

    @SerialName("comment_create_date")
    val commentCreateDate: Long? = null,

    @SerialName("comment_body")
    val commentBody: String? = null,

    @SerialName("comment_body_html")
    val commentBodyHtml: String? = null,

    @SerialName("comment_body_plain_text")
    val commentBodyPlainText: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

    @SerialName("links")
    val links: RespProfilePostCommentModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespProfilePostCommentModelPermissions? = null
)

@Serializable
data class ProfilePostsCommentsListResponse(
    @SerialName("comments")
    val comments: List<RespProfilePostCommentModel>? = null,

    @SerialName("comments_total")
    val commentsTotal: Long? = null,

    @SerialName("profile_post")
    val profilePost: ProfilePostsEditResponseProfilePost? = null,

    @SerialName("timeline_user")
    val timelineUser: RespProfilePostModelTimelineUser? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ProfilePostsEditResponse(
    @SerialName("profile_post")
    val profilePost: ProfilePostsEditResponseProfilePost? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ProfilePostsEditResponseProfilePost(
    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

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

    @SerialName("post_like_count")
    val postLikeCount: Long? = null,

    @SerialName("post_comment_count")
    val postCommentCount: Long? = null,

    @SerialName("timeline_username")
    val timelineUsername: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("post_is_published")
    val postIsPublished: Boolean? = null,

    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean? = null,

    @SerialName("links")
    val links: RespProfilePostModelLinks? = null,

    @SerialName("permissions")
    val permissions: ProfilePostsEditResponseProfilePostPermissions? = null
)

@Serializable
data class ProfilePostsEditResponseProfilePostPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("like")
    val like: Boolean? = null,

    @SerialName("comment")
    val comment: Boolean? = null,

    @SerialName("report")
    val report: Boolean? = null
)

@Serializable
data class ProfilePostsGetResponse(
    @SerialName("profile_post")
    val profilePost: ProfilePostsGetResponseProfilePost? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class ProfilePostsGetResponseProfilePost(
    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

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

    @SerialName("post_like_count")
    val postLikeCount: Long? = null,

    @SerialName("post_comment_count")
    val postCommentCount: Long? = null,

    @SerialName("post_comments_is_disabled")
    val postCommentsIsDisabled: Long? = null,

    @SerialName("timeline_username")
    val timelineUsername: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("post_is_published")
    val postIsPublished: Boolean? = null,

    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean? = null,

    @SerialName("post_is_liked")
    val postIsLiked: Boolean? = null,

    @SerialName("post_is_sticked")
    val postIsSticked: Boolean? = null,

    @SerialName("links")
    val links: RespProfilePostModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespProfilePostModelPermissions? = null,

    @SerialName("timeline_user")
    val timelineUser: RespProfilePostModelTimelineUser? = null
)

@Serializable
data class ProfilePostsListResponse(
    @SerialName("profile_posts")
    val profilePosts: List<RespProfilePostModel>? = null,

    @SerialName("totalProfilePosts")
    val totalProfilePosts: Long? = null,

    @SerialName("canPostOnProfile")
    val canPostOnProfile: Boolean? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class RespChatboxMessageModel(
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
data class RespChatboxMessageModelRoom(
    @SerialName("can_report")
    val canReport: Boolean? = null,

    @SerialName("eng")
    val eng: Boolean? = null,

    @SerialName("market")
    val market: Boolean? = null,

    @SerialName("room_id")
    val roomId: Long? = null,

    @SerialName("title")
    val title: String? = null
)

@Serializable
data class RespChatboxMessageModelUser(
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
    val shortLink: String? = null,

    @SerialName("trophy_points")
    val trophyPoints: Long? = null,

    @SerialName("uniq_banner")
    val uniqBanner: RespChatboxMessageModelUserUniqBanner? = null,

    @SerialName("uniq_username_css")
    val uniqUsernameCss: String? = null,

    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null
)

@Serializable
data class RespChatboxMessageModelUserRendered(
    @SerialName("username")
    val username: String? = null,

    @SerialName("avatars")
    val avatars: RespChatboxMessageModelUserRenderedAvatars? = null,

    @SerialName("link")
    val link: String? = null
)

@Serializable
data class RespChatboxMessageModelUserRenderedAvatars(
    @SerialName("l")
    val l: String? = null,

    @SerialName("m")
    val m: String? = null,

    @SerialName("s")
    val s: String? = null
)

@Serializable
data class RespChatboxMessageModelUserUniqBanner(
    @SerialName("banner_css")
    val bannerCss: String? = null,

    @SerialName("banner_text")
    val bannerText: String? = null,

    @SerialName("banner_icon")
    val bannerIcon: String? = null,

    @SerialName("username_icon")
    val usernameIcon: String? = null
)

@Serializable
data class RespConversationMessageModel(
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
data class RespConversationMessageModelLinks(
    @SerialName("detail")
    val detail: String? = null,

    @SerialName("conversation")
    val conversation: String? = null,

    @SerialName("creator")
    val creator: String? = null,

    @SerialName("creator_avatar")
    val creatorAvatar: String? = null
)

@Serializable
data class RespConversationMessageModelPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("stick-unstick")
    val stickUnstick: Boolean? = null
)

@Serializable
data class RespConversationModel(
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
data class RespConversationModelLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("messages")
    val messages: String? = null,

    @SerialName("avatar")
    val avatar: String? = null
)

@Serializable
data class RespConversationModelPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("reply")
    val reply: Boolean? = null,

    @SerialName("invite")
    val invite: Boolean? = null,

    @SerialName("manage_invite_links")
    val manageInviteLinks: Boolean? = null,

    @SerialName("kick")
    val kick: Boolean? = null,

    @SerialName("upload_avatar")
    val uploadAvatar: Boolean? = null,

    @SerialName("editOwnPost")
    val editOwnPost: Boolean? = null,

    @SerialName("stickyMessages")
    val stickyMessages: Boolean? = null
)

@Serializable
data class RespConversationModelRecipient(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("username_html")
    val usernameHtml: String? = null,

    @SerialName("last_activity")
    val lastActivity: Long? = null,

    @SerialName("is_online")
    val isOnline: Boolean? = null,

    @SerialName("contacts_changed")
    val contactsChanged: Boolean? = null,

    @SerialName("avatar")
    val avatar: String? = null
)

@Serializable
data class RespLinkModel(
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
data class RespLinkModelLinks(
    @SerialName("target")
    val target: String? = null,

    @SerialName("detail")
    val detail: String? = null
)

@Serializable
data class RespLinkModelPermissions(
    @SerialName("view")
    val view: Boolean? = null
)

@Serializable
data class RespNotificationModel(
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
data class RespNotificationModelLinks(
    @SerialName("content")
    val content: String? = null,

    @SerialName("creator_avatar")
    val creatorAvatar: String? = null
)

@Serializable
data class RespPostCommentModel(
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

    @SerialName("post_comment_create_date")
    val postCommentCreateDate: Long? = null,

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
data class RespPostCommentModelLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("post")
    val post: String? = null,

    @SerialName("thread")
    val thread: String? = null,

    @SerialName("poster")
    val poster: String? = null,

    @SerialName("likes")
    val likes: String? = null,

    @SerialName("report")
    val report: String? = null,

    @SerialName("poster_avatar")
    val posterAvatar: String? = null
)

@Serializable
data class RespPostModel(
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
data class RespProfilePostCommentModel(
    @SerialName("comment_id")
    val commentId: Long? = null,

    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("comment_user_id")
    val commentUserId: Long? = null,

    @SerialName("comment_username")
    val commentUsername: String? = null,

    @SerialName("comment_username_html")
    val commentUsernameHtml: String? = null,

    @SerialName("comment_create_date")
    val commentCreateDate: Long? = null,

    @SerialName("comment_body")
    val commentBody: String? = null,

    @SerialName("comment_body_html")
    val commentBodyHtml: String? = null,

    @SerialName("comment_body_plain_text")
    val commentBodyPlainText: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

    @SerialName("links")
    val links: RespProfilePostCommentModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespProfilePostCommentModelPermissions? = null
)

@Serializable
data class RespProfilePostCommentModelLinks(
    @SerialName("detail")
    val detail: String? = null,

    @SerialName("profile_post")
    val profilePost: String? = null,

    @SerialName("timeline")
    val timeline: String? = null,

    @SerialName("timeline_user")
    val timelineUser: String? = null,

    @SerialName("poster")
    val poster: String? = null,

    @SerialName("poster_avatar")
    val posterAvatar: String? = null
)

@Serializable
data class RespProfilePostCommentModelPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null
)

@Serializable
data class RespProfilePostModel(
    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

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

    @SerialName("post_like_count")
    val postLikeCount: Long? = null,

    @SerialName("post_comment_count")
    val postCommentCount: Long? = null,

    @SerialName("post_comments_is_disabled")
    val postCommentsIsDisabled: Long? = null,

    @SerialName("timeline_username")
    val timelineUsername: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("post_is_published")
    val postIsPublished: Boolean? = null,

    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean? = null,

    @SerialName("post_is_liked")
    val postIsLiked: Boolean? = null,

    @SerialName("post_is_sticked")
    val postIsSticked: Boolean? = null,

    @SerialName("links")
    val links: RespProfilePostModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespProfilePostModelPermissions? = null,

    @SerialName("timeline_user")
    val timelineUser: RespProfilePostModelTimelineUser? = null
)

@Serializable
data class RespProfilePostModelLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null,

    @SerialName("timeline")
    val timeline: String? = null,

    @SerialName("timeline_user")
    val timelineUser: String? = null,

    @SerialName("poster")
    val poster: String? = null,

    @SerialName("likes")
    val likes: String? = null,

    @SerialName("comments")
    val comments: String? = null,

    @SerialName("report")
    val report: String? = null,

    @SerialName("poster_avatar")
    val posterAvatar: String? = null
)

@Serializable
data class RespProfilePostModelPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("like")
    val like: Boolean? = null,

    @SerialName("comment")
    val comment: Boolean? = null,

    @SerialName("report")
    val report: Boolean? = null,

    @SerialName("stick")
    val stick: Boolean? = null
)

@Serializable
data class RespProfilePostModelTimelineUser(
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

    @SerialName("display_banner_id")
    val displayBannerId: Long? = null,

    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,

    @SerialName("balance")
    val balance: String? = null,

    @SerialName("hold")
    val hold: String? = null,

    @SerialName("currency")
    val currency: String? = null,

    @SerialName("user_email")
    val userEmail: String? = null,

    @SerialName("user_unread_notification_count")
    val userUnreadNotificationCount: Long? = null,

    @SerialName("user_unread_conversation_count")
    val userUnreadConversationCount: Long? = null,

    @SerialName("conv_welcome_message")
    val convWelcomeMessage: String? = null,

    @SerialName("user_title")
    val userTitle: String? = null,

    @SerialName("user_deposit")
    val userDeposit: Long? = null,

    @SerialName("user_is_valid")
    val userIsValid: Boolean? = null,

    @SerialName("user_is_verified")
    val userIsVerified: Boolean? = null,

    @SerialName("user_is_followed")
    val userIsFollowed: Boolean? = null,

    @SerialName("user_last_seen_date")
    val userLastSeenDate: Long? = null,

    @SerialName("links")
    val links: RespUserModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespUserModelPermissions? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean? = null,

    @SerialName("user_group_id")
    val userGroupId: Long? = null,

    @SerialName("curator_titles")
    val curatorTitles: List<String>? = null,

    @SerialName("user_groups")
    val userGroups: List<RespUserModelUserGroupsItem>? = null,

    @SerialName("fields")
    val fields: List<RespUserModelFieldsItem>? = null,

    @SerialName("user_timezone_offset")
    val userTimezoneOffset: Long? = null,

    @SerialName("user_external_authentications")
    val userExternalAuthentications: List<RespUserModelUserExternalAuthenticationsItem>? = null,

    @SerialName("self_permissions")
    val selfPermissions: RespUserModelSelfPermissions? = null,

    @SerialName("edit_permissions")
    val editPermissions: RespUserModelEditPermissions? = null,

    @SerialName("birthday")
    val birthday: RespUserModelBirthday? = null,

    @SerialName("secret_answer_rendered")
    val secretAnswerRendered: String? = null,

    @SerialName("secret_answer_first_letter")
    val secretAnswerFirstLetter: String? = null,

    @SerialName("user_following")
    val userFollowing: RespUserModelUserFollowing? = null,

    @SerialName("user_followers")
    val userFollowers: RespUserModelUserFollowing? = null,

    @SerialName("banner")
    val banner: String? = null
)

@Serializable
data class RespSystemInfo(
    @SerialName("visitor_id")
    val visitorId: Long? = null,

    @SerialName("time")
    val time: Long? = null
)

@Serializable
data class RespThreadModel(
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
data class RespThreadModelContest(
    @SerialName("type")
    val `type`: String? = null,

    @SerialName("finish_date")
    val finishDate: Long? = null,

    @SerialName("now_count_members")
    val nowCountMembers: Long? = null,

    @SerialName("needed_members")
    val neededMembers: Long? = null,

    @SerialName("is_finished")
    val isFinished: Long? = null,

    @SerialName("count_winners")
    val countWinners: Long? = null,

    @SerialName("require_like_count")
    val requireLikeCount: Long? = null,

    @SerialName("require_total_like_count")
    val requireTotalLikeCount: Long? = null,

    @SerialName("prize_type")
    val prizeType: String? = null,

    @SerialName("prize_type_phrase")
    val prizeTypePhrase: String? = null,

    @SerialName("prize_data")
    val prizeData: Long? = null,

    @SerialName("is_money_places")
    val isMoneyPlaces: Long? = null,

    @SerialName("chance_to_win")
    val chanceToWin: Double? = null,

    @SerialName("winners")
    val winners: List<Long>? = null,

    @SerialName("already_participate")
    val alreadyParticipate: Boolean? = null,

    @SerialName("permissions")
    val permissions: RespThreadModelContestPermissions? = null
)

@Serializable
data class RespThreadModelContestPermissions(
    @SerialName("can_finish")
    val canFinish: Boolean? = null,

    @SerialName("can_participate")
    val canParticipate: Boolean? = null,

    @SerialName("can_participate_error")
    val canParticipateError: String? = null,

    @SerialName("can_view_user_list")
    val canViewUserList: Boolean? = null
)

@Serializable
data class RespThreadModelFirstPost(
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

    @SerialName("post_is_liked")
    val postIsLiked: Boolean? = null,

    @SerialName("links")
    val links: RespThreadModelFirstPostLinks? = null,

    @SerialName("permissions")
    val permissions: RespThreadModelFirstPostPermissions? = null,

    @SerialName("thread_is_deleted")
    val threadIsDeleted: Boolean? = null
)

@Serializable
data class RespThreadModelFirstPostLinks(
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

    @SerialName("poster_avatar")
    val posterAvatar: String? = null
)

@Serializable
data class RespThreadModelFirstPostPermissions(
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
    val report: Boolean? = null
)

@Serializable
data class RespThreadModelLinks(
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

    @SerialName("last_post")
    val lastPost: String? = null
)

@Serializable
data class RespThreadModelPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("post")
    val post: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("edit_title")
    val editTitle: Boolean? = null,

    @SerialName("edit_tags")
    val editTags: Boolean? = null,

    @SerialName("bump")
    val bump: RespThreadModelPermissionsBump? = null
)

@Serializable
data class RespThreadModelPermissionsBump(
    @SerialName("can")
    val can: Boolean? = null,

    @SerialName("available_count")
    val availableCount: Long? = null,

    @SerialName("error")
    val error: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("next_available_time")
    val nextAvailableTime: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class RespThreadModelRestrictions(
    @SerialName("reply_delay")
    val replyDelay: Long? = null,

    @SerialName("max_reply_count")
    val maxReplyCount: Long? = null
)

@Serializable
data class RespUserModel(
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

    @SerialName("display_banner_id")
    val displayBannerId: Long? = null,

    @SerialName("display_icon_group_id")
    val displayIconGroupId: Long? = null,

    @SerialName("balance")
    val balance: String? = null,

    @SerialName("hold")
    val hold: String? = null,

    @SerialName("currency")
    val currency: String? = null,

    @SerialName("user_email")
    val userEmail: String? = null,

    @SerialName("user_unread_notification_count")
    val userUnreadNotificationCount: Long? = null,

    @SerialName("user_unread_conversation_count")
    val userUnreadConversationCount: Long? = null,

    @SerialName("conv_welcome_message")
    val convWelcomeMessage: String? = null,

    @SerialName("user_title")
    val userTitle: String? = null,

    @SerialName("user_deposit")
    val userDeposit: Long? = null,

    @SerialName("user_is_valid")
    val userIsValid: Boolean? = null,

    @SerialName("user_is_verified")
    val userIsVerified: Boolean? = null,

    @SerialName("user_is_followed")
    val userIsFollowed: Boolean? = null,

    @SerialName("user_last_seen_date")
    val userLastSeenDate: Long? = null,

    @SerialName("links")
    val links: RespUserModelLinks? = null,

    @SerialName("permissions")
    val permissions: RespUserModelPermissions? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("user_is_visitor")
    val userIsVisitor: Boolean? = null,

    @SerialName("user_group_id")
    val userGroupId: Long? = null,

    @SerialName("curator_titles")
    val curatorTitles: List<String>? = null,

    @SerialName("user_groups")
    val userGroups: List<RespUserModelUserGroupsItem>? = null,

    @SerialName("fields")
    val fields: List<RespUserModelFieldsItem>? = null,

    @SerialName("user_timezone_offset")
    val userTimezoneOffset: Long? = null,

    @SerialName("user_external_authentications")
    val userExternalAuthentications: List<RespUserModelUserExternalAuthenticationsItem>? = null,

    @SerialName("self_permissions")
    val selfPermissions: RespUserModelSelfPermissions? = null,

    @SerialName("edit_permissions")
    val editPermissions: RespUserModelEditPermissions? = null,

    @SerialName("birthday")
    val birthday: RespUserModelBirthday? = null,

    @SerialName("secret_answer_rendered")
    val secretAnswerRendered: String? = null,

    @SerialName("secret_answer_first_letter")
    val secretAnswerFirstLetter: String? = null,

    @SerialName("user_following")
    val userFollowing: RespUserModelUserFollowing? = null,

    @SerialName("user_followers")
    val userFollowers: RespUserModelUserFollowing? = null,

    @SerialName("banner")
    val banner: String? = null
)

@Serializable
data class RespUserModelBirthday(
    @SerialName("age")
    val age: Long? = null,

    @SerialName("timeStamp")
    val timeStamp: RespUserModelBirthdayTimeStamp? = null,

    @SerialName("format")
    val format: String? = null
)

@Serializable
data class RespUserModelBirthdayTimeStamp(
    @SerialName("date")
    val date: String? = null,

    @SerialName("timezone_type")
    val timezoneType: Long? = null,

    @SerialName("timezone")
    val timezone: String? = null
)

@Serializable
data class RespUserModelEditPermissions(
    @SerialName("password")
    val password: Boolean? = null,

    @SerialName("user_email")
    val userEmail: Boolean? = null,

    @SerialName("username")
    val username: Boolean? = null,

    @SerialName("user_title")
    val userTitle: Boolean? = null,

    @SerialName("short_link")
    val shortLink: Boolean? = null,

    @SerialName("hide_username_logs")
    val hideUsernameLogs: Boolean? = null,

    @SerialName("primary_group_id")
    val primaryGroupId: Boolean? = null,

    @SerialName("secondary_group_ids")
    val secondaryGroupIds: Boolean? = null,

    @SerialName("user_dob_day")
    val userDobDay: Boolean? = null,

    @SerialName("user_dob_month")
    val userDobMonth: Boolean? = null,

    @SerialName("user_dob_year")
    val userDobYear: Boolean? = null,

    @SerialName("fields")
    val fields: Boolean? = null
)

@Serializable
data class RespUserModelFieldsItem(
    @SerialName("id")
    val id: String? = null,

    @SerialName("title")
    val title: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("position")
    val position: String? = null,

    @SerialName("is_required")
    val isRequired: Boolean? = null,

    @SerialName("value")
    val value: String? = null,

    @SerialName("is_multi_choice")
    val isMultiChoice: Boolean? = null,

    @SerialName("choices")
    val choices: List<RespUserModelFieldsItemChoicesItem>? = null,

    @SerialName("values")
    val values: kotlinx.serialization.json.JsonElement? = null
)

@Serializable
data class RespUserModelFieldsItemChoicesItem(
    @SerialName("key")
    val key: String? = null,

    @SerialName("value")
    val value: String? = null
)

@Serializable
data class RespUserModelLinks(
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

    @SerialName("background_l")
    val backgroundL: String? = null,

    @SerialName("background_m")
    val backgroundM: String? = null,

    @SerialName("status")
    val status: String? = null,

    @SerialName("timeline")
    val timeline: String? = null
)

@Serializable
data class RespUserModelPermissions(
    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("ignore")
    val ignore: Boolean? = null,

    @SerialName("profile_post")
    val profilePost: Boolean? = null
)

@Serializable
data class RespUserModelSelfPermissions(
    @SerialName("create_conversation")
    val createConversation: Boolean? = null
)

@Serializable
data class RespUserModelUserExternalAuthenticationsItem(
    @SerialName("provider")
    val provider: String? = null,

    @SerialName("provider_key")
    val providerKey: String? = null
)

@Serializable
data class RespUserModelUserFollowing(
    @SerialName("users")
    val users: List<RespUserModelUserFollowingUsersItem>? = null,

    @SerialName("count")
    val count: Long? = null
)

@Serializable
data class RespUserModelUserFollowingUsersItem(
    @SerialName("user_id")
    val userId: Long? = null,

    @SerialName("username")
    val username: String? = null,

    @SerialName("username_html")
    val usernameHtml: String? = null,

    @SerialName("avatar")
    val avatar: String? = null
)

@Serializable
data class RespUserModelUserGroupsItem(
    @SerialName("user_group_id")
    val userGroupId: Long? = null,

    @SerialName("user_group_title")
    val userGroupTitle: String? = null,

    @SerialName("user_group_title_en")
    val userGroupTitleEn: String? = null,

    @SerialName("user_group_banner_css_class")
    val userGroupBannerCssClass: String? = null,

    @SerialName("user_group_banner_text")
    val userGroupBannerText: String? = null,

    @SerialName("user_group_banner_text_en")
    val userGroupBannerTextEn: String? = null,

    @SerialName("display_group_selectable")
    val displayGroupSelectable: Boolean? = null,

    @SerialName("display_banner_selectable")
    val displayBannerSelectable: Boolean? = null,

    @SerialName("display_icon_selectable")
    val displayIconSelectable: Boolean? = null,

    @SerialName("is_primary_group")
    val isPrimaryGroup: Boolean? = null,

    @SerialName("user_group_icon_class")
    val userGroupIconClass: String? = null
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
data class SearchAllResponse(
    @SerialName("data")
    val data: List<SearchAllResponseDataItem>? = null,

    @SerialName("data_total")
    val dataTotal: Long? = null,

    @SerialName("users")
    val users: List<RespUserModel>? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class SearchAllResponseDataItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: String? = null,

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
    val links: ThreadsUnreadResponseDataItemLinks? = null,

    @SerialName("permissions")
    val permissions: SearchAllResponseDataItemPermissions? = null,

    @SerialName("node_title")
    val nodeTitle: String? = null,

    @SerialName("forum")
    val forum: SearchAllResponseDataItemForum? = null,

    @SerialName("last_post")
    val lastPost: RespThreadModelFirstPost? = null
)

@Serializable
data class SearchAllResponseDataItemForum(
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

    @SerialName("parent_node_id")
    val parentNodeId: Long? = null,

    @SerialName("forum_prefixes")
    val forumPrefixes: List<kotlinx.serialization.json.JsonElement>? = null,

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
data class SearchAllResponseDataItemPermissions(
    @SerialName("view")
    val view: Boolean? = null,

    @SerialName("delete")
    val delete: Boolean? = null,

    @SerialName("follow")
    val follow: Boolean? = null,

    @SerialName("post")
    val post: Boolean? = null,

    @SerialName("edit")
    val edit: Boolean? = null,

    @SerialName("bump")
    val bump: RespThreadModelPermissionsBump? = null
)

@Serializable
data class SearchProfilePostsResponse(
    @SerialName("data")
    val data: List<SearchProfilePostsResponseDataItem>? = null,

    @SerialName("data_total")
    val dataTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class SearchProfilePostsResponseDataItem(
    @SerialName("content_type")
    val contentType: String? = null,

    @SerialName("content_id")
    val contentId: Long? = null,

    @SerialName("profile_post_id")
    val profilePostId: Long? = null,

    @SerialName("timeline_user_id")
    val timelineUserId: Long? = null,

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

    @SerialName("post_like_count")
    val postLikeCount: Long? = null,

    @SerialName("post_comment_count")
    val postCommentCount: Long? = null,

    @SerialName("timeline_username")
    val timelineUsername: String? = null,

    @SerialName("user_is_ignored")
    val userIsIgnored: Boolean? = null,

    @SerialName("post_is_published")
    val postIsPublished: Boolean? = null,

    @SerialName("post_is_deleted")
    val postIsDeleted: Boolean? = null,

    @SerialName("links")
    val links: RespProfilePostModelLinks? = null,

    @SerialName("permissions")
    val permissions: ProfilePostsEditResponseProfilePostPermissions? = null,

    @SerialName("timeline_user")
    val timelineUser: RespProfilePostModelTimelineUser? = null
)

@Serializable
data class SearchTaggedResponse(
    @SerialName("data")
    val data: List<SearchTaggedResponseDataItem>? = null,

    @SerialName("data_total")
    val dataTotal: Long? = null,

    @SerialName("search_tags")
    val searchTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class SearchTaggedResponseDataItem(
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
    val links: RespThreadModelLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsFollowedResponseThreadsItemPermissions? = null,

    @SerialName("forum")
    val forum: ForumsGetResponseForum? = null
)

@Serializable
data class SearchThreadsResponse(
    @SerialName("data")
    val data: List<SearchThreadsResponseDataItem>? = null,

    @SerialName("data_total")
    val dataTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class SearchThreadsResponseDataItem(
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
    val links: RespThreadModelLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsUnreadResponseDataItemPermissions? = null,

    @SerialName("forum")
    val forum: ThreadsListResponseForum? = null
)

@Serializable
data class TagsFindResponse(
    @SerialName("tags")
    val tags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("ids")
    val ids: List<Long>? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class TagsGetResponse(
    @SerialName("tag")
    val tag: TagsGetResponseTag? = null,

    @SerialName("tagged")
    val tagged: List<TagsGetResponseTaggedItem>? = null,

    @SerialName("tagged_total")
    val taggedTotal: Long? = null,

    @SerialName("links")
    val links: ThreadsListResponseLinks? = null,

    @SerialName("system_info")
    val systemInfo: AssetsCssResponseSystemInfo? = null
)

@Serializable
data class TagsGetResponseTag(
    @SerialName("tag_id")
    val tagId: Long? = null,

    @SerialName("tag_text")
    val tagText: String? = null,

    @SerialName("tag_use_count")
    val tagUseCount: Long? = null,

    @SerialName("links")
    val links: TagsGetResponseTagLinks? = null
)

@Serializable
data class TagsGetResponseTagLinks(
    @SerialName("permalink")
    val permalink: String? = null,

    @SerialName("detail")
    val detail: String? = null
)

@Serializable
data class TagsGetResponseTaggedItem(
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
    val threadPrefixes: List<ForumsListResponseForumsItemForumPrefixesItemGroupPrefixesItem>? = null,

    @SerialName("thread_tags")
    val threadTags: kotlinx.serialization.json.JsonElement? = null,

    @SerialName("links")
    val links: ThreadsUnreadResponseDataItemLinks? = null,

    @SerialName("permissions")
    val permissions: ThreadsUnreadResponseDataItemPermissions? = null,

    @SerialName("forum")
    val forum: ForumsGetResponseForum? = null
)
