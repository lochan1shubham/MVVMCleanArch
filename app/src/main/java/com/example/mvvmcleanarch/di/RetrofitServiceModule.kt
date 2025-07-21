package com.example.mvvmcleanarch.di

import com.example.domain.repository.MyRepoDomain
import com.example.domain.repository.MyRepoDomainImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RetrofitServiceModule {
    @Binds
    abstract  fun bindMyRepoDomain(
        myRepo: MyRepoDomainImpl
    ): MyRepoDomain

}