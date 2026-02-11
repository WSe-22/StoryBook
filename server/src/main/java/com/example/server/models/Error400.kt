package com.example.server.models

data class Error400(
    val status: Int,
    val message: String,
    val data: Map<String, Any>? = null
)
