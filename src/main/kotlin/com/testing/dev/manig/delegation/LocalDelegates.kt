package com.testing.dev.manig.delegation

fun localDelegates() {
    // this means this would be lazily initialized by the time when its accessed
    val lazy by lazy { initLate() }

}

fun initLate(): String {
    TODO("Some Implementation")
}


fun main() {

}