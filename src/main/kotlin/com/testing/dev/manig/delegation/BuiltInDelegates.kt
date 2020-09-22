package com.testing.dev.manig.delegation

import kotlin.properties.Delegates

typealias Name = String
typealias EmailData = String

data class Employee1(val name: Name, val email: EmailData) {
    var department: String by Delegates.observable("", 
        { property, oldValue, newValue ->
            println("Property ${property.name} has changed from $oldValue to $newValue.")
        

    })
}

fun main() {
    val employeeWithDefaultDelegation = Employee1("malhotra", "ganapathiraju.vamsi@gmail.com")
    employeeWithDefaultDelegation.department = "IT Services"

}