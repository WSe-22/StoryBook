package com.example.server.requests

data class RequestOrder(
    val user_id: String,
    val product_id: String,
    val count: Int,
)
