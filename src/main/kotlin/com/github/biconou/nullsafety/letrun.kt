package com.github.biconou.nullsafety

fun main(args: Array<String>) {

    var message: String? = "tutu"
    print(message?.run { length } ?: throw RuntimeException())
}