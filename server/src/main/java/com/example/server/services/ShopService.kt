package com.example.server.services

import com.example.server.models.Product
import com.example.server.requests.ProductId
import com.example.server.responses.ResponseProducts
import com.example.server.responses.ResponsesNews
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

// Описание роутов Shop

interface ShopService {
    @GET("/collections/news/records")
    suspend fun getNewsAndSale(): Response<ResponsesNews>

    @GET("/collections/products/records")
    suspend fun getProductsWithFilter(): Response<ResponseProducts>

    @GET("/collections/products/records/{id_product}")
    suspend fun getDescriptionProduct(
        @Body body: ProductId
    ): Response<Product>
}