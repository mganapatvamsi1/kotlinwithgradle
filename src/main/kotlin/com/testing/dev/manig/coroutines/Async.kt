package com.testing.dev.manig.coroutines

import java.util.concurrent.CompletableFuture


private fun startLongAsyncOperation(v: Int) =
    CompletableFuture.supplyAsync {
        Thread.sleep(1000)
        "Result = $v"
    }

fun main() {
//    val future = async<String> {
//
//    }

}