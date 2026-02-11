package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Описание модели Project
data class Project(
    val id: String,
    val collectionId: String,
    val collectionName: String,
    val created: String,
    val updated: String,
    val title: String,
    val dateStart: String,
    val dateEnd: String,
    val gender: String,
    val description_source: String,
    val category: String,
    val image: String,
    val user_id: String,
)

