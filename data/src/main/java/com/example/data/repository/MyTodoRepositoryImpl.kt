package com.example.data.repository

import com.example.data.source.RetrofitApiService
import com.example.data.model.MyTodoResponse
import javax.inject.Singleton

@Singleton
class MyTodoRepositoryImpl (
    private val retrofitApiService: RetrofitApiService
): MyTodoRepository {
    override suspend fun getTodos(): List<MyTodoResponse> = retrofitApiService.getData()
}