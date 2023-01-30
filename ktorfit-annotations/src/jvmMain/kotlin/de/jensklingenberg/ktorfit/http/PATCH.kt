package de.jensklingenberg.ktorfit.http

import org.springframework.web.bind.annotation.PatchMapping

/** Make a PATCH request.
 * @param name relative url path, if empty, you need to have a parameter with [Url]
 * */
@Suppress("NO_ACTUAL_CLASS_MEMBER_FOR_EXPECTED_CLASS")
actual typealias PATCH = PatchMapping