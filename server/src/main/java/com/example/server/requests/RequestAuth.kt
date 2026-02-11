package com.example.server.requests

// Описание запроса RequestAuth

data class RequestAuth(
    val identity: String, // email
    val password: String
)
