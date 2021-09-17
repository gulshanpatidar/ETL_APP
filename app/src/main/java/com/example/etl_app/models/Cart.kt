package com.example.etl_app.models

data class Cart(
    val cartItems: List<CartItem> = listOf(),
    val price: Double = 0.0
)
