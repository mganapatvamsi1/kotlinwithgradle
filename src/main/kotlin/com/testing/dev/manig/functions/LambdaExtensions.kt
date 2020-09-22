package com.testing.dev.manig.functions

data class Request(val method: String, val query: String, val contentType: String)

data class Response(var content: String, var status: Status) {
//    fun status(status: Status.() -> Unit) {}
    operator fun invoke(status: Status.() -> Unit) {}

}

data class Status(var code: Int, var description: String)

data class RouteHandler(val request: Request, val response: Response) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}

//fun responseLambdasWithReceiver(response: Response.() -> Unit) {
//fun response(response: Response.() -> Unit) { }

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun main() {

    routeHandler("/index.html") {
        if (request.query != "") {
            // process it
        }
//        response.status = Status(401, "Unauthorized exception")
//        response.content = "UnAuthorized"
        response {
//            status {
                code = 401
                description = "UnAuthorized"
            }
//        }

    }

    val testingCode = TestingCode()
    testingCode("Finished testing")


}

class TestingCode {
    operator fun invoke(value: String) {

    }

}