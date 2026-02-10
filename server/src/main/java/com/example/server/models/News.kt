package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.util.TableInfo

// Описание модели News
@Entity(tableName = "news")
data class News(

    @PrimaryKey(autoGenerate = true)
    val id: String,

    val newImage: String,
    val created: String,
    val updated: String,

    val collectionId: String,
    val collectionName: String
)