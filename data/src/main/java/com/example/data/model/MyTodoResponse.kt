package com.example.data.model

import com.google.gson.annotations.SerializedName


data class MyTodoResponse(
    @SerializedName("userId") val userId: Int,
    @SerializedName("title") var title: String,
    @SerializedName("completed") val completed: Boolean,
    @SerializedName("id") val id: Int
)
