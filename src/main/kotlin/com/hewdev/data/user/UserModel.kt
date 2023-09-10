package com.hewdev.data.user

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val userId: Int,
    val username: String,
    val password: String,
    val role: String,
    val restaurantId: Int?
)

@Serializable
data class UserLogin(
    val username: String,
    val password: String
)