package com.hewdev.data.bill

import java.math.BigDecimal
import java.time.LocalDate

class BillDaoImpl : BillDaoInterface {
    override suspend fun allBills(): List<Bill> {
        TODO("Not yet implemented")
    }

    override suspend fun bill(id: Int): Bill? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewBill(
        orderId: Int,
        tableId: Int,
        billAmount: BigDecimal,
        paymentStatus: String,
        billDate: LocalDate
    ): Bill? {
        TODO("Not yet implemented")
    }

    override suspend fun editBill(
        id: Int,
        orderId: Int,
        tableId: Int,
        billAmount: BigDecimal,
        paymentStatus: String,
        billDate: LocalDate
    ): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteBill(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}