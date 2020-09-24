package com.testing.dev.manig.metaprogramming

import java.lang.reflect.Type

/*
This class says on: How to work on java API with kotlin types.
 */

data class Transaction(val id: Int, var amount: Double, var description: String = "Default StringValue") {
    fun validate() {
        if (amount > 1000) {
            println("com.testing.dev.manig.metaprogramming.Transaction is too large ")
        }
    }
}

fun introspectInstance(obj: Any) {
    println("Class ${obj.javaClass.simpleName}")
    println("Properties--\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type-- ${it.type}")
    }
    println("Functions::\n")
    obj.javaClass.declaredMethods.forEach {
        println(it.name)
    }
}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main() {
    getType(Transaction::class.java) // here ".java" refers the type

   // introspectInstance(Transaction(3,  999.0, "A Simple Transaction"))

}