package com.hewdev.data.user

interface UserDaoInterface {
    suspend fun allUsers(): List<User>
    suspend fun signInUser(username: String, password: String):User
    suspend fun user(id: Int): User?
    suspend fun addNewUser(username: String, password: String, role: String, restaurantId: Int?): User?
    suspend fun editUser(id: Int, username: String, password: String, role: String, restaurantId: Int?): Boolean
    suspend fun deleteUser(id: Int): Boolean
}