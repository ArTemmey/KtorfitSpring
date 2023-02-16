<h1>KtorfitSpring</h1>

KtorfitSpring works like the original [Ktorfit](https://github.com/Foso/Ktorfit), except that, under the jvm platform, it converts its annotations to the corresponding annotations of the [Spring Boot framework](https://spring.io/). Due to this, KtorfitSpring can be used to integrate the backend and the client written in Kotlin.

## Installation

At the moment KtorfitSpring is not published in any maven repository, so you need to clone this repository and run `publishToMavenLocal` command on each module.

## Usage

Create an interface in a separate module or library:

```kotlin
interface ExampleApi {

    @GET("users")
    suspend fun getUsers(@Query("name") name: String): List<User>
    
    @POST("users")
    suspend fun postUser(@Body body: UserPostBody): User
}
```

On the client, use this interface as usual:

```kotlin
val ktorfit = Ktorfit.Builder().baseUrl("https://example.com/").build()
val exampleApi = ktorfit.create<ExampleApi>()
val users = exampleApi.getUsers(name = "John Doe")
```

And on the backend, implement this interface to your [RestController](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestController.html):

```kotlin
@RestController
class ExampleController : ExampleApi {

    override suspend fun getUsers(name: String): List<User> {
        return listOf()
    }
    
    override suspend fun postUser(body: UserPostBody): User {
        return User()
    }
}
```
Note that you do not need to specify any annotations on your controller methods.

Also don't forget to implement coroutines to your backend project:

```gradle
dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutinesVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:${coroutinesVersion}")
}
```

## Annotation mapping
KtorfitSpring transforms annotations in the following way:
| Ktorfit annotation | Spring Boot annotation |
|--------------------|------------------------|
| GET                | GetMapping             |
| POST               | PostMapping            |
| PUT                | PutMapping             |
| PATCH              | PatchMapping           |
| DELETE             | DeleteMapping          |
| Body               | RequestBody            |
| Path               | PathVariable           |
| Query              | RequestParam           |
