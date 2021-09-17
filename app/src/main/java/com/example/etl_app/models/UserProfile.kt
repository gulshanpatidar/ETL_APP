package com.example.etl_app.models

data class UserProfile(
    val firstName: String = "",
    val lastName: String = "",
    val phoneNumber: String = "",
    val emailAddress: String = "",
    val address: Address = Address(),
)
