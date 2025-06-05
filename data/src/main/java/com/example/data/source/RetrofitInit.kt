package com.example.data.source

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Singleton

const val baseUrl = "https://jsonplaceholder.typicode.com/"

@Singleton
class  RetrofitInit @Inject constructor(){
        lateinit var retrofit: Retrofit

        fun getRetrofitInit() : Retrofit {
            if (true) {
                retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}