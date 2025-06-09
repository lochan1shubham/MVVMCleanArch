package com.example.domain.repository

import com.example.data.repository.MyTodoRepository
import com.example.domain.model.MyTodoModel
import com.example.domain.usecase.MyTodoMapperUseCase
import javax.inject.Inject

class MyRepoDomainImpl @Inject constructor(
    private val myTodoRepository: MyTodoRepository,
    private val myTodoMapperUseCase : MyTodoMapperUseCase
) : MyRepoDomain {
    override suspend fun getTodo(): List<MyTodoModel> =
        myTodoMapperUseCase.getTodos(myTodoRepository.getTodos())
}