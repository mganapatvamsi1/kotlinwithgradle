package com.testing.dev.manig.delegation

val String.hasAmpersand: Boolean
get() = this.contains("&")

fun main() {
    println("Hey what's up".hasAmpersand)
    println("Hey & what's up".hasAmpersand)

}