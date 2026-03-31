package com.lolzteam.generated.forum

import com.lolzteam.runtime.*
import com.lolzteam.generated.forum.models.*
import kotlinx.serialization.json.JsonElement
import java.io.Closeable

/**
 * Forum API client for Lolzteam.
 *
 * Base URL: https://prod-api.lolz.live
 */
class ForumClient(
    private val token: String,
    private val baseUrl: String = "https://prod-api.lolz.live",
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

    /** Assets API endpoints. */
    val assets = AssetsService(client)

    /** Authentication API endpoints. */
    val authentication = AuthenticationService(client)

    /** Batch requests API endpoints. */
    val batchRequests = BatchRequestsService(client)

    /** Categories API endpoints. */
    val categories = CategoriesService(client)

    /** Chatbox API endpoints. */
    val chatbox = ChatboxService(client)

    /** Content Tagging API endpoints. */
    val contentTagging = ContentTaggingService(client)

    /** Conversations API endpoints. */
    val conversations = ConversationsService(client)

    /** Forms API endpoints. */
    val forms = FormsService(client)

    /** Forums API endpoints. */
    val forums = ForumsService(client)

    /** Link Forums API endpoints. */
    val linkForums = LinkForumsService(client)

    /** Navigation API endpoints. */
    val navigation = NavigationService(client)

    /** Notifications API endpoints. */
    val notifications = NotificationsService(client)

    /** Pages API endpoints. */
    val pages = PagesService(client)

    /** Post comments API endpoints. */
    val postComments = PostCommentsService(client)

    /** Posts API endpoints. */
    val posts = PostsService(client)

    /** Profile Post Comments API endpoints. */
    val profilePostComments = ProfilePostCommentsService(client)

    /** Profile Posts API endpoints. */
    val profilePosts = ProfilePostsService(client)

    /** Searching API endpoints. */
    val searching = SearchingService(client)

    /** Threads API endpoints. */
    val threads = ThreadsService(client)

    /** Users API endpoints. */
    val users = UsersService(client)

    override fun close() {
        client.close()
    }
}

/**
 * Assets API service.
 */
class AssetsService(private val client: LolzteamHttpClient) {

    /**
     * Get CSS
     *
     * `GET /css`
     */
    suspend fun css(
        css: List<String>? = null
    ): AssetsCssResponse {
        return client.get(
            path = "/css",
            params = mapOf(
            "css" to css
            )
        )
    }

}

/**
 * Authentication API service.
 */
class AuthenticationService(private val client: LolzteamHttpClient) {

    /**
     * Get Access Token
     *
     * `POST /oauth/token`
     */
    suspend fun token(
        grantType: GrantType? = null,
        clientId: String? = null,
        clientSecret: String? = null,
        scope: List<ScopeItem>? = null,
        code: String? = null,
        redirectUri: String? = null,
        refreshToken: String? = null,
        username: String? = null,
        password: String? = null
    ): OAuthTokenResponse {
        return client.postMultipart(
            path = "/oauth/token",
            textParts = mapOf(
            "grant_type" to grantType,
            "client_id" to clientId,
            "client_secret" to clientSecret,
            "scope" to scope,
            "code" to code,
            "redirect_uri" to redirectUri,
            "refresh_token" to refreshToken,
            "username" to username,
            "password" to password
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
    suspend fun execute(
        jobs: List<Map<String, Any?>>
    ): BatchExecuteResponse {
        return client.postJsonRaw(
            path = "/batch",
            jsonBody = jobs
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
     * `GET /categories`
     */
    suspend fun list(
        parentCategoryId: Long? = null,
        parentForumId: Long? = null,
        order: Order? = null
    ): CategoriesListResponse {
        return client.get(
            path = "/categories",
            params = mapOf(
            "parent_category_id" to parentCategoryId,
            "parent_forum_id" to parentForumId,
            "order" to order
            )
        )
    }

    /**
     * Get Category
     *
     * `GET /categories/{category_id}`
     */
    suspend fun get(
        categoryId: Long
    ): CategoriesGetResponse {
        return client.get(path = "/categories/${categoryId}")
    }

}

/**
 * Chatbox API service.
 */
class ChatboxService(private val client: LolzteamHttpClient) {

    /**
     * Get Chats
     *
     * `GET /chatbox`
     */
    suspend fun index(
        roomId: RoomId? = null
    ): ChatboxIndexResponse {
        return client.get(
            path = "/chatbox",
            params = mapOf(
            "room_id" to roomId
            )
        )
    }

    /**
     * Get Chat Messages
     *
     * `GET /chatbox/messages`
     */
    suspend fun getMessages(
        roomId: RoomId? = null,
        beforeMessageId: Long? = null
    ): ChatboxGetMessagesResponse {
        return client.get(
            path = "/chatbox/messages",
            params = mapOf(
            "room_id" to roomId,
            "before_message_id" to beforeMessageId
            )
        )
    }

    /**
     * Create Chat Message
     *
     * `POST /chatbox/messages`
     */
    suspend fun postMessage(
        roomId: RoomId,
        message: String,
        replyMessageId: Long? = null
    ): ChatboxPostMessageResponse {
        return client.post(
            path = "/chatbox/messages",
            body = mapOf(
            "room_id" to roomId,
            "reply_message_id" to replyMessageId,
            "message" to message
            )
        )
    }

    /**
     * Edit Chat Message
     *
     * `PUT /chatbox/messages`
     */
    suspend fun editMessage(
        messageId: Long,
        message: String
    ): ChatboxPostMessageResponse {
        return client.put(
            path = "/chatbox/messages",
            body = mapOf(
            "message_id" to messageId,
            "message" to message
            )
        )
    }

    /**
     * Delete Chat Message
     *
     * `DELETE /chatbox/messages`
     */
    suspend fun deleteMessage(
        messageId: Long
    ): SaveChangesResponse {
        return client.delete(
            path = "/chatbox/messages",
            body = mapOf(
            "message_id" to messageId
            )
        )
    }

    /**
     * Get Chat Online
     *
     * `GET /chatbox/messages/online`
     */
    suspend fun online(
        roomId: RoomId? = null
    ): ChatboxOnlineResponse {
        return client.get(
            path = "/chatbox/messages/online",
            params = mapOf(
            "room_id" to roomId
            )
        )
    }

    /**
     * Get Chat Message Report Reasons
     *
     * `GET /chatbox/messages/report`
     */
    suspend fun reportReasons(
        messageId: Long? = null
    ): PostsReportReasonsResponse {
        return client.get(
            path = "/chatbox/messages/report",
            params = mapOf(
            "message_id" to messageId
            )
        )
    }

    /**
     * Report Chat Message
     *
     * `POST /chatbox/messages/report`
     */
    suspend fun report(
        messageId: Long,
        reason: String
    ): SaveChangesResponse {
        return client.post(
            path = "/chatbox/messages/report",
            body = mapOf(
            "message_id" to messageId,
            "reason" to reason
            )
        )
    }

    /**
     * Get Chat Leaderboard
     *
     * `GET /chatbox/messages/leaderboard`
     */
    suspend fun getLeaderboard(
        duration: Duration? = null
    ): ChatboxGetLeaderboardResponse {
        return client.get(
            path = "/chatbox/messages/leaderboard",
            params = mapOf(
            "duration" to duration
            )
        )
    }

    /**
     * Get Ignored Chat Users
     *
     * `GET /chatbox/ignore`
     */
    suspend fun getIgnore(): ChatboxGetIgnoreResponse {
        return client.get(path = "/chatbox/ignore")
    }

    /**
     * Ignore Chat User
     *
     * `POST /chatbox/ignore`
     */
    suspend fun postIgnore(
        userId: kotlinx.serialization.json.JsonElement
    ): SaveChangesResponse {
        return client.post(
            path = "/chatbox/ignore",
            body = mapOf(
            "user_id" to userId
            )
        )
    }

    /**
     * Unignore Chat User
     *
     * `DELETE /chatbox/ignore`
     */
    suspend fun deleteIgnore(
        userId: kotlinx.serialization.json.JsonElement
    ): SaveChangesResponse {
        return client.delete(
            path = "/chatbox/ignore",
            body = mapOf(
            "user_id" to userId
            )
        )
    }

}

/**
 * Content Tagging API service.
 */
class ContentTaggingService(private val client: LolzteamHttpClient) {

    /**
     * Get Popular Tags
     *
     * `GET /tags`
     */
    suspend fun popular(): TagsPopularResponse {
        return client.get(path = "/tags")
    }

    /**
     * Get Tags
     *
     * `GET /tags/list`
     */
    suspend fun list(
        page: Long? = null,
        limit: Long? = null
    ): TagsListResponse {
        return client.get(
            path = "/tags/list",
            params = mapOf(
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Get Tagged Content
     *
     * `GET /tags/{tag_id}`
     */
    suspend fun get(
        tagId: Long,
        page: Long? = null,
        limit: Long? = null
    ): TagsGetResponse {
        return client.get(
            path = "/tags/${tagId}",
            params = mapOf(
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Get Filtered Content
     *
     * `GET /tags/find`
     */
    suspend fun find(
        tag: String? = null
    ): TagsFindResponse {
        return client.get(
            path = "/tags/find",
            params = mapOf(
            "tag" to tag
            )
        )
    }

}

/**
 * Conversations API service.
 */
class ConversationsService(private val client: LolzteamHttpClient) {

    /**
     * Get Conversations
     *
     * `GET /conversations`
     */
    suspend fun list(
        folder: Folder? = null,
        page: Long? = null,
        limit: Long? = null
    ): ConversationsListResponse {
        return client.get(
            path = "/conversations",
            params = mapOf(
            "folder" to folder,
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Create Conversation
     *
     * `POST /conversations`
     */
    suspend fun create(
        recipientId: Long? = null,
        recipients: List<String>? = null,
        isGroup: Boolean? = null,
        title: String? = null,
        openInvite: Boolean? = null,
        allowEditMessages: Boolean? = null,
        allowStickyMessages: Boolean? = null,
        allowDeleteOwnMessages: Boolean? = null,
        messageBody: String? = null
    ): ConversationsCreateResponse {
        return client.post(
            path = "/conversations",
            body = mapOf(
            "recipient_id" to recipientId,
            "recipients" to recipients,
            "is_group" to isGroup,
            "title" to title,
            "open_invite" to openInvite,
            "allow_edit_messages" to allowEditMessages,
            "allow_sticky_messages" to allowStickyMessages,
            "allow_delete_own_messages" to allowDeleteOwnMessages,
            "message_body" to messageBody
            )
        )
    }

    /**
     * Edit Conversation
     *
     * `PUT /conversations`
     */
    suspend fun update(
        conversationId: Long,
        title: String? = null,
        openInvite: Boolean? = null,
        historyOpen: Boolean? = null,
        allowEditMessages: Boolean? = null,
        allowStickyMessages: Boolean? = null,
        allowDeleteOwnMessages: Boolean? = null
    ): ConversationsCreateResponse {
        return client.put(
            path = "/conversations",
            body = mapOf(
            "conversation_id" to conversationId,
            "title" to title,
            "open_invite" to openInvite,
            "history_open" to historyOpen,
            "allow_edit_messages" to allowEditMessages,
            "allow_sticky_messages" to allowStickyMessages,
            "allow_delete_own_messages" to allowDeleteOwnMessages
            )
        )
    }

    /**
     * Leave Conversation
     *
     * `DELETE /conversations`
     */
    suspend fun delete(
        conversationId: Long,
        deleteType: DeleteType
    ): SaveChangesResponse {
        return client.delete(
            path = "/conversations",
            body = mapOf(
            "conversation_id" to conversationId,
            "delete_type" to deleteType
            )
        )
    }

    /**
     * Start Conversation
     *
     * `POST /conversations/start`
     */
    suspend fun start(
        userId: kotlinx.serialization.json.JsonElement
    ): ConversationsCreateResponse {
        return client.post(
            path = "/conversations/start",
            body = mapOf(
            "user_id" to userId
            )
        )
    }

    /**
     * Send Content To Saved Messages
     *
     * `POST /conversations/save`
     */
    suspend fun save(
        link: String
    ): SaveChangesResponse {
        return client.post(
            path = "/conversations/save",
            body = mapOf(
            "link" to link
            )
        )
    }

    /**
     * Get Conversation
     *
     * `GET /conversations/{conversation_id}`
     */
    suspend fun get(
        conversationId: Long
    ): ConversationsCreateResponse {
        return client.get(path = "/conversations/${conversationId}")
    }

    /**
     * Get Conversation Messages
     *
     * `GET /conversations/{conversation_id}/messages`
     */
    suspend fun messagesList(
        conversationId: Long,
        page: Long? = null,
        limit: Long? = null,
        order: Order5? = null,
        before: Long? = null,
        after: Long? = null
    ): ConversationsMessagesListResponse {
        return client.get(
            path = "/conversations/${conversationId}/messages",
            params = mapOf(
            "page" to page,
            "limit" to limit,
            "order" to order,
            "before" to before,
            "after" to after
            )
        )
    }

    /**
     * Create Conversation Message
     *
     * `POST /conversations/{conversation_id}/messages`
     */
    suspend fun messagesCreate(
        conversationId: Long,
        messageBody: String,
        replyMessageId: Long? = null
    ): ConversationsMessagesCreateResponse {
        return client.post(
            path = "/conversations/${conversationId}/messages",
            body = mapOf(
            "reply_message_id" to replyMessageId,
            "message_body" to messageBody
            )
        )
    }

    /**
     * Search Conversations Messages
     *
     * `POST /conversations/search`
     */
    suspend fun search(
        q: String? = null,
        conversationId: Long? = null,
        searchRecipients: Boolean? = null
    ): ConversationsSearchResponse {
        return client.post(
            path = "/conversations/search",
            body = mapOf(
            "q" to q,
            "conversation_id" to conversationId,
            "search_recipients" to searchRecipients
            )
        )
    }

    /**
     * Get Conversation Message
     *
     * `GET /conversations/messages/{message_id}`
     */
    suspend fun messagesGet(
        messageId: Long
    ): ConversationsMessagesGetResponse {
        return client.get(path = "/conversations/messages/${messageId}")
    }

    /**
     * Edit Conversation Message
     *
     * `PUT /conversations/{conversation_id}/messages/{message_id}`
     */
    suspend fun messagesEdit(
        conversationId: Long,
        messageId: Long,
        messageBody: String
    ): ConversationsMessagesGetResponse {
        return client.put(
            path = "/conversations/${conversationId}/messages/${messageId}",
            body = mapOf(
            "message_body" to messageBody
            )
        )
    }

    /**
     * Delete Conversation Message
     *
     * `DELETE /conversations/{conversation_id}/messages/{message_id}`
     */
    suspend fun messagesDelete(
        conversationId: Long,
        messageId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/conversations/${conversationId}/messages/${messageId}")
    }

    /**
     * Invite Users to Conversation
     *
     * `POST /conversations/{conversation_id}/invite`
     */
    suspend fun invite(
        conversationId: Long,
        recipients: List<String>
    ): SaveChangesResponse {
        return client.post(
            path = "/conversations/${conversationId}/invite",
            body = mapOf(
            "recipients" to recipients
            )
        )
    }

    /**
     * Kick User from Conversation
     *
     * `POST /conversations/{conversation_id}/kick`
     */
    suspend fun kick(
        conversationId: Long,
        userId: Long
    ): SaveChangesResponse {
        return client.post(
            path = "/conversations/${conversationId}/kick",
            body = mapOf(
            "user_id" to userId
            )
        )
    }

    /**
     * Read a Conversation
     *
     * `POST /conversations/{conversation_id}/read`
     */
    suspend fun read(
        conversationId: Long
    ): SaveChangesResponse {
        return client.post(path = "/conversations/${conversationId}/read")
    }

    /**
     * Read All Conversations
     *
     * `POST /conversations/read-all`
     */
    suspend fun readAll(): ThreadsBumpResponse {
        return client.post(path = "/conversations/read-all")
    }

    /**
     * Stick Conversation Message
     *
     * `POST /conversations/{conversation_id}/messages/{message_id}/stick`
     */
    suspend fun messagesStick(
        conversationId: Long,
        messageId: Long
    ): SaveChangesResponse {
        return client.post(path = "/conversations/${conversationId}/messages/${messageId}/stick")
    }

    /**
     * Unstick Conversation Message
     *
     * `DELETE /conversations/{conversation_id}/messages/{message_id}/stick`
     */
    suspend fun messagesUnstick(
        conversationId: Long,
        messageId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/conversations/${conversationId}/messages/${messageId}/stick")
    }

    /**
     * Star Conversation
     *
     * `POST /conversations/{conversation_id}/star`
     */
    suspend fun star(
        conversationId: Long
    ): ThreadsBumpResponse {
        return client.post(path = "/conversations/${conversationId}/star")
    }

    /**
     * Unstar Conversation
     *
     * `DELETE /conversations/{conversation_id}/star`
     */
    suspend fun unstar(
        conversationId: Long
    ): ThreadsBumpResponse {
        return client.delete(path = "/conversations/${conversationId}/star")
    }

    /**
     * Enable Conversation Alerts
     *
     * `POST /conversations/{conversation_id}/alerts`
     */
    suspend fun alertsEnable(
        conversationId: Long
    ): ThreadsBumpResponse {
        return client.post(path = "/conversations/${conversationId}/alerts")
    }

    /**
     * Disable Conversation Alerts
     *
     * `DELETE /conversations/{conversation_id}/alerts`
     */
    suspend fun alertsDisable(
        conversationId: Long
    ): ThreadsBumpResponse {
        return client.delete(path = "/conversations/${conversationId}/alerts")
    }

}

/**
 * Forms API service.
 */
class FormsService(private val client: LolzteamHttpClient) {

    /**
     * Get Forms List
     *
     * `GET /forms`
     */
    suspend fun list(
        page: Long? = null
    ): FormsListResponse {
        return client.get(
            path = "/forms",
            params = mapOf(
            "page" to page
            )
        )
    }

    /**
     * Create Form
     *
     * `POST /forms/save`
     */
    suspend fun create(
        formId: FormId? = null,
        fields: kotlinx.serialization.json.JsonElement? = null
    ): FormsCreateResponse {
        return client.post(
            path = "/forms/save",
            body = mapOf(
            "form_id" to formId,
            "fields" to fields
            )
        )
    }

}

/**
 * Forums API service.
 */
class ForumsService(private val client: LolzteamHttpClient) {

    /**
     * Get Forums
     *
     * `GET /forums`
     */
    suspend fun list(
        parentCategoryId: Long? = null,
        parentForumId: Long? = null,
        order: Order? = null
    ): ForumsListResponse {
        return client.get(
            path = "/forums",
            params = mapOf(
            "parent_category_id" to parentCategoryId,
            "parent_forum_id" to parentForumId,
            "order" to order
            )
        )
    }

    /**
     * Get Forums Tree
     *
     * `GET /forums/grouped`
     */
    suspend fun grouped(): ForumsGroupedResponse {
        return client.get(path = "/forums/grouped")
    }

    /**
     * Get Forum
     *
     * `GET /forums/{forum_id}`
     */
    suspend fun get(
        forumId: Long
    ): ForumsGetResponse {
        return client.get(path = "/forums/${forumId}")
    }

    /**
     * Get Followers
     *
     * `GET /forums/{forum_id}/followers`
     */
    suspend fun followers(
        forumId: Long
    ): ForumsFollowersResponse {
        return client.get(path = "/forums/${forumId}/followers")
    }

    /**
     * Follow Forum
     *
     * `POST /forums/{forum_id}/followers`
     */
    suspend fun follow(
        forumId: Long,
        post: Boolean? = null,
        alert: Boolean? = null,
        email: Boolean? = null,
        prefixIds: List<Long>? = null,
        minimalContestAmount: Long? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/forums/${forumId}/followers",
            body = mapOf(
            "post" to post,
            "alert" to alert,
            "email" to email,
            "prefix_ids" to prefixIds,
            "minimal_contest_amount" to minimalContestAmount
            )
        )
    }

    /**
     * Unfollow Forum
     *
     * `DELETE /forums/{forum_id}/followers`
     */
    suspend fun unfollow(
        forumId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/forums/${forumId}/followers")
    }

    /**
     * Get Followed Forums
     *
     * `GET /forums/followed`
     */
    suspend fun followed(
        total: Boolean? = null
    ): ForumsFollowedResponse {
        return client.get(
            path = "/forums/followed",
            params = mapOf(
            "total" to total
            )
        )
    }

    /**
     * Get Feed Options
     *
     * `GET /forums/feed/options`
     */
    suspend fun getFeedOptions(): ForumsGetFeedOptionsResponse {
        return client.get(path = "/forums/feed/options")
    }

    /**
     * Edit Feed Options
     *
     * `PUT /forums/feed/options`
     */
    suspend fun editFeedOptions(
        nodeIds: List<Long>? = null,
        keywords: List<String>? = null
    ): SaveChangesResponse {
        return client.put(
            path = "/forums/feed/options",
            body = mapOf(
            "node_ids" to nodeIds,
            "keywords" to keywords
            )
        )
    }

}

/**
 * Link Forums API service.
 */
class LinkForumsService(private val client: LolzteamHttpClient) {

    /**
     * Get Links Forum
     *
     * `GET /link-forums`
     */
    suspend fun list(): LinksListResponse {
        return client.get(path = "/link-forums")
    }

    /**
     * Get Link Forum
     *
     * `GET /link-forums/{link_id}`
     */
    suspend fun get(
        linkId: Long
    ): LinksGetResponse {
        return client.get(path = "/link-forums/${linkId}")
    }

}

/**
 * Navigation API service.
 */
class NavigationService(private val client: LolzteamHttpClient) {

    /**
     * Get Navigation
     *
     * `GET /navigation`
     */
    suspend fun list(
        parent: Long? = null
    ): NavigationListResponse {
        return client.get(
            path = "/navigation",
            params = mapOf(
            "parent" to parent
            )
        )
    }

}

/**
 * Notifications API service.
 */
class NotificationsService(private val client: LolzteamHttpClient) {

    /**
     * Get Notifications
     *
     * `GET /notifications`
     */
    suspend fun list(
        `type`: Type? = null,
        page: Long? = null,
        limit: Long? = null
    ): NotificationsListResponse {
        return client.get(
            path = "/notifications",
            params = mapOf(
            "type" to `type`,
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Get Notification
     *
     * `GET /notifications/{notification_id}/content`
     */
    suspend fun get(
        notificationId: Long
    ): NotificationsGetResponse {
        return client.get(path = "/notifications/${notificationId}/content")
    }

    /**
     * Mark Notification Read
     *
     * `POST /notifications/read`
     */
    suspend fun read(
        notificationId: Long? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/notifications/read",
            body = mapOf(
            "notification_id" to notificationId
            )
        )
    }

}

/**
 * Pages API service.
 */
class PagesService(private val client: LolzteamHttpClient) {

    /**
     * Get Pages
     *
     * `GET /pages`
     */
    suspend fun list(
        parentPageId: Long? = null,
        order: Order? = null
    ): PagesListResponse {
        return client.get(
            path = "/pages",
            params = mapOf(
            "parent_page_id" to parentPageId,
            "order" to order
            )
        )
    }

    /**
     * Get Page
     *
     * `GET /pages/{page_id}`
     */
    suspend fun get(
        pageId: Long
    ): PagesGetResponse {
        return client.get(path = "/pages/${pageId}")
    }

}

/**
 * Post comments API service.
 */
class PostCommentsService(private val client: LolzteamHttpClient) {

    /**
     * Get Post Comments
     *
     * `GET /posts/comments`
     */
    suspend fun commentsGet(
        postId: Long? = null,
        before: Long? = null,
        beforeComment: Long? = null
    ): PostsCommentsGetResponse {
        return client.get(
            path = "/posts/comments",
            params = mapOf(
            "post_id" to postId,
            "before" to before,
            "before_comment" to beforeComment
            )
        )
    }

    /**
     * Create Post Comment
     *
     * `POST /posts/comments`
     */
    suspend fun commentsCreate(
        postId: Long,
        commentBody: String
    ): PostsCommentsCreateResponse {
        return client.post(
            path = "/posts/comments",
            body = mapOf(
            "post_id" to postId,
            "comment_body" to commentBody
            )
        )
    }

    /**
     * Edit Post Comment
     *
     * `PUT /posts/comments`
     */
    suspend fun commentsEdit(
        postCommentId: Long,
        commentBody: String
    ): PostsCommentsCreateResponse {
        return client.put(
            path = "/posts/comments",
            body = mapOf(
            "post_comment_id" to postCommentId,
            "comment_body" to commentBody
            )
        )
    }

    /**
     * Delete Post Comment
     *
     * `DELETE /posts/comments`
     */
    suspend fun commentsDelete(
        postCommentId: Long,
        reason: String? = null
    ): SaveChangesResponse {
        return client.delete(
            path = "/posts/comments",
            body = mapOf(
            "post_comment_id" to postCommentId,
            "reason" to reason
            )
        )
    }

}

/**
 * Posts API service.
 */
class PostsService(private val client: LolzteamHttpClient) {

    /**
     * Get Posts
     *
     * `GET /posts`
     */
    suspend fun list(
        threadId: Long? = null,
        pageOfPostId: Long? = null,
        page: Long? = null,
        limit: Long? = null,
        order: Order3? = null
    ): PostsListResponse {
        return client.get(
            path = "/posts",
            params = mapOf(
            "thread_id" to threadId,
            "page_of_post_id" to pageOfPostId,
            "page" to page,
            "limit" to limit,
            "order" to order
            )
        )
    }

    /**
     * Create Post
     *
     * `POST /posts`
     */
    suspend fun create(
        postBody: String,
        threadId: Long? = null,
        quotePostId: Long? = null
    ): PostsCreateResponse {
        return client.post(
            path = "/posts",
            body = mapOf(
            "post_body" to postBody,
            "thread_id" to threadId,
            "quote_post_id" to quotePostId
            )
        )
    }

    /**
     * Get Post
     *
     * `GET /posts/{post_id}`
     */
    suspend fun get(
        postId: Long
    ): PostsCreateResponse {
        return client.get(path = "/posts/${postId}")
    }

    /**
     * Edit Post
     *
     * `PUT /posts/{post_id}`
     */
    suspend fun edit(
        postId: Long,
        postBody: String? = null
    ): PostsCreateResponse {
        return client.put(
            path = "/posts/${postId}",
            body = mapOf(
            "post_body" to postBody
            )
        )
    }

    /**
     * Delete Post
     *
     * `DELETE /posts/{post_id}`
     */
    suspend fun delete(
        postId: Long,
        reason: String? = null
    ): SaveChangesResponse {
        return client.delete(
            path = "/posts/${postId}",
            body = mapOf(
            "reason" to reason
            )
        )
    }

    /**
     * Get Post Likes
     *
     * `GET /posts/{post_id}/likes`
     */
    suspend fun likes(
        postId: Long,
        page: Long? = null,
        limit: Long? = null
    ): PostsLikesResponse {
        return client.get(
            path = "/posts/${postId}/likes",
            params = mapOf(
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Like Post
     *
     * `POST /posts/{post_id}/likes`
     */
    suspend fun like(
        postId: Long
    ): SaveChangesResponse {
        return client.post(path = "/posts/${postId}/likes")
    }

    /**
     * Unlike Post
     *
     * `DELETE /posts/{post_id}/likes`
     */
    suspend fun unlike(
        postId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/posts/${postId}/likes")
    }

    /**
     * Get Post Report Reasons
     *
     * `GET /posts/{post_id}/report`
     */
    suspend fun reportReasons(
        postId: Long
    ): PostsReportReasonsResponse {
        return client.get(path = "/posts/${postId}/report")
    }

    /**
     * Report Post
     *
     * `POST /posts/{post_id}/report`
     */
    suspend fun report(
        postId: Long,
        message: String
    ): SaveChangesResponse {
        return client.post(
            path = "/posts/${postId}/report",
            body = mapOf(
            "message" to message
            )
        )
    }

    /**
     * Report Post Comment
     *
     * `POST /posts/comments/report`
     */
    suspend fun commentsReport(
        postCommentId: Long,
        message: String
    ): SaveChangesResponse {
        return client.post(
            path = "/posts/comments/report",
            body = mapOf(
            "post_comment_id" to postCommentId,
            "message" to message
            )
        )
    }

}

/**
 * Profile Post Comments API service.
 */
class ProfilePostCommentsService(private val client: LolzteamHttpClient) {

    /**
     * Get Profile Post Comments
     *
     * `GET /profile-posts/comments`
     */
    suspend fun commentsList(
        profilePostId: Long? = null,
        before: Long? = null,
        limit: Long? = null
    ): ProfilePostsCommentsListResponse {
        return client.get(
            path = "/profile-posts/comments",
            params = mapOf(
            "profile_post_id" to profilePostId,
            "before" to before,
            "limit" to limit
            )
        )
    }

    /**
     * Create Profile Post Comment
     *
     * `POST /profile-posts/comments`
     */
    suspend fun commentsCreate(
        profilePostId: Long,
        commentBody: String
    ): ProfilePostsCommentsCreateResponse {
        return client.post(
            path = "/profile-posts/comments",
            body = mapOf(
            "profile_post_id" to profilePostId,
            "comment_body" to commentBody
            )
        )
    }

    /**
     * Edit Profile Post Comment
     *
     * `PUT /profile-posts/comments`
     */
    suspend fun commentsEdit(
        commentId: Long,
        commentBody: String
    ): ProfilePostsCommentsCreateResponse {
        return client.put(
            path = "/profile-posts/comments",
            body = mapOf(
            "comment_id" to commentId,
            "comment_body" to commentBody
            )
        )
    }

    /**
     * Delete Profile Post Comment
     *
     * `DELETE /profile-posts/comments`
     */
    suspend fun commentsDelete(
        commentId: Long
    ): SaveChangesResponse {
        return client.delete(
            path = "/profile-posts/comments",
            body = mapOf(
            "comment_id" to commentId
            )
        )
    }

    /**
     * Get Profile Post Comment
     *
     * `GET /profile-posts/{profile_post_id}/comments/{comment_id}`
     */
    suspend fun commentsGet(
        profilePostId: Long,
        commentId: Long
    ): ProfilePostsCommentsGetResponse {
        return client.get(path = "/profile-posts/${profilePostId}/comments/${commentId}")
    }

    /**
     * Report a Profile Post Comment
     *
     * `POST /profile-posts/comments/{comment_id}/report`
     */
    suspend fun commentsReport(
        commentId: Long,
        message: String
    ): SaveChangesResponse {
        return client.post(
            path = "/profile-posts/comments/${commentId}/report",
            body = mapOf(
            "message" to message
            )
        )
    }

}

/**
 * Profile Posts API service.
 */
class ProfilePostsService(private val client: LolzteamHttpClient) {

    /**
     * Get Profile Posts
     *
     * `GET /users/{user_id}/profile-posts`
     */
    suspend fun list(
        userId: String,
        postsUserId: Long? = null,
        page: Long? = null,
        limit: Long? = null,
        fieldsInclude: List<FieldsIncludeItem3>? = null
    ): ProfilePostsListResponse {
        return client.get(
            path = "/users/${userId}/profile-posts",
            params = mapOf(
            "posts_user_id" to postsUserId,
            "page" to page,
            "limit" to limit,
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Get Profile Post
     *
     * `GET /profile-posts/{profile_post_id}`
     */
    suspend fun get(
        profilePostId: Long
    ): ProfilePostsGetResponse {
        return client.get(path = "/profile-posts/${profilePostId}")
    }

    /**
     * Edit Profile Post
     *
     * `PUT /profile-posts/{profile_post_id}`
     */
    suspend fun edit(
        profilePostId: Long,
        postBody: String? = null,
        disableComments: Boolean? = null
    ): ProfilePostsEditResponse {
        return client.put(
            path = "/profile-posts/${profilePostId}",
            body = mapOf(
            "post_body" to postBody,
            "disable_comments" to disableComments
            )
        )
    }

    /**
     * Delete Profile Post
     *
     * `DELETE /profile-posts/{profile_post_id}`
     */
    suspend fun delete(
        profilePostId: Long,
        reason: String? = null
    ): SaveChangesResponse {
        return client.delete(
            path = "/profile-posts/${profilePostId}",
            params = mapOf(
            "reason" to reason
            )
        )
    }

    /**
     * Get Profile Post Report Reasons
     *
     * `GET /profile-posts/{profile_post_id}/report`
     */
    suspend fun reportReasons(
        profilePostId: Long
    ): PostsReportReasonsResponse {
        return client.get(path = "/profile-posts/${profilePostId}/report")
    }

    /**
     * Report a Profile Post
     *
     * `POST /profile-posts/{profile_post_id}/report`
     */
    suspend fun report(
        profilePostId: Long,
        message: String
    ): SaveChangesResponse {
        return client.post(
            path = "/profile-posts/${profilePostId}/report",
            body = mapOf(
            "message" to message
            )
        )
    }

    /**
     * Create Profile Post
     *
     * `POST /profile-posts`
     */
    suspend fun create(
        userId: kotlinx.serialization.json.JsonElement,
        postBody: String
    ): ProfilePostsEditResponse {
        return client.post(
            path = "/profile-posts",
            body = mapOf(
            "user_id" to userId,
            "post_body" to postBody
            )
        )
    }

    /**
     * Stick Profile Post
     *
     * `POST /profile-posts/{profile_post_id}/stick`
     */
    suspend fun stick(
        profilePostId: Long
    ): SaveChangesResponse {
        return client.post(path = "/profile-posts/${profilePostId}/stick")
    }

    /**
     * Unstick Profile Post
     *
     * `DELETE /profile-posts/{profile_post_id}/stick`
     */
    suspend fun unstick(
        profilePostId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/profile-posts/${profilePostId}/stick")
    }

    /**
     * Get Profile Post Likes
     *
     * `GET /profile-posts/{profile_post_id}/likes`
     */
    suspend fun likes(
        profilePostId: Long
    ): PostsLikesResponse {
        return client.get(path = "/profile-posts/${profilePostId}/likes")
    }

    /**
     * Like Profile Post
     *
     * `POST /profile-posts/{profile_post_id}/likes`
     */
    suspend fun like(
        profilePostId: Long
    ): SaveChangesResponse {
        return client.post(path = "/profile-posts/${profilePostId}/likes")
    }

    /**
     * Unlike Profile Post
     *
     * `DELETE /profile-posts/{profile_post_id}/likes`
     */
    suspend fun unlike(
        profilePostId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/profile-posts/${profilePostId}/likes")
    }

}

/**
 * Searching API service.
 */
class SearchingService(private val client: LolzteamHttpClient) {

    /**
     * Search
     *
     * `POST /search`
     */
    suspend fun all(
        q: String? = null,
        tag: String? = null,
        forumId: Long? = null,
        userId: kotlinx.serialization.json.JsonElement? = null,
        page: Long? = null,
        limit: Long? = null,
        before: Long? = null
    ): SearchAllResponse {
        return client.post(
            path = "/search",
            body = mapOf(
            "q" to q,
            "tag" to tag,
            "forum_id" to forumId,
            "user_id" to userId,
            "page" to page,
            "limit" to limit,
            "before" to before
            )
        )
    }

    /**
     * Search Thread
     *
     * `POST /search/threads`
     */
    suspend fun threads(
        q: String? = null,
        tag: String? = null,
        forumId: Long? = null,
        userId: kotlinx.serialization.json.JsonElement? = null,
        page: Long? = null,
        limit: Long? = null,
        dataLimit: Long? = null,
        before: Long? = null
    ): SearchThreadsResponse {
        return client.post(
            path = "/search/threads",
            body = mapOf(
            "q" to q,
            "tag" to tag,
            "forum_id" to forumId,
            "user_id" to userId,
            "page" to page,
            "limit" to limit,
            "data_limit" to dataLimit,
            "before" to before
            )
        )
    }

    /**
     * Search Post
     *
     * `POST /search/posts`
     */
    suspend fun posts(
        q: String? = null,
        tag: String? = null,
        forumId: Long? = null,
        userId: kotlinx.serialization.json.JsonElement? = null,
        page: Long? = null,
        limit: Long? = null,
        dataLimit: Long? = null,
        before: Long? = null
    ): SearchThreadsResponse {
        return client.post(
            path = "/search/posts",
            body = mapOf(
            "q" to q,
            "tag" to tag,
            "forum_id" to forumId,
            "user_id" to userId,
            "page" to page,
            "limit" to limit,
            "data_limit" to dataLimit,
            "before" to before
            )
        )
    }

    /**
     * Search Users
     *
     * `POST /search/users`
     */
    suspend fun users(
        q: String? = null
    ): UsersFindResponse {
        return client.post(
            path = "/search/users",
            body = mapOf(
            "q" to q
            )
        )
    }

    /**
     * Search Profile Posts
     *
     * `POST /search/profile-posts`
     */
    suspend fun profilePosts(
        q: String? = null,
        userId: Long? = null,
        page: Long? = null,
        limit: Long? = null,
        before: Long? = null
    ): SearchProfilePostsResponse {
        return client.post(
            path = "/search/profile-posts",
            body = mapOf(
            "q" to q,
            "user_id" to userId,
            "page" to page,
            "limit" to limit,
            "before" to before
            )
        )
    }

    /**
     * Search Tagged
     *
     * `POST /search/tagged`
     */
    suspend fun tagged(
        tag: String? = null,
        tags: List<String>? = null,
        page: Long? = null,
        limit: Long? = null
    ): SearchTaggedResponse {
        return client.post(
            path = "/search/tagged",
            body = mapOf(
            "tag" to tag,
            "tags" to tags,
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Get Search Results
     *
     * `GET /search/{search_id}/results`
     */
    suspend fun results(
        searchId: String,
        page: Long? = null,
        limit: Long? = null
    ): SearchTaggedResponse {
        return client.get(path = "/search/${searchId}/results")
    }

}

/**
 * Threads API service.
 */
class ThreadsService(private val client: LolzteamHttpClient) {

    /**
     * Get Threads
     *
     * `GET /threads`
     */
    suspend fun list(
        forumId: Long? = null,
        tab: String? = null,
        state: State? = null,
        period: Period? = null,
        title: String? = null,
        titleOnly: Boolean? = null,
        creatorUserId: Long? = null,
        sticky: Boolean? = null,
        prefixIds: List<Long>? = null,
        prefixIdsNot: List<Long>? = null,
        threadTagId: Long? = null,
        page: Long? = null,
        limit: Long? = null,
        order: Order2? = null,
        direction: Direction? = null,
        threadCreateDate: Long? = null,
        threadUpdateDate: Long? = null,
        fieldsInclude: List<FieldsIncludeItem>? = null
    ): ThreadsListResponse {
        return client.get(
            path = "/threads",
            params = mapOf(
            "forum_id" to forumId,
            "tab" to tab,
            "state" to state,
            "period" to period,
            "title" to title,
            "title_only" to titleOnly,
            "creator_user_id" to creatorUserId,
            "sticky" to sticky,
            "prefix_ids[]" to prefixIds,
            "prefix_ids_not[]" to prefixIdsNot,
            "thread_tag_id" to threadTagId,
            "page" to page,
            "limit" to limit,
            "order" to order,
            "direction" to direction,
            "thread_create_date" to threadCreateDate,
            "thread_update_date" to threadUpdateDate,
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Create Thread
     *
     * `POST /threads`
     */
    suspend fun create(
        postBody: String,
        forumId: Long,
        title: String? = null,
        titleEn: String? = null,
        prefixId: List<Long>? = null,
        tags: List<String>? = null,
        hideContacts: Boolean? = null,
        allowAskHiddenContent: Boolean? = null,
        replyGroup: ReplyGroup? = null,
        commentIgnoreGroup: Boolean? = null,
        dontAlertFollowers: Boolean? = null,
        scheduleDate: String? = null,
        scheduleTime: String? = null,
        watchThreadState: Boolean? = null,
        watchThread: Boolean? = null,
        watchThreadEmail: Boolean? = null
    ): ThreadsCreateResponse {
        return client.post(
            path = "/threads",
            body = mapOf(
            "post_body" to postBody,
            "forum_id" to forumId,
            "title" to title,
            "title_en" to titleEn,
            "prefix_id" to prefixId,
            "tags" to tags,
            "hide_contacts" to hideContacts,
            "allow_ask_hidden_content" to allowAskHiddenContent,
            "reply_group" to replyGroup,
            "comment_ignore_group" to commentIgnoreGroup,
            "dont_alert_followers" to dontAlertFollowers,
            "schedule_date" to scheduleDate,
            "schedule_time" to scheduleTime,
            "watch_thread_state" to watchThreadState,
            "watch_thread" to watchThread,
            "watch_thread_email" to watchThreadEmail
            )
        )
    }

    /**
     * Create Contest
     *
     * `POST /contests`
     */
    suspend fun createContest(
        postBody: String,
        contestType: ContestType,
        prizeType: PrizeType,
        requireLikeCount: Long,
        requireTotalLikeCount: Long,
        title: String? = null,
        titleEn: String? = null,
        lengthValue: Long? = null,
        lengthOption: LengthOption? = null,
        countWinners: Long? = null,
        prizeDataMoney: Double? = null,
        isMoneyPlaces: Boolean? = null,
        prizeDataPlaces: List<Double>? = null,
        prizeDataUpgrade: PrizeDataUpgrade? = null,
        secretAnswer: String? = null,
        tags: List<String>? = null,
        replyGroup: ReplyGroup? = null,
        commentIgnoreGroup: Boolean? = null,
        dontAlertFollowers: Boolean? = null,
        hideContacts: Boolean? = null,
        allowAskHiddenContent: Boolean? = null,
        scheduleDate: String? = null,
        scheduleTime: String? = null,
        watchThreadState: Boolean? = null,
        watchThread: Boolean? = null,
        watchThreadEmail: Boolean? = null
    ): ThreadsCreateResponse {
        return client.post(
            path = "/contests",
            body = mapOf(
            "post_body" to postBody,
            "title" to title,
            "title_en" to titleEn,
            "contest_type" to contestType,
            "length_value" to lengthValue,
            "length_option" to lengthOption,
            "prize_type" to prizeType,
            "count_winners" to countWinners,
            "prize_data_money" to prizeDataMoney,
            "is_money_places" to isMoneyPlaces,
            "prize_data_places" to prizeDataPlaces,
            "prize_data_upgrade" to prizeDataUpgrade,
            "require_like_count" to requireLikeCount,
            "require_total_like_count" to requireTotalLikeCount,
            "secret_answer" to secretAnswer,
            "tags" to tags,
            "reply_group" to replyGroup,
            "comment_ignore_group" to commentIgnoreGroup,
            "dont_alert_followers" to dontAlertFollowers,
            "hide_contacts" to hideContacts,
            "allow_ask_hidden_content" to allowAskHiddenContent,
            "schedule_date" to scheduleDate,
            "schedule_time" to scheduleTime,
            "watch_thread_state" to watchThreadState,
            "watch_thread" to watchThread,
            "watch_thread_email" to watchThreadEmail
            )
        )
    }

    /**
     * Create Claim
     *
     * `POST /claims`
     */
    suspend fun claim(
        asResponder: String,
        asIsMarketDeal: Boolean,
        asAmount: Double,
        transferType: TransferType,
        postBody: String,
        asMarketItemId: Long? = null,
        asData: String? = null,
        currency: Currency? = null,
        payClaim: PayClaim? = null,
        asFundsReceipt: String? = null,
        asTgLoginScreenshot: String? = null,
        tags: List<String>? = null,
        hideContacts: Boolean? = null,
        allowAskHiddenContent: Boolean? = null,
        replyGroup: ReplyGroup? = null,
        commentIgnoreGroup: Boolean? = null,
        dontAlertFollowers: Boolean? = null,
        scheduleDate: String? = null,
        scheduleTime: String? = null,
        watchThreadState: Boolean? = null,
        watchThread: Boolean? = null,
        watchThreadEmail: Boolean? = null
    ): ThreadsCreateResponse {
        return client.post(
            path = "/claims",
            body = mapOf(
            "as_responder" to asResponder,
            "as_is_market_deal" to asIsMarketDeal,
            "as_market_item_id" to asMarketItemId,
            "as_data" to asData,
            "as_amount" to asAmount,
            "currency" to currency,
            "transfer_type" to transferType,
            "pay_claim" to payClaim,
            "as_funds_receipt" to asFundsReceipt,
            "as_tg_login_screenshot" to asTgLoginScreenshot,
            "tags" to tags,
            "hide_contacts" to hideContacts,
            "allow_ask_hidden_content" to allowAskHiddenContent,
            "reply_group" to replyGroup,
            "comment_ignore_group" to commentIgnoreGroup,
            "dont_alert_followers" to dontAlertFollowers,
            "schedule_date" to scheduleDate,
            "schedule_time" to scheduleTime,
            "watch_thread_state" to watchThreadState,
            "watch_thread" to watchThread,
            "watch_thread_email" to watchThreadEmail,
            "post_body" to postBody
            )
        )
    }

    /**
     * Get Thread
     *
     * `GET /threads/{thread_id}`
     */
    suspend fun get(
        threadId: Long,
        fieldsInclude: List<FieldsIncludeItem>? = null
    ): ThreadsCreateResponse {
        return client.get(
            path = "/threads/${threadId}",
            params = mapOf(
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Edit thread
     *
     * `PUT /threads/{thread_id}`
     */
    suspend fun edit(
        threadId: Long,
        title: String? = null,
        titleEn: String? = null,
        prefixId: List<Long>? = null,
        tags: List<String>? = null,
        discussionOpen: Boolean? = null,
        hideContacts: Boolean? = null,
        allowAskHiddenContent: Boolean? = null,
        replyGroup: ReplyGroup? = null,
        commentIgnoreGroup: Boolean? = null
    ): ThreadsCreateResponse {
        return client.put(
            path = "/threads/${threadId}",
            body = mapOf(
            "title" to title,
            "title_en" to titleEn,
            "prefix_id" to prefixId,
            "tags" to tags,
            "discussion_open" to discussionOpen,
            "hide_contacts" to hideContacts,
            "allow_ask_hidden_content" to allowAskHiddenContent,
            "reply_group" to replyGroup,
            "comment_ignore_group" to commentIgnoreGroup
            )
        )
    }

    /**
     * Delete Thread
     *
     * `DELETE /threads/{thread_id}`
     */
    suspend fun delete(
        threadId: Long,
        reason: String? = null
    ): SaveChangesResponse {
        return client.delete(
            path = "/threads/${threadId}",
            body = mapOf(
            "reason" to reason
            )
        )
    }

    /**
     * Move Thread
     *
     * `POST /threads/{thread_id}/move`
     */
    suspend fun move(
        threadId: Long,
        nodeId: String,
        title: String? = null,
        titleEn: String? = null,
        prefixId: List<Long>? = null,
        applyThreadPrefix: Boolean? = null,
        sendAlert: Boolean? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/threads/${threadId}/move",
            body = mapOf(
            "node_id" to nodeId,
            "title" to title,
            "title_en" to titleEn,
            "prefix_id" to prefixId,
            "apply_thread_prefix" to applyThreadPrefix,
            "send_alert" to sendAlert
            )
        )
    }

    /**
     * Bump Thread
     *
     * `POST /threads/{thread_id}/bump`
     */
    suspend fun bump(
        threadId: Long
    ): ThreadsBumpResponse {
        return client.post(path = "/threads/${threadId}/bump")
    }

    /**
     * Hide Thread
     *
     * `POST /threads/{thread_id}/hide`
     */
    suspend fun hide(
        threadId: Long
    ): ThreadsBumpResponse {
        return client.post(path = "/threads/${threadId}/hide")
    }

    /**
     * Bookmark Thread
     *
     * `POST /threads/{thread_id}/star`
     */
    suspend fun star(
        threadId: Long
    ): SaveChangesResponse {
        return client.post(path = "/threads/${threadId}/star")
    }

    /**
     * Unbookmark Thread
     *
     * `DELETE /threads/{thread_id}/star`
     */
    suspend fun unstar(
        threadId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/threads/${threadId}/star")
    }

    /**
     * Get Thread Followers
     *
     * `GET /threads/{thread_id}/followers`
     */
    suspend fun followers(
        threadId: Long
    ): ThreadsFollowersResponse {
        return client.get(path = "/threads/${threadId}/followers")
    }

    /**
     * Follow Thread
     *
     * `POST /threads/{thread_id}/followers`
     */
    suspend fun follow(
        threadId: Long,
        email: Boolean? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/threads/${threadId}/followers",
            body = mapOf(
            "email" to email
            )
        )
    }

    /**
     * Unfollow Thread
     *
     * `DELETE /threads/{thread_id}/followers`
     */
    suspend fun unfollow(
        threadId: Long
    ): SaveChangesResponse {
        return client.delete(path = "/threads/${threadId}/followers")
    }

    /**
     * Get Followed Threads
     *
     * `GET /threads/followed`
     */
    suspend fun followed(
        total: Boolean? = null,
        fieldsInclude: List<FieldsIncludeItem>? = null
    ): ThreadsFollowedResponse {
        return client.get(
            path = "/threads/followed",
            params = mapOf(
            "total" to total,
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Get Navigation Elements
     *
     * `GET /threads/{thread_id}/navigation`
     */
    suspend fun navigation(
        threadId: Long
    ): ThreadsNavigationResponse {
        return client.get(path = "/threads/${threadId}/navigation")
    }

    /**
     * Get Poll
     *
     * `GET /threads/{thread_id}/poll`
     */
    suspend fun pollGet(
        threadId: Long
    ): ThreadsPollGetResponse {
        return client.get(path = "/threads/${threadId}/poll")
    }

    /**
     * Vote Poll
     *
     * `POST /threads/{thread_id}/poll/votes`
     */
    suspend fun pollVote(
        threadId: Long,
        responseId: Long? = null,
        responseIds: List<Long>? = null
    ): SaveChangesResponse {
        return client.post(
            path = "/threads/${threadId}/poll/votes",
            body = mapOf(
            "response_id" to responseId,
            "response_ids" to responseIds
            )
        )
    }

    /**
     * Get Unread Threads
     *
     * `GET /threads/new`
     */
    suspend fun unread(
        limit: Long? = null,
        forumId: Long? = null,
        dataLimit: Long? = null
    ): ThreadsUnreadResponse {
        return client.get(
            path = "/threads/new",
            params = mapOf(
            "limit" to limit,
            "forum_id" to forumId,
            "data_limit" to dataLimit
            )
        )
    }

    /**
     * Get Recent Threads
     *
     * `GET /threads/recent`
     */
    suspend fun recent(
        days: Long? = null,
        limit: Long? = null,
        forumId: Long? = null,
        dataLimit: Long? = null
    ): ThreadsRecentResponse {
        return client.get(
            path = "/threads/recent",
            params = mapOf(
            "days" to days,
            "limit" to limit,
            "forum_id" to forumId,
            "data_limit" to dataLimit
            )
        )
    }

    /**
     * Finish Contest
     *
     * `POST /contests/{thread_id}/finish`
     */
    suspend fun finish(
        threadId: Long
    ): SaveChangesResponse {
        return client.post(path = "/contests/${threadId}/finish")
    }

}

/**
 * Users API service.
 */
class UsersService(private val client: LolzteamHttpClient) {

    /**
     * Get Users
     *
     * `GET /users`
     */
    suspend fun list(
        page: Long? = null,
        limit: Long? = null,
        fieldsInclude: List<FieldsIncludeItem2>? = null
    ): UsersListResponse {
        return client.get(
            path = "/users",
            params = mapOf(
            "page" to page,
            "limit" to limit,
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Get User Fields
     *
     * `GET /users/fields`
     */
    suspend fun fields(): UsersFieldsResponse {
        return client.get(path = "/users/fields")
    }

    /**
     * Find Users
     *
     * `GET /users/find`
     */
    suspend fun find(
        username: String? = null,
        customFields: Map<String, String>? = null,
        fieldsInclude: List<FieldsIncludeItem2>? = null
    ): UsersFindResponse {
        return client.get(
            path = "/users/find",
            params = mapOf(
            "username" to username,
            "custom_fields" to customFields,
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Get User
     *
     * `GET /users/{user_id}`
     */
    suspend fun get(
        userId: String,
        fieldsInclude: List<FieldsIncludeItem2>? = null
    ): UsersGetResponse {
        return client.get(
            path = "/users/${userId}",
            params = mapOf(
            "fields_include" to fieldsInclude
            )
        )
    }

    /**
     * Edit User
     *
     * `PUT /users/{user_id}`
     */
    suspend fun edit(
        userId: String,
        username: String? = null,
        userTitle: String? = null,
        displayGroupId: Long? = null,
        displayIconGroupId: Long? = null,
        displayBannerId: Long? = null,
        convWelcomeMessage: String? = null,
        userDobDay: Long? = null,
        userDobMonth: Long? = null,
        userDobYear: Long? = null,
        secretAnswer: String? = null,
        secretAnswerType: Long? = null,
        shortLink: String? = null,
        languageId: LanguageId? = null,
        gender: Gender? = null,
        timezone: String? = null,
        receiveAdminEmail: Boolean? = null,
        activityVisible: Boolean? = null,
        showDobDate: Boolean? = null,
        showDobYear: Boolean? = null,
        hideUsernameChangeLogs: Boolean? = null,
        allowViewProfile: AllowViewProfile? = null,
        allowPostProfile: AllowViewProfile? = null,
        allowSendPersonalConversation: AllowViewProfile? = null,
        allowInviteGroup: AllowViewProfile? = null,
        allowReceiveNewsFeed: AllowViewProfile? = null,
        alert: Map<String, Boolean>? = null,
        fields: UsersEditFields? = null
    ): SaveChangesResponse {
        return client.put(
            path = "/users/${userId}",
            body = mapOf(
            "username" to username,
            "user_title" to userTitle,
            "display_group_id" to displayGroupId,
            "display_icon_group_id" to displayIconGroupId,
            "display_banner_id" to displayBannerId,
            "conv_welcome_message" to convWelcomeMessage,
            "user_dob_day" to userDobDay,
            "user_dob_month" to userDobMonth,
            "user_dob_year" to userDobYear,
            "secret_answer" to secretAnswer,
            "secret_answer_type" to secretAnswerType,
            "short_link" to shortLink,
            "language_id" to languageId,
            "gender" to gender,
            "timezone" to timezone,
            "receive_admin_email" to receiveAdminEmail,
            "activity_visible" to activityVisible,
            "show_dob_date" to showDobDate,
            "show_dob_year" to showDobYear,
            "hide_username_change_logs" to hideUsernameChangeLogs,
            "allow_view_profile" to allowViewProfile,
            "allow_post_profile" to allowPostProfile,
            "allow_send_personal_conversation" to allowSendPersonalConversation,
            "allow_invite_group" to allowInviteGroup,
            "allow_receive_news_feed" to allowReceiveNewsFeed,
            "alert" to alert,
            "fields" to fields
            )
        )
    }

    /**
     * Get User Claims
     *
     * `GET /users/{user_id}/claims`
     */
    suspend fun claims(
        userId: String,
        `type`: Type? = null,
        claimState: ClaimState? = null
    ): UsersClaimsResponse {
        return client.get(
            path = "/users/${userId}/claims",
            params = mapOf(
            "type" to `type`,
            "claim_state" to claimState
            )
        )
    }

    /**
     * Upload Avatar
     *
     * `POST /users/{user_id}/avatar`
     */
    suspend fun avatarUpload(
        userId: String,
        avatar: ByteArray,
        x: Long? = null,
        y: Long? = null,
        crop: Long? = null
    ): ThreadsBumpResponse {
        return client.postMultipart(
            path = "/users/${userId}/avatar",
            textParts = mapOf(
            "x" to x,
            "y" to y,
            "crop" to crop
            ),
            binaryParts = mapOf(
            "avatar" to Pair("avatar", avatar)
            )
        )
    }

    /**
     * Delete Avatar
     *
     * `DELETE /users/{user_id}/avatar`
     */
    suspend fun avatarDelete(
        userId: String
    ): SaveChangesResponse {
        return client.delete(path = "/users/${userId}/avatar")
    }

    /**
     * Crop Avatar
     *
     * `POST /users/{user_id}/avatar/crop`
     */
    suspend fun avatarCrop(
        userId: String,
        x: Long? = null,
        y: Long? = null,
        crop: Long? = null
    ): ThreadsBumpResponse {
        return client.post(
            path = "/users/${userId}/avatar/crop",
            body = mapOf(
            "x" to x,
            "y" to y,
            "crop" to crop
            )
        )
    }

    /**
     * Upload Background
     *
     * `POST /users/{user_id}/background`
     */
    suspend fun backgroundUpload(
        userId: String,
        background: ByteArray,
        x: Long? = null,
        y: Long? = null,
        crop: Long? = null
    ): ThreadsBumpResponse {
        return client.postMultipart(
            path = "/users/${userId}/background",
            textParts = mapOf(
            "x" to x,
            "y" to y,
            "crop" to crop
            ),
            binaryParts = mapOf(
            "background" to Pair("background", background)
            )
        )
    }

    /**
     * Delete Background
     *
     * `DELETE /users/{user_id}/background`
     */
    suspend fun backgroundDelete(
        userId: String
    ): SaveChangesResponse {
        return client.delete(path = "/users/${userId}/background")
    }

    /**
     * Crop Background
     *
     * `POST /users/{user_id}/background/crop`
     */
    suspend fun backgroundCrop(
        userId: String,
        x: Long? = null,
        y: Long? = null,
        crop: Long? = null
    ): ThreadsBumpResponse {
        return client.post(
            path = "/users/${userId}/background/crop",
            body = mapOf(
            "x" to x,
            "y" to y,
            "crop" to crop
            )
        )
    }

    /**
     * Get User Followers
     *
     * `GET /users/{user_id}/followers`
     */
    suspend fun followers(
        userId: String,
        order: Order4? = null,
        page: Long? = null,
        limit: Long? = null
    ): UsersFollowersResponse {
        return client.get(
            path = "/users/${userId}/followers",
            params = mapOf(
            "order" to order,
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Follow User
     *
     * `POST /users/{user_id}/followers`
     */
    suspend fun follow(
        userId: String
    ): SaveChangesResponse {
        return client.post(path = "/users/${userId}/followers")
    }

    /**
     * Unfollow User
     *
     * `DELETE /users/{user_id}/followers`
     */
    suspend fun unfollow(
        userId: String
    ): SaveChangesResponse {
        return client.delete(path = "/users/${userId}/followers")
    }

    /**
     * Get Followed Users By User
     *
     * `GET /users/{user_id}/followings`
     */
    suspend fun followings(
        userId: String,
        order: Order4? = null,
        page: Long? = null,
        limit: Long? = null
    ): UsersFollowingsResponse {
        return client.get(
            path = "/users/${userId}/followings",
            params = mapOf(
            "order" to order,
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Get User Likes
     *
     * `GET /users/{user_id}/likes`
     */
    suspend fun likes(
        userId: String,
        nodeId: Long? = null,
        likeType: LikeType? = null,
        `type`: Type2? = null,
        page: Long? = null,
        contentType: ContentType? = null,
        searchUserId: Long? = null,
        stats: Boolean? = null
    ): UsersLikesResponse {
        return client.get(
            path = "/users/${userId}/likes",
            params = mapOf(
            "node_id" to nodeId,
            "like_type" to likeType,
            "type" to `type`,
            "page" to page,
            "content_type" to contentType,
            "search_user_id" to searchUserId,
            "stats" to stats
            )
        )
    }

    /**
     * Get Ignored Users
     *
     * `GET /users/ignored`
     */
    suspend fun ignored(
        total: Boolean? = null
    ): UsersIgnoredResponse {
        return client.get(
            path = "/users/ignored",
            params = mapOf(
            "total" to total
            )
        )
    }

    /**
     * Ignore User
     *
     * `POST /users/{user_id}/ignore`
     */
    suspend fun ignore(
        userId: String
    ): SaveChangesResponse {
        return client.post(path = "/users/${userId}/ignore")
    }

    /**
     * Edit Ignoring Options
     *
     * `PUT /users/{user_id}/ignore`
     */
    suspend fun ignoreEdit(
        userId: String,
        ignoreConversations: Boolean? = null,
        ignoreContent: Boolean? = null,
        restrictViewProfile: Boolean? = null
    ): SaveChangesResponse {
        return client.put(
            path = "/users/${userId}/ignore",
            params = mapOf(
            "ignore_conversations" to ignoreConversations,
            "ignore_content" to ignoreContent,
            "restrict_view_profile" to restrictViewProfile
            )
        )
    }

    /**
     * Unignore User
     *
     * `DELETE /users/{user_id}/ignore`
     */
    suspend fun unignore(
        userId: String
    ): SaveChangesResponse {
        return client.delete(path = "/users/${userId}/ignore")
    }

    /**
     * Get Contents
     *
     * `GET /users/{user_id}/timeline`
     */
    suspend fun contents(
        userId: String,
        page: Long? = null,
        limit: Long? = null
    ): UsersContentsResponse {
        return client.get(
            path = "/users/${userId}/timeline",
            params = mapOf(
            "page" to page,
            "limit" to limit
            )
        )
    }

    /**
     * Get Trophies
     *
     * `GET /users/{user_id}/trophies`
     */
    suspend fun trophies(
        userId: String
    ): UsersTrophiesResponse {
        return client.get(path = "/users/${userId}/trophies")
    }

    /**
     * Get Secret Answer Types
     *
     * `GET /users/secret-answer/types`
     */
    suspend fun secretAnswerTypes(): UsersSecretAnswerTypesResponse {
        return client.get(path = "/users/secret-answer/types")
    }

    /**
     * Reset Secret Answer
     *
     * `POST /account/secret-answer/reset`
     */
    suspend fun sAReset(): UsersSAResetResponse {
        return client.post(path = "/account/secret-answer/reset")
    }

    /**
     * Cancel Secret Answer Reset
     *
     * `DELETE /account/secret-answer/reset`
     */
    suspend fun sACancelReset(): SaveChangesResponse {
        return client.delete(path = "/account/secret-answer/reset")
    }

}
