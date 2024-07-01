package com.enesigneci.playground.domain.repository

import com.enesigneci.playground.data.model.UserItem


interface GitHubRepository {
    suspend fun getUser(user: String): UserItem
}
