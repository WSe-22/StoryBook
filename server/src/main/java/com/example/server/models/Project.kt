package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Описание модели Project
@Entity(tableName = "project")
data class Project(

    @PrimaryKey(autoGenerate = true)
    val id: String,
    val title: String,
    val dateStart: String,
    val dateEnd: String,
)

