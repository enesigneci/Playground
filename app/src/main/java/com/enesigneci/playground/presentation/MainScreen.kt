package com.enesigneci.playground.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.enesigneci.playground.presentation.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
    val data by viewModel.data.collectAsState()
    val githubUrl by viewModel.githubUrl.collectAsState()
    Column {
        Text(text = "GitHub User URL: $githubUrl")
        LazyColumn {
            items(data) {
                Text(text = it.title)
            }
        }
    }
}