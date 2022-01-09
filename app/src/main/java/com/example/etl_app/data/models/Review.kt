package com.example.etl_app.data.models

data class Review(
    val name: String = "",
    val title: String = "",
    val description: String = "",
    val photos: List<String> = listOf(),
    val rating: Float = 0.0F,
    val productId: String = "",
)
