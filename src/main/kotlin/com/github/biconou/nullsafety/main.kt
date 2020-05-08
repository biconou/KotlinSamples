package com.github.biconou.nullsafety

fun main(args: Array<String>) {
    var message: String? = null

    println("message length = ${message!!.length}")


}