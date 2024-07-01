package com.enesigneci.playground.di

import com.enesigneci.playground.data.repository.GitHubRepositoryImpl
import com.enesigneci.playground.data.repository.RepositoryImpl
import com.enesigneci.playground.domain.repository.GitHubRepository
import com.enesigneci.playground.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class GitHubRepositoryModule {
    @Binds
    @Singleton
    abstract fun bindRepository(
        repositoryImpl: GitHubRepositoryImpl
    ): GitHubRepository
}
