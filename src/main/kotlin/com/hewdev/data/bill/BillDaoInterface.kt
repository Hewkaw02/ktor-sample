package com.hewdev.data.bill

import java.math.BigDecimal
import java.time.LocalDate

interface BillDaoInterface {
    suspend fun allBills(): List<Bill>
    suspend fun bill(id: Int): Bill?
    suspend fun addNewBill(orderId: Int, tableId: Int, billAmount: BigDecimal, paymentStatus: String, billDate: LocalDate): Bill?
    suspend fun editBill(id: Int, orderId: Int, tableId: Int, billAmount: BigDecimal, paymentStatus: String, billDate: LocalDate): Boolean
    suspend fun deleteBill(id: Int): Boolean
}