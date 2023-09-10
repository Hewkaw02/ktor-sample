package com.hewdev.data.menu

import kotlinx.serialization.Serializable


@Serializable
data class Menu(
    val menuId: Int,
    val restaurantId: Int,
    val itemName: String,
    val itemDescription: String?,
    val price: Int,
    val availableQuantity: Int
)