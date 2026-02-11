package com.example.server.models

// Описание модели UsersAuth

data class UsersAuth(
    val page: Int,
    val perPage: Int,
    val totalPages: Int,
    val totalItems: Int,
    val items: UserAuth
)
