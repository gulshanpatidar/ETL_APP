package com.example.etl_app.data.models

data class Address(
    val name: String = "",
    val phoneNumber: String = "",
    val houseNumber: String = "",
    val streetName: String = "",
    val city: String = "",
    val pinCode: Int = 0,
    val longitude: String = "",
    val latitude: String = ""
)