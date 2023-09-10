package com.hewdev.domain.usecase

import com.hewdev.data.user.User
import com.hewdev.data.user.UserDaoInterface
import com.hewdev.domain.UserResponse
import com.hewdev.util.ServiceResult
import java.time.LocalDateTime

class InsertNewUser (
//    private val validateUserEmail: ValidateUserEmail,
    private val userDao: UserDaoInterface
) {

    suspend operator fun invoke(user: User): UserResponse {

        return when (val result = validateUserEmail(user)) {
            is ServiceResult.Success -> {
                val dbResult = userDao.addNewUser()
                )
                when (dbResult) {
                    is ServiceResult.Success -> UserResponse(dbResult.data, emptyList())
                    is ServiceResult.Error -> UserResponse(user, listOf(ResponseErrors(dbResult.error, dbResult.error.message)))
                }

            }
            is ServiceResult.Error -> UserResponse(user, listOf(ResponseErrors(result.error, result.error.message)))
        }
    }
}