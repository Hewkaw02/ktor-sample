package com.restaurant.data

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.date
import org.jetbrains.exposed.sql.javatime.datetime

object Restaurants : Table() {
    val restaurantId = integer("restaurant_id").autoIncrement()
    val name = varchar("name", 100)
    val address = varchar("address", 255)
    val subscriptionStatus = varchar("subscription_status", 50)

    override val primaryKey = PrimaryKey(restaurantId)
}

object Menus : Table() {
    val menuId = integer("menu_id").autoIncrement()
    val restaurantId = integer("restaurant_id")
    val itemName = varchar("item_name", 100)
    val itemDescription = varchar("item_description", 255).nullable()
    val price = decimal("price", 10, 2)
    val availableQuantity = integer("available_quantity")

    override val primaryKey = PrimaryKey(menuId)
}

object Tables : Table() {
    val tableId = integer("table_id").autoIncrement()
    val restaurantId = integer("restaurant_id")
    val tableNumber = integer("table_number")
    val capacity = integer("capacity")
    val isAvailable = bool("is_available")

    override val primaryKey = PrimaryKey(tableId)
}

object Users : Table() {
    val userId = integer("user_id").autoIncrement()
    val username = varchar("username", 50)
    val password = varchar("password", 100)
    val role = varchar("role", 50)
    val restaurantId = integer("restaurant_id").nullable()

    override val primaryKey = PrimaryKey(userId)
}

object Orders : Table() {
    val orderId = integer("order_id").autoIncrement()
    val tableId = integer("table_id")
    val userId = integer("user_id")
    val orderTime = datetime("order_time")
    val status = varchar("status", 50)

    override val primaryKey = PrimaryKey(orderId)
}

object OrderItems : Table() {
    val orderItemId = integer("order_item_id").autoIncrement()
    val orderId = integer("order_id")
    val menuId = integer("menu_id")
    val quantity = integer("quantity")
    val status = varchar("status", 50)

    override val primaryKey = PrimaryKey(orderItemId)
}

object Bills : Table() {
    val billId = integer("bill_id").autoIncrement()
    val orderId = integer("order_id")
    val tableId = integer("table_id")
    val billAmount = decimal("bill_amount", 10, 2)
    val paymentStatus = varchar("payment_status", 50)
    val billDate = date("bill_date")

    override val primaryKey = PrimaryKey(billId)
}
