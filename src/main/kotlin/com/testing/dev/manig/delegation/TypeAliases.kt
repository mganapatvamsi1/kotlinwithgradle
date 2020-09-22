package com.testing.dev.manig.delegation

typealias Name1 = String
typealias EmailData1 = String
typealias Number1 = Int

data class Employee(val name: Name1, val email: EmailData1) {
    fun printNum(num: Number1) {

    }

}
//data class Employee(val name: String, val email: String) {
//    fun printNum(num: Int) {
//
//    }
//
//}

fun main() {
    val employee = Employee("rajAryan", "abc@pqr.com")
    employee.printNum(43)
}

// lateinit --> late initialization after the constructor is called (only on var)