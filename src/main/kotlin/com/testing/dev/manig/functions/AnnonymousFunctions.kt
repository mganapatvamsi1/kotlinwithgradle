package com.testing.dev.manig.functions

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    //lambda version
    op(3) { it * it }

    //annonymous version
    op(3, fun(x): Int {
        return if (x > 5) {
            0
        } else {
            x * x
        }
    })

}