package com.hewdev.data.order

import kotlinx.serialization.Serializable

@Serializable
data class Order(
    val orderId: Int,
    val tableId: Int,
    val userId: Int,
    val orderTime: String,
    val status: String
)