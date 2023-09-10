package com.hewdev.data.restaurant

import kotlinx.serialization.Serializable

@Serializable
data class Restaurant(
    val restaurantId: Int,
    val name: String,
    val address: String,
    val subscriptionStatus: String
)