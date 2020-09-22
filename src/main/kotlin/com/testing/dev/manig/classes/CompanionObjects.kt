package com.testing.dev.manig.classes

class Log() {

    companion object Factory {
       @JvmStatic fun createFileLog(filename: String): Log = Log(filename)
    }
    constructor(filename: String): this() {}

}

fun main() {
//    val log = Log.Factory.createFileLog("dogs.txt") // this is for object
    val log = Log.createFileLog("dogs.txt") // this works with companion objects only

}

/* Each class can only have a single companion object. */

/* By creating private constructors we can stop people from creating instances directly to our class. */