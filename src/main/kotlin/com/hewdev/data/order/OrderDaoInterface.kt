package com.hewdev.data.order

import com.hewdev.data.orderitem.OrderItem

interface OrderDaoInterface {

    suspend fun allOrderItems(): List<OrderItem>
    suspend fun orderItem(id: Int): OrderItem?
    suspend fun addNewOrderItem(orderId: Int, menuId: Int, quantity: Int, status: String): OrderItem?
    suspend fun editOrderItem(id: Int, orderId: Int, menuId: Int, quantity: Int, status: String): Boolean
    suspend fun deleteOrderItem(id: Int): Boolean

}