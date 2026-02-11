package com.example.server.services

import com.example.server.requests.RequestOrder
import com.example.server.responses.ResponseOrder
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

// Описание роутов Order

interface OrderService {
    @POST("/collections/orders/records")
    suspend fun createOrder(
        @Body body: RequestOrder
    ): Response<ResponseOrder>
}
