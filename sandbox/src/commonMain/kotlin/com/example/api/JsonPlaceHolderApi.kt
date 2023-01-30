package com.example.api

import com.example.model.Comment
import com.example.model.MyOwnResponse
import com.example.model.Post
import de.jensklingenberg.ktorfit.Call
import de.jensklingenberg.ktorfit.http.*
import io.ktor.client.statement.*
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.flow.Flow

interface JsonPlaceHolderApi {

    companion object {
        const val baseUrl = "https://jsonplaceholder.typicode.com/"
    }

    @GET(name = "posts")
    fun getPosts(): Flow<String>

    @GET(name = "posts")
    fun callPosts(): Call<List<Post>>

    @GET(name = "posts")
    fun suscallPosts(): Call<String>

    @Streaming
    @GET(name = "docs/response.html#streaming")
    suspend fun getPostsStreaming(@QueryMap test: Map<String, String>): HttpStatement

    @GET(name = "posts/{postId}")
    suspend fun getPostById(@Path("postId") postId: Int = 4): Post

    @GET(name = "posts/{postId}/comments")
    fun getFlowCommentsByPostId(@Path("postId") postId: Int): Flow<List<Comment>>?

    @GET(name = "posts/{postId}/comments")
    suspend fun getCommentsByPostId(@Path("postId") postId: Int): List<Comment>?

    @GET(name = "posts/{postId}/comments")
    suspend fun getCommentsByPostIdResponse(@RequestType(Int::class) @Path("postId") postId: String): MyOwnResponse<List<Comment>>

    @Headers(value = ["Content-Type: application/json"])
    @GET(name = "posts/{postId}/comments")
    fun callCommentsByPostId(@Path("postId") postId: Int): Call<List<Comment>>

    @Headers(value = ["Content-Type: application/json"])
    @GET(name = "posts/{postId}/comments")
    suspend fun resCommentsByPostId(@Path("postId") postId: Int): Response<List<Comment>>

    @Headers(value = ["Content-Type: application/json"])
    @GET(name = "posts/{postId}/comments")
    fun deferedCommentsByPostId(@Path("postId") postId: Int): Deferred<List<Comment>>

    @Headers(value = ["Content-Type: application/json"])
    @GET(name = "comments")
    fun getCommentsByPostIdQuery(
        @QueryName(true) postId: List<String>,
        @HeaderMap() postId2: Map<String, *>
    ): Call<String>

    @Headers(value = ["Content-Type: application/json"])
    @POST(name = "posts")
    suspend fun postPosts(@Body post: Post): Post

    @Headers(value = ["Content-Type: application/json"])
    @POST(name = "posts")
    suspend fun putPosts(@Body post: Post): Post

    @Headers(value = ["Content-Type: application/json"])
    @PATCH(name = "posts/{postId}/{number}")
    suspend fun patchPosts(@Path("postId") postId: Int): Post

    @Headers(value = ["Content-Type: application/json"])
    @DELETE(name = "posts/{postId}")
    suspend fun deletePosts(@Path("postId") postId: Int): String

}

