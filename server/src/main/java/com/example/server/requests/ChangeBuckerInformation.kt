package com.example.server.requests

// Описание запроса ChangeBuckerInformation

data class ChangeBuckerInformation(
    val user_id: String,
    val product_id: String,
    val count: Int,
)
