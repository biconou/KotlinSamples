package com.github.biconou.classes

data class DataSample(val name: String, var age: Int)

fun main(args: Array<String>) {
    var person1 = DataSample(name = "Rémi", age = 46)
    println("person 1 is : $person1")
    person1.age = 19
    println("person 1 age modified : $person1")
    // person1.name = "toto" // immutable
}


