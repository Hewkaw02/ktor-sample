package com.hewdev.data.restaurant

interface RestautantDaoInterface {
    suspend fun allRestaurants(): List<Restaurant>
    suspend fun restaurant(id: Int): Restaurant?
    suspend fun addNewRestaurant(name: String, address: String, subscriptionStatus: String): Restaurant?
    suspend fun editRestaurant(id: Int, name: String, address: String, subscriptionStatus: String): Boolean
    suspend fun deleteRestaurant(id: Int): Boolean
}