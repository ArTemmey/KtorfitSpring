package de.jensklingenberg.ktorfit.http

/**
 * This can be set if you have parts in your URL that want to dynamically replaced
 *
 * @param value When the URL of an HTTP Method Annotation contains curly braces. They will be replaced with the value of
 * the corresponding parameter that has a matching [value]
 * <p>Path parameters type may not be nullable.
 *
 *
<pre><code>
@GET("post/{postId}")
suspend fun getPosts(@Path("postId") postId: Int): List< Post>
</code></pre>
 */

@Target(AnnotationTarget.VALUE_PARAMETER)
expect annotation class Path(
    val value: String,
    val name: String = "",
    val required: Boolean = true
)