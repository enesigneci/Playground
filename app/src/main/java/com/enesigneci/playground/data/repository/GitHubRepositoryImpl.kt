package com.enesigneci.playground.data.repository

import com.enesigneci.playground.data.api.ApiService
import com.enesigneci.playground.data.api.GitHubApiService
import com.enesigneci.playground.data.model.TodoItem
import com.enesigneci.playground.data.model.UserItem
import com.enesigneci.playground.domain.repository.GitHubRepository
import com.enesigneci.playground.domain.repository.Repository
import javax.inject.Inject

class GitHubRepositoryImpl @Inject constructor(private val gitHubApiService: GitHubApiService) : GitHubRepository {
    override suspend fun getUser(user: String): UserItem {
        return gitHubApiService.getUser(user)
    }
}