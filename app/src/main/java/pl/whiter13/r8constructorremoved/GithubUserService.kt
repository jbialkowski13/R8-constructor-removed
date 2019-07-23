package pl.whiter13.r8constructorremoved

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubUserService {

    @GET("/users/{username}")
    fun getUser(@Path("username") username: String): Single<UserResponse>
}