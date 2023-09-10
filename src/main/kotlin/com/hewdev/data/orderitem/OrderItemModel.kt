package com.hewdev.data.orderitem

import kotlinx.serialization.Serializable

@Serializable
data class OrderItem(
    val orderItemId: Int,
    val orderId: Int,
    val menuId: Int,
    val quantity: Int,
    val status: String
)