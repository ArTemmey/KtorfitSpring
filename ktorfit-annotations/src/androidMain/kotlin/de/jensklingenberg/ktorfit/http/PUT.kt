package de.jensklingenberg.ktorfit.http


/** Make a PUT request.
 * @param name relative url path, if empty, you need to have a parameter with [Url]
 * */
@Target(AnnotationTarget.FUNCTION)
@Suppress("ACTUAL_ANNOTATION_CONFLICTING_DEFAULT_ARGUMENT_VALUE")
actual annotation class PUT(
    actual val name: String = "",
    actual val value: Array<String> = [],
    actual val path: Array<String> = [],
    actual val params: Array<String> = [],
    actual val headers: Array<String> = [],
    actual val consumes: Array<String> = [],
    actual val produces: Array<String> = []
)