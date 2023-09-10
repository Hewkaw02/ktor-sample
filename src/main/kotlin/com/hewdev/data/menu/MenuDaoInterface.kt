package com.hewdev.data.menu

import java.math.BigDecimal

interface MenuDaoInterface {
    suspend fun allMenus(): List<Menu>
    suspend fun menu(id: Int): Menu?
    suspend fun addNewMenu(restaurantId: Int, itemName: String, itemDescription: String?, price: BigDecimal, availableQuantity: Int): Menu?
    suspend fun editMenu(id: Int, restaurantId: Int, itemName: String, itemDescription: String?, price: BigDecimal, availableQuantity: Int): Boolean
    suspend fun deleteMenu(id: Int): Boolean

}