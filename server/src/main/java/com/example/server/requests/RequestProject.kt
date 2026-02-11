package com.example.server.requests

// Описание запроса RequestProject

data class RequestProject(
    val title: String,
    val typeProject: String,
    val user_id: String,
    val dateStart: String,
    val dateEnd: String,
    val gender: String,
    val description_source: String,
    val category: String,
    val image: Map<Any, Any>? = null
)
