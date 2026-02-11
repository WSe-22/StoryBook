package com.example.server.models

// Описание модели News
data class News(
    val collectionId: String,
    val collectionName: String,
    val newsImage: String,
    val created: String,
    val updated: String,
)