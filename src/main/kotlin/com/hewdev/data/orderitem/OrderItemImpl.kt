package com.hewdev.data.orderitem

import com.hewdev.data.order.Order
import java.time.LocalDateTime

class OrderItemImpl : OrderItemDaoInterface {
    override suspend fun allOrders(): List<Order> {
        TODO("Not yet implemented")
    }

    override suspend fun order(id: Int): Order? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewOrder(tableId: Int, userId: Int, orderTime: LocalDateTime, status: String): Order? {
        TODO("Not yet implemented")
    }

    override suspend fun editOrder(
        id: Int,
        tableId: Int,
        userId: Int,
        orderTime: LocalDateTime,
        status: String
    ): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteOrder(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}