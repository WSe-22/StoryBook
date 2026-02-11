package com.example.server.requests

data class RequestAuth(
    val identity: String, // email
    val password: String
)
