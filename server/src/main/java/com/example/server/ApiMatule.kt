package com.example.server

import com.example.server.repositories.UserRepository
import com.example.server.services.UserService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object ApiMatule {
    private const val BASE_URL = "https://api.matule.ru/api"


    val client: OkHttpClient = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.MILLISECONDS)
        .readTimeout(30, TimeUnit.MILLISECONDS)
        .writeTimeout(30, TimeUnit.MILLISECONDS)
        .build()

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

//    var api: = retrofit.create<MyApi?>(::class.java)
    var api = retrofit.create<UserService>(UserRepository::class.java as Class<UserService?>)

}