package com.example.domain.di

import com.example.data.repository.MyTodoRepository
import com.example.domain.repository.MyRepoDomainImpl
import com.example.domain.usecase.MyTodoMapperUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class TodoDomainProviders {

    @Provides
    fun providesMyRepoDomainImpl(
        myTodoRepository: MyTodoRepository,
        myTodoMapperUseCase: MyTodoMapperUseCase
    ) = MyRepoDomainImpl (myTodoRepository, myTodoMapperUseCase)

}