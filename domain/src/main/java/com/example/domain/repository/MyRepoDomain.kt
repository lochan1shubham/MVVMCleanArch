package com.example.domain.repository

import com.example.domain.model.MyTodoModel

interface MyRepoDomain {
    suspend fun getTodo(): List<MyTodoModel>
}