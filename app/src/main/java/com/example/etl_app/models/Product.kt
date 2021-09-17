package com.example.etl_app.models

data class Product(
    val productId: String = "",
    val productName: String = "",
    val photos: List<String> = listOf(),
    val price: Double = 0.0,
    val description: String = "",
    val reviews: List<Review> = listOf(),
    val rating: Float = 0.0f,
    val productCategory: ProductCategory = ProductCategory.GENERAL_ITEMS,
)
