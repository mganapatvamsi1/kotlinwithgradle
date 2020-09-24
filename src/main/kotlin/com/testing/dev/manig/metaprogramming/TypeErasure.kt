package com.testing.dev.manig.metaprogramming


fun <T> printList(list: List<T>) {
//    when (list) {
//        is List<String> -> println("list of strings")
//        is List<Int> -> println("This is a list of integers")
//    }
    if (list is List<*>) {
        println("this is a list")
    }
}

fun <T> newPrintedList(obj: T) {
    when (obj) {
        is String -> println("This is a string")
        is Int -> println("this is an int")
    }
}

inline fun <reified T> erased(list: List<T>) {
    if (list is T) {

    }
}

inline fun <reified T> typeInfo() {
    println(T::class)
}


fun main() {
    val listOfStrings = listOf("One", "Two", "Three", "Four", "Five")
    val listOfNumbers = listOf(1, 2, 3, 4, 5)
}

/*
Inline function helps in optimization.
If we've an inline function with typeParameter: we can provide reified generic support
so that we can get some information of that type at runtime.
 */