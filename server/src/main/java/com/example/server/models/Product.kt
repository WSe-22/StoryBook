package com.example.server.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room

// Описание модели Product
@Entity(tableName = "products")
data class Product(

    @PrimaryKey(autoGenerate = true)
    val id: String,


    val title: String,
    val description: String,
    val price: Int,
    val typeCloses: String,
    val type: String,
    val approximateCost: String
)

//@Query("SELECT id FROM products WHERE id = :productId")
//public abstract fun findProductId(productId: Int)