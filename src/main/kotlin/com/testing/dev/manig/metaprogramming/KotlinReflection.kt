package com.testing.dev.manig.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main() {
//    println(Transaction::class)
//    val classpath = Transaction::class
//    classpath.memberProperties.forEach {
//        println("Property ${it.name} of type ${it.returnType}.")
//    }
//    classpath.constructors.forEach {
//        println("Constructor ${it.name} -- ${it.parameters}.")
//    }
//    getKotlinType(Transaction::class)

    val constructor = ::Transaction
//    println(constructor)
//    val transaction = constructor.call(1, 2000, "Sample Text Data Prac Only")
//    val transaction = constructor.call(1, 2000) // this would throw an IllegalArgumentException
//    val transaction = constructor.callBy(mapOf(constructor.parameters[0] to 1, constructor.parameters[1] to  2000))

    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }
    val transaction = constructor.callBy(
        mapOf(
            idParam to 1,
            amountParam to 2000
        )
    )

    val newTransaction = Transaction(11, 220.0, "New Description")
    val nameProperty = Transaction::class.memberProperties.find {
        it.name == "description new one" }
    println(nameProperty?.get(newTransaction))
//    println(transaction.amount)
//    println(transaction.id)
//    println(transaction.description)
}

// JVM doesnot maintain information about the type parameter used in a generic class.