package com.hewdev.data.orderitem

import com.hewdev.data.order.Order
import java.time.LocalDateTime

interface OrderItemDaoInterface {
    suspend fun allOrders(): List<Order>
    suspend fun order(id: Int): Order?
    suspend fun addNewOrder(tableId: Int, userId: Int, orderTime: LocalDateTime, status: String): Order?
    suspend fun editOrder(id: Int, tableId: Int, userId: Int, orderTime: LocalDateTime, status: String): Boolean
    suspend fun deleteOrder(id: Int): Boolean

}