package com.example.data.repository

import com.example.data.source.RetrofitApiService
import com.example.data.model.MyTodoResponse

class MyTodoRepositoryImpl (
    val apiInterface: RetrofitApiService
): MyTodoRepository {
    override suspend fun getTodos(): List<MyTodoResponse> = apiInterface.getData()
}