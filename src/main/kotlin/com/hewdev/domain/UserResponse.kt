package com.hewdev.domain

import com.hewdev.data.user.User
import com.hewdev.util.ErrorCode

@kotlinx.serialization.Serializable
data class UserResponse(
    val user: User,
    val errors: List<ResponseErrors> = emptyList()
)

@kotlinx.serialization.Serializable
data class ResponseErrors(val code: ErrorCode, val message: String)
