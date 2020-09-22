package com.testing.dev.manig.classes

typealias Name = String
typealias EmailData = String
typealias Number = Int

data class Employee(val name: Name, val email: EmailData) {
    fun printNum(num: Number) {

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