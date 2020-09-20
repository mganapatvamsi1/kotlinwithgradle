package com.testing.dev.manig.functions

fun foo(fooParam: String) {
    val outerFunctionValue = "outer value"
     fun bar(barParam: String) {
        val innerFunctionValue = "inner value"
        println(barParam)
        println()
        println(fooParam)
        println()
        println(innerFunctionValue)
        println()
        println(outerFunctionValue)
    }
}

fun main(args: Array<String>) {
    val outer = foo("outer only")
}