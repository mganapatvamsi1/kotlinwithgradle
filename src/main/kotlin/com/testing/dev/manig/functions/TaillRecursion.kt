package com.testing.dev.manig.functions

fun factorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number * factorial(number - 1)
    }
}

tailrec fun factorialTailRecursive(number: Int, accumulator: Int = 1): Int {
    return when (number) {
        0 -> accumulator
        else -> factorialTailRecursive(number - 1, accumulator * number)
    }
}

fun main(args: Array<String>) {
    println(factorial(5))
    println(factorialTailRecursive(5))
}