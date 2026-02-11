package com.example.server.responses

import com.example.server.models.ProductItem

// Описание ответа ResponseProducts


data class ResponseProducts(
    val page: Int,
    val perPage: Int,
    val totalPages: Int,
    val totalItems: Int,
    val items: ProductItem
)
