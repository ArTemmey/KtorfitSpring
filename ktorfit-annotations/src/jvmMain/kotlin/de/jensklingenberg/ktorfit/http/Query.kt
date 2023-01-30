package de.jensklingenberg.ktorfit.http

import org.springframework.web.bind.annotation.RequestParam


/**
 * Used for query parameters
 *
 * @ GET("comments")
 * suspend fun getCommentsById(@Query("postId") postId: String): List<Comment>
 *
 * A request with getCommentsById(3) will result in the relative URL “comments?postId=3”
 *
 * @ GET("comments")
 * suspend fun getCommentsById(@Query("postId") postId: List<String?>): List<Comment>
 *
 * A request with getCommentsById(listOf("3",null,"4")) will result in the relative URL “comments?postId=3&postId=4”
 *
 * =====
 * [value] is the key of the query parameter
 * null values are ignored
 */
@Suppress("ACTUAL_ANNOTATION_CONFLICTING_DEFAULT_ARGUMENT_VALUE")
actual typealias Query = RequestParam