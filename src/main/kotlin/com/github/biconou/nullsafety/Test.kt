package com.github.biconou.nullsafety


// Attention à lateinit

class Test {

    lateinit var prop1: String


    init {
        if (::prop1.isInitialized) {
            prop1.length
        }
        postInit()
    }

    private fun postInit() {
        prop1 = "some string"
    }
}

fun main(args: Array<String>) {

    val test = Test()

}