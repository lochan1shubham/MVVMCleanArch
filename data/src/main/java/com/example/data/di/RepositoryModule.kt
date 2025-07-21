package com.example.data.di

import com.example.data.repository.MyTodoRepository
import com.example.data.repository.MyTodoRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // Or another appropriate component
abstract class RepositoryModule {

    @Binds
    @Singleton // Optional: if you want a single instance throughout the app
    abstract fun bindMyTodoRepository(
        myTodoRepositoryImpl: MyTodoRepositoryImpl
    ): MyTodoRepository


}