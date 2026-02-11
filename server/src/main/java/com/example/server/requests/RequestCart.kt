package com.example.server.requests

// Описание запроса RequestCart

data class RequestCart(
    val user_id: String,
    val product_id: String,
    val count: Int
)
