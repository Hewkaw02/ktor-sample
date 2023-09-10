package com.hewdev.data.user

class UserDaoImpl : UserDaoInterface {
    override suspend fun allUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override suspend fun signInUser(username: String, password: String): User {
        TODO("Not yet implemented")
    }

    override suspend fun user(id: Int): User? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewUser(username: String, password: String, role: String, restaurantId: Int?): User? {
        TODO("Not yet implemented")
    }

    override suspend fun editUser(
        id: Int,
        username: String,
        password: String,
        role: String,
        restaurantId: Int?
    ): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUser(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}