package com.enesigneci.playground.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enesigneci.playground.data.model.TodoItem
import com.enesigneci.playground.domain.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _data = MutableStateFlow<List<TodoItem>>(emptyList())
    val data: StateFlow<List<TodoItem>> = _data

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            try {
                val dataList = repository.getTodos()
                _data.value = dataList
            } catch (e: Exception) {
                // Handle the error appropriately
            }
        }
    }
}