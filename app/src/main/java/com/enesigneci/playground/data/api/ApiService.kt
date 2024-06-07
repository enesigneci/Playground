package com.enesigneci.playground.data.api

import com.enesigneci.playground.data.model.TodoItem
import retrofit2.http.GET

interface ApiService {
    @GET("todos")
    suspend fun getTodos(): List<TodoItem>
}