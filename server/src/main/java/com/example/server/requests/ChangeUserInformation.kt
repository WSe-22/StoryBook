package com.example.server.requests

// Описание запроса ChangeUserInformation

data class ChangeUserInformation(
    val email: String,
    val emailVisibility: Boolean,
    val firstname: String,
    val lastname: String,
    val secondname: String,
    val datebirthday: String,
    val gender: String,
)