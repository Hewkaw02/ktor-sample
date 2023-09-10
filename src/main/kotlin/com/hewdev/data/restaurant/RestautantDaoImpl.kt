package com.hewdev.data.restaurant

class RestautantDaoImpl : RestautantDaoInterface {
    override suspend fun allRestaurants(): List<Restaurant> {
        TODO("Not yet implemented")
    }

    override suspend fun restaurant(id: Int): Restaurant? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewRestaurant(name: String, address: String, subscriptionStatus: String): Restaurant? {
        TODO("Not yet implemented")
    }

    override suspend fun editRestaurant(id: Int, name: String, address: String, subscriptionStatus: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteRestaurant(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}