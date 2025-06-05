package com.example.data.source

import com.example.data.model.MyTodoResponse
import retrofit2.http.GET

interface RetrofitApiService {
    @GET("todos")
    suspend fun getData(): List<MyTodoResponse>
}