package de.jensklingenberg.ktorfit.http


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
@Target(AnnotationTarget.VALUE_PARAMETER)
@Suppress("ACTUAL_ANNOTATION_CONFLICTING_DEFAULT_ARGUMENT_VALUE")
actual annotation class Query(
    actual val value: String,
    actual val name: String = "",
    actual val required: Boolean = true,
    actual val defaultValue: String = "\n\t\t\n\t\t\n\uE000\uE001\uE002\n\t\t\t\t\n"
)