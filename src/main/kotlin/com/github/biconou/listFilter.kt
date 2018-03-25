package com.github.biconou


fun main(args: Array<String>) {

    val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var result = list.filter { it > 5 }.map { it * 2 }
    println(result) // Output : [12, 14, 16, 18, 20]
}