package com.example.data.repository

import com.example.data.model.MyTodoResponse

interface MyTodoRepository {
    suspend fun getTodos(): List<MyTodoResponse>
}