package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.util.TableInfo

// Описание модели News
data class News(
    val collectionId: String,
    val collectionName: String,
    val newsImage: String,
    val created: String,
    val updated: String,
)