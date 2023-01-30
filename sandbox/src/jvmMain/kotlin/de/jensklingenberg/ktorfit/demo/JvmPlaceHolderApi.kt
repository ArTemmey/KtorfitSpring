package de.jensklingenberg.ktorfit.demo

import com.example.api.Response
import com.example.api.StarWarsApi
import com.example.model.People
import de.jensklingenberg.ktorfit.Call
import de.jensklingenberg.ktorfit.http.*
import io.ktor.client.statement.*

interface JvmPlaceHolderApi : StarWarsApi {

    @GET(name = "people/{id}/")
    suspend fun getPersonById2(@Path("id") peopleId: Int): People

    @GET(name = "people/{id}/")
    suspend fun testQuery(@Path("id") peopleId: Int, @Query("hello") world: String? = "World"): People

    @GET(name = "people/{id}/")
    suspend fun testQueryName(@Path("id") peopleId: Int, @QueryName na : List<String?>?): People

    @Streaming
    @GET(name = "people/1/")
    suspend fun getPostsStreaming(): HttpStatement

    @GET(name = "people/{id}/")
    fun getPersonById2AsResponse(@Path("id") peopleId: Int): Response<People>

    @Headers(value = ["Content-Type: application/json"])

    @GET(name = "people/{id}/")
    suspend fun callPersonById2AsResponse(@Path("id") peopleId: Int): Call<List<People>>

    @GET()
    suspend fun getPersonByIdByUrl(@Url peopleId: String, @QueryMap name: Map<String,Int>?): People
}