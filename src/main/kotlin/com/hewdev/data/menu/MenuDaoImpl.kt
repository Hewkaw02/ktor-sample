package com.hewdev.data.menu

import java.math.BigDecimal

class MenuDaoImpl : MenuDaoInterface {
    override suspend fun allMenus(): List<Menu> {
        TODO("Not yet implemented")
    }

    override suspend fun menu(id: Int): Menu? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewMenu(
        restaurantId: Int,
        itemName: String,
        itemDescription: String?,
        price: BigDecimal,
        availableQuantity: Int
    ): Menu? {
        TODO("Not yet implemented")
    }

    override suspend fun editMenu(
        id: Int,
        restaurantId: Int,
        itemName: String,
        itemDescription: String?,
        price: BigDecimal,
        availableQuantity: Int
    ): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteMenu(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}