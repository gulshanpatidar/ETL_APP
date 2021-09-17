package com.example.etl_app.models

data class CartItem(
    val product: Product = Product(),
    val quantity: UByte = 0u //UByte in kotlin is 8-bit positive integer data type
)
