package com.enesigneci.playground.domain.repository

import com.enesigneci.playground.data.model.TodoItem


interface Repository {
    suspend fun getTodos(): List<TodoItem>
}
