package com.example.data.di

import com.example.data.source.RetrofitApiService
import com.example.data.source.RetrofitInit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
abstract class NetworkProviderModule {

    @Provides
    @Singleton
    fun provideRetrofitApiService(
        retrofitInit: RetrofitInit
    ): RetrofitApiService = retrofitInit.getRetrofitInit().create(RetrofitApiService::class.java)
}