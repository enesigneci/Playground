package com.enesigneci.playground.data.model


import com.google.gson.annotations.SerializedName

data class TodoItem(
    @SerializedName("completed")
    val completed: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
)