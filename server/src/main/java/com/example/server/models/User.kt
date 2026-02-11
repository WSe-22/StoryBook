package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Описание модели user
data class User(
    val collectionId: String,
    val collectionName: String,
    val created: String,
    val emailVisibility: Boolean,
    val firstname: String,
    var id: String,
    var lastname: String,
    var secondname: String,
    val updated: String,
    var verified: Boolean,
    var datebirthday: String,
    var gender: String
)