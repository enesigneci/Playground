package com.enesigneci.playground.data.api

import com.enesigneci.playground.data.model.UserItem
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubApiService {
    @GET("users/{user}")
    suspend fun getUser(@Path("user") user: String): UserItem
}