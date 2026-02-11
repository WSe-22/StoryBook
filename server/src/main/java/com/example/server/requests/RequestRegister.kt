package com.example.server.requests

// Описание запроса RequestRegister


data class RequestRegister(
    val email: String,
    val password: String,
    val passwordConfirm: String
)