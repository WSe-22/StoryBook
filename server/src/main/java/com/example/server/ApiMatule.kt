package com.example.server

import com.example.server.repositories.BuckerRepository
import com.example.server.repositories.OrderRepository
import com.example.server.repositories.ProjectRepository
import com.example.server.repositories.ShopRepository
import com.example.server.repositories.UserRepository
import com.example.server.services.BacketService
import com.example.server.services.OrderService
import com.example.server.services.ProjectService
import com.example.server.services.ShopService
import com.example.server.services.UserService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
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
    var apiUsers = retrofit.create<UserService>(UserRepository::class.java as Class<UserService?>)
    var apiShop = retrofit.create<ShopService>(ShopRepository::class.java as Class<ShopService?>)
    var apiOrder = retrofit.create<OrderService>(OrderRepository::class.java as Class<OrderService?>)
    var apiProject = retrofit.create<ProjectService>(ProjectRepository::class.java as Class<ProjectService?>)
    var apiBucket = retrofit.create<BacketService>(BuckerRepository::class.java as Class<BacketService?>)


}