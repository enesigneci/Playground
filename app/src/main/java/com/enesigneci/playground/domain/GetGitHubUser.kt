package com.enesigneci.playground.domain

import com.enesigneci.playground.data.model.TodoItem
import com.enesigneci.playground.data.model.UserItem
import com.enesigneci.playground.domain.repository.GitHubRepository
import com.enesigneci.playground.domain.repository.Repository
import javax.inject.Inject

class GetGitHubUser @Inject constructor(
    private val gitHubRepository: GitHubRepository
) {
    suspend operator fun invoke(user: String): UserItem {
        return gitHubRepository.getUser(user)
    }
}