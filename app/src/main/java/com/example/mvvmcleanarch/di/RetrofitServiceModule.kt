package com.example.mvvmcleanarch.di

import androidx.lifecycle.ViewModel
import com.example.domain.repository.MyRepoDomain
import com.example.domain.repository.MyRepoDomainImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RetrofitServiceModule {

    @Binds
    abstract  fun bindMyRepoDomain(
        myRepo: MyRepoDomainImpl
    ): MyRepoDomain

}