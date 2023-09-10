package com.hewdev.data.bill

import kotlinx.serialization.Serializable

@Serializable
data class Bill(
    val billId: Int,
    val orderId: Int,
    val tableId: Int,
    val billAmount: Int,
    val paymentStatus: String,
    val billDate: String
)