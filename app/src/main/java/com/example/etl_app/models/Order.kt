package com.example.etl_app.models

data class Order(
    val orderId: String = "",
    val cart: Cart = Cart(),
    val address: Address = Address(),
    val orderDate: String = "",
    val orderStatus: OrderStatus = OrderStatus.ORDERED,
    val expectedDelivery: String = "",
    val payment: Payment = Payment(),
    val userId: String = ""
)
