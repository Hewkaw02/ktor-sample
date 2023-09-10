package com.hewdev.data.order

import com.hewdev.data.orderitem.OrderItem

class OrderDaoImpl : OrderDaoInterface {
    override suspend fun allOrderItems(): List<OrderItem> {
        TODO("Not yet implemented")
    }

    override suspend fun orderItem(id: Int): OrderItem? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewOrderItem(orderId: Int, menuId: Int, quantity: Int, status: String): OrderItem? {
        TODO("Not yet implemented")
    }

    override suspend fun editOrderItem(id: Int, orderId: Int, menuId: Int, quantity: Int, status: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteOrderItem(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}