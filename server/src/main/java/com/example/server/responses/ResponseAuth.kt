package com.example.server.responses

import com.example.server.models.User

data class ResponseAuth(
    val record: User,
    val token: String
)
