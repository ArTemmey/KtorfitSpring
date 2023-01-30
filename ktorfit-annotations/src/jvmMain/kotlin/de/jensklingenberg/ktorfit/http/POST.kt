package de.jensklingenberg.ktorfit.http

import org.springframework.web.bind.annotation.PostMapping

/** Make a POST request.
 * @param name relative url path, if empty, you need to have a parameter with [Url]
 * */
@Suppress("NO_ACTUAL_CLASS_MEMBER_FOR_EXPECTED_CLASS")
actual typealias POST = PostMapping