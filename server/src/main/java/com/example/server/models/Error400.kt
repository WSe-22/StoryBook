package com.example.server.models

// Описание модели Error400

data class Error400(
    val status: Int,
    val message: String,
    val data: Map<String, Any>? = null
)
