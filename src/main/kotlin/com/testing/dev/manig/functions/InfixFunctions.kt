package com.testing.dev.manig.functions

/*
infix functions should be only used on extension functions or member functions with only 1 variable.
 */
infix fun String.shouldBeEqualTo(value: String)= this == value


fun operation(op: () -> Unit) {

}

fun main(args: Array<String>) {

    println("HelloKotlin" shouldBeEqualTo "HelloKotlin")
    println("HelloAndroid" shouldBeEqualTo "HelloJava")

}