package com.example.etl_app.data.models

data class User(
    val userId: String = "",
    val profile: UserProfile = UserProfile(),
    val cart: Cart = Cart(),
    val orders: List<Order> = listOf()
)
