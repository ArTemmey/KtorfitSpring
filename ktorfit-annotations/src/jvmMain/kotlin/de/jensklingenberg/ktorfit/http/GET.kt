package de.jensklingenberg.ktorfit.http

import org.springframework.web.bind.annotation.GetMapping

/** Make a GET request.
 * @param name relative url path, if empty, you need to have a parameter with [Url]
 * */
@Suppress("NO_ACTUAL_CLASS_MEMBER_FOR_EXPECTED_CLASS")
actual typealias GET = GetMapping