package com.testing.dev.manig.classes

interface Repository1 {
    fun getAll(): List<Customer1>
}

class Customer1Controller() {
//    var repository1: Repository1? = null

//    init {
//        repository1
//    }
    private lateinit var repository1: Repository1

    fun index(): String {
//        return repository1?.getAll().toString()
        return repository1.getAll().toString()
    }
}

fun main() {
    val customerCustomer1 = Customer1Controller()
    customerCustomer1.index()
}