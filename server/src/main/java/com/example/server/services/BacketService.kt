package com.example.server.services

import com.example.server.requests.ChangeBuckerInformation
import com.example.server.requests.RequestCart
import com.example.server.responses.ResponseCart
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.PATCH
import retrofit2.http.POST

// Описание роутов Backet

interface BacketService {
    @POST("/collections/cart/records")
    suspend fun createBucket(
        @Body body: RequestCart
    ): Response<ResponseCart>

    @PATCH("/collections/cart/records/{id_bucket}")
    suspend fun changeBucket(
        @Body body: ChangeBuckerInformation
    ): Response<ResponseCart>
}