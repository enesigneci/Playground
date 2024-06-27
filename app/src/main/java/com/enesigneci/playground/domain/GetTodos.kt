package com.enesigneci.playground.domain

import com.enesigneci.playground.data.model.TodoItem
import com.enesigneci.playground.domain.repository.Repository
import javax.inject.Inject

class GetTodos @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(): List<TodoItem> {
        return repository.getTodos()
    }
}