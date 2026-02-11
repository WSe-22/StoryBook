package com.example.server.responses

import com.example.server.models.User

// Описание ответа ResponseAuth

data class ResponseAuth(
    val record: User,
    val token: String
)
