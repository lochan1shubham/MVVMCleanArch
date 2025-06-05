package com.example.domain.repository

import com.example.data.source.RetrofitApiService
import com.example.domain.model.MyTodoModel
import com.example.domain.usecase.MyTodoMapperUseCase
import javax.inject.Inject

class MyRepoDomainImpl @Inject constructor(
    private val retrofitApiService: RetrofitApiService,
    private val myTodoMapperUseCase : MyTodoMapperUseCase
) : MyRepoDomain {
    override suspend fun getTodo(): List<MyTodoModel> =
        myTodoMapperUseCase.getTodos(retrofitApiService.getData())
}