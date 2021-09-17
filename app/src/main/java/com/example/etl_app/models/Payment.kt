package com.example.etl_app.models

data class Payment(
    val transactionId: String = "",
    val customerName: String = "",
    val paymentMethod: PaymentMode = PaymentMode.UPI,
    val paymentDate: String = "",
    val invoice: String = "",
    val orderId: String = "",
)
