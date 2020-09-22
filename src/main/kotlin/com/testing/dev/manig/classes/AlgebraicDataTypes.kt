package com.testing.dev.manig.classes

import javax.swing.text.ParagraphView

//data class PageResult(val result: String, var isError: Boolean)
//open class PageResult() {
//    data class Success(val content: String): PageResult()
//    data class Error(val code: Int, val message: String): PageResult()
//}

sealed class PageResult() { }
data class Success(val content: String): PageResult()
data class Error(val code: Int, val message: String): PageResult()
data class MediumSuccess(val text: String): PageResult()
/*
Sealed classes have to be located within the same file.
 */

fun getUrlPage(url: String): PageResult {
    //logic.. ...
    val wasValidCall = false
    return if (wasValidCall) {
//         PageResult.Success("The actual content")
         Success("The actual content")
    } else {
//        PageResult.Error(404, "NOT FOUND")
        Error(404, "NOT FOUND")
    }
}

fun main() {
    when (val pageResult = getUrlPage("http://www.google.com")) {
//        is PageResult.Success -> println(pageResult.content)
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
//        is PageResult.Error -> println(pageResult.message)
    }

}