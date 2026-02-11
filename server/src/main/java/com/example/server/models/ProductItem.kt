package com.example.server.models

// Описание модели ProductItem

data class ProductItem(
    val id: String,
    val title: String,
    val price: Int,
    val typeCloses: String,
    val type: String
)