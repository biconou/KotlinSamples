package com.github.biconou

fun displayNameAndAge(name: String, age: Int = 30) {
    println("$name id $age years old")
}

fun main(vararg args: String) {
    // using default age value
    displayNameAndAge("Bernard")
    // invert argument order using named arguments
    displayNameAndAge(age = 55, name = "Raymond")
}

