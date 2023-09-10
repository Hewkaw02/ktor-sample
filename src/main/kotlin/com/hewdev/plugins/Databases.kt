package com.hewdev.plugins

import com.hewdev.data.*
import kotlinx.coroutines.Dispatchers
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.experimental.newSuspendedTransaction
import org.jetbrains.exposed.sql.transactions.transaction


object DatabaseFactory {
    fun init() {
        val driverClassName = "org.sqlite.JDBC"
        val jdbcURL = "jdbc:sqlite:/Users/hewkaw/Documents/RestaurantsDB"
        var database = Database.connect( jdbcURL , driverClassName )
        transaction {
            SchemaUtils.create(Users)
            SchemaUtils.create(Menus)
            SchemaUtils.create(Tables)
            SchemaUtils.create(Orders)
            SchemaUtils.create(OrderItems)
            SchemaUtils.create(Bills)
        }
    }

    suspend fun <T> dbQuery(block: suspend () -> T): T =
        newSuspendedTransaction(Dispatchers.IO) { block() }
}