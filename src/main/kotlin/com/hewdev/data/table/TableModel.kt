package com.hewdev.data.table

import kotlinx.serialization.Serializable

@Serializable
data class Table(
    val tableId: Int,
    val restaurantId: Int,
    val tableNumber: Int,
    val capacity: Int,
    val isAvailable: Boolean
)