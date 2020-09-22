package com.testing.dev.manig.delegation

import kotlin.properties.Delegates

class Veto {
    var value: String by Delegates.vetoable("String")
    {prop, old, new -> new.startsWith("S") }

}


fun main() {
    val veto = Veto()
    println(veto.value)
    veto.value = "St Louis"
    println(veto.value)
    veto.value = "SanFransisco"
    println(veto.value)
    veto.value = "Seattle"
    println(veto.value)
    veto.value = "San Jose"
    println(veto.value)
    veto.value = "New York"
    println(veto.value)

}