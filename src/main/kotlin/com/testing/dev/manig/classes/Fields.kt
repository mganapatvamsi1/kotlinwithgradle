package com.testing.dev.manig.classes

import com.testing.dev.manig.generics.Entity

class Customer1 {
    var lastPurchasedAmount: Double = 0.0
    get() = field
    set(value) {
        if (value > 50) {
            field = value
        }
    }
}

fun main() {
    val customer1 =  Customer1()
    println(customer1.lastPurchasedAmount)
    customer1.lastPurchasedAmount = 150.0
    println(customer1.lastPurchasedAmount)
    customer1.lastPurchasedAmount = 20.0
    println(customer1.lastPurchasedAmount)
}