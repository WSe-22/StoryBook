package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Описание модели ProductItem
@Entity(tableName = "productItem")
data class ProductItem(

    @PrimaryKey(autoGenerate = true)
    val id: String,

    val title: String,
    val price: Int,
    val typeCloses: String,
    val type: String
)