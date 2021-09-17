package com.example.etl_app.models

data class Shop(
    val shopId: String = "",
    val shopName: String = "",
    val description: String = "",
    val shopPhotos: List<String> = listOf(),
    val address: Address = Address(),
    val ownerId: String = "",
    val products: List<String> = listOf(),
    val category: ProductCategory = ProductCategory.GENERAL_ITEMS
)
