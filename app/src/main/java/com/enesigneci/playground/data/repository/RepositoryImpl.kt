package com.enesigneci.playground.data.repository

import com.enesigneci.playground.data.api.ApiService
import com.enesigneci.playground.data.model.TodoItem
import com.enesigneci.playground.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: ApiService) : Repository {
    override suspend fun getTodos(): List<TodoItem> {
        return apiService.getTodos()
    }
}