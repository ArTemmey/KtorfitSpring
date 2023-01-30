package de.jensklingenberg.ktorfit.demo

import com.example.model.Post
import de.jensklingenberg.ktorfit.Call
import de.jensklingenberg.ktorfit.http.*
import io.ktor.client.request.forms.*
import io.reactivex.rxjava3.core.Observable
import kotlinx.coroutines.flow.Flow




interface TestApi  {

    @GET(name = "pos4ts")
    fun getPosts(): Call<List<Post>>

    @GET(name = "posts/{userId}")
    suspend fun getPost(@Path("userId") myUserId: Int = 4): Post

    @POST(name = "posts")
    suspend fun postPost(@Body otherID: Post): Post

    @GET(name = "posts/{userId}")
    suspend fun getPostsByUserId(@Path("userId") myUserId: Int): List<Post>

    @Headers(value = ["Accept: application/json"])
    @GET(name = "posts")
    fun getFlowPosts(): Flow<List<Post>>


    @POST(name = "upload")
    suspend fun uppi(@Body map: MultiPartFormDataContent)

    @Headers(value = ["Accept: application/json"])
    @GET(name = "posts")
    fun getObserPosts(): Observable<List<Post>>



}

