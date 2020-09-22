package com.testing.dev.manig.functions

import java.lang.Exception

/*
Inline works best for functions with Lambdas
*/
fun nonOp(x: Int) {

}

//noinline --> this is a modifier which says not to inline
inline fun operation(op: () -> Unit) {
    println("Before calling op()")
    op()
    throw Exception("An Exception message")
    println("After calling op()")
}

inline fun operation(noinline op: () -> Unit, op2: () -> Int) {
    println("Before calling op()")
    op()
    println("After calling op()")
}

fun tryingToInline(op: () -> Unit) {
    val reference = op
     println("Assigned value")
     op()
}


fun main(args: Array<String>) {
    operation { println("this is the actual op function") }
}