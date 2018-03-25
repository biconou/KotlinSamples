package com.github.biconou

object MySingleton {
    private val member: String

    init {
        member = "toto"
        println("Singleton instance is created")
    }
    fun displayHello() { println("Hello $member") }
}

fun main(vararg args: String) {
    MySingleton.displayHello()
}


