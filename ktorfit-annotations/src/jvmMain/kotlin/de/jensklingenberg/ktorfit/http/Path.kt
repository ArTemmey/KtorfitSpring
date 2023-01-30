package de.jensklingenberg.ktorfit.http

import org.springframework.web.bind.annotation.PathVariable

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

@Suppress("ACTUAL_ANNOTATION_CONFLICTING_DEFAULT_ARGUMENT_VALUE")
actual typealias Path = PathVariable