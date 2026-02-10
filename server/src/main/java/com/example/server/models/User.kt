package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.util.TableInfo

// Описание модели user
@Entity(tableName = "user")
private data class User(
    @PrimaryKey(autoGenerate = true)
    var id: String,
    var lastname: String,
    var secondname: String,
    var verified: Boolean,
    var datebirthday: String,
    var gender: String
)

// sql-подобные запросы (будут)
val getUserId = "SELECT * FROM "