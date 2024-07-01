package com.enesigneci.playground.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesigneci.playground.data.model.TodoItem
import com.enesigneci.playground.data.model.UserItem
import com.enesigneci.playground.domain.GetGitHubUser
import com.enesigneci.playground.domain.GetTodos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getTodos: GetTodos,
    private val getGitHubUser: GetGitHubUser,
) : ViewModel() {

    private val _data = MutableStateFlow<List<TodoItem>>(emptyList())
    val data: StateFlow<List<TodoItem>> = _data


    private val _githubUrl = MutableStateFlow("")
    val githubUrl: StateFlow<String> = _githubUrl

    init {
        fetchData()
    }

    private fun fetchData() {
        /*viewModelScope.launch {
            try {
                val dataList = getTodos()
                _data.value = dataList
            } catch (e: Exception) {
                // Handle the error appropriately
            }
        }*/
        viewModelScope.launch {
            try {
                val githubUrl = getGitHubUser("enesigneci").url
                _githubUrl.value = githubUrl
            } catch (e: Exception) {
                _githubUrl.value = e.message.toString()
            }
        }
    }
}