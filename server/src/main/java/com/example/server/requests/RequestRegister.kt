package com.example.server.requests

data class RequestRegister(
    val email: String,
    val password: String,
    val passwordConfirm: String
)