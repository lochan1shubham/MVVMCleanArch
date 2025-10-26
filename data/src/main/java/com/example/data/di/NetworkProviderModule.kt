package com.example.data.di

import com.example.data.repository.MyTodoRepository
import com.example.data.repository.MyTodoRepositoryImpl
import com.example.data.source.RetrofitApiService
import com.example.data.source.RetrofitInit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkProviderModule {

    @Provides
    fun providesRetrofit(): RetrofitInit = RetrofitInit()

    @Provides
    @Singleton
    fun providesRetrofitApiService(
        retrofitInit: RetrofitInit
    ): RetrofitApiService {
       return retrofitInit.getRetrofitInit().create(RetrofitApiService::class.java)
    }

    @Provides
    fun providesMyTodoRepository(
        retrofitApiService: RetrofitApiService
    ) : MyTodoRepository {
        return MyTodoRepositoryImpl(retrofitApiService)
    }
}