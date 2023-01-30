package de.jensklingenberg.ktorfit.http

/** Make a DELETE request.
 * @param name relative url path, if empty, you need to have a parameter with [Url]
 * */
@Target(AnnotationTarget.FUNCTION)
@Suppress("NO_ACTUAL_FOR_EXPECT")
expect annotation class DELETE(
    val name: String = "",
    val value: Array<String> = [],
    val path: Array<String> = [],
    val params: Array<String> = [],
    val headers: Array<String> = [],
    val consumes: Array<String> = [],
    val produces: Array<String> = []
)