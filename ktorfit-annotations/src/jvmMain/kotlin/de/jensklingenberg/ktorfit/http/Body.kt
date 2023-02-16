package de.jensklingenberg.ktorfit.http

import org.springframework.web.bind.annotation.RequestBody

/**
 *
 *
Use this to upload data in an HTTP Body
@POST("createIssue")
fun upload(@Body issue: Issue)
 */
actual typealias Body = RequestBody