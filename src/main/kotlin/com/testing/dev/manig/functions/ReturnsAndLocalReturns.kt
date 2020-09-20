package com.testing.dev.manig.functions


 inline fun <T> Iterable<T>.myForEach(action: (T) -> Unit): Unit {
    for (element in this) action(element)
}

fun containingFunction() {
    val numbers = 1..100
    numbers.myForEach {
        if (it % 5 == 0) {
            return@myForEach
        }
//             println("test")
    }
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunction()
}