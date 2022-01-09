package com.example.etl_app.data.models

data class Cart(
    val cartItems: List<CartItem> = listOf(),
    val price: Double = 0.0
)
