package com.github.biconou.classes



class Person(fName: String, val age: Int) {
    var firstName: String = fName.capitalize()
}



fun sayHelloFun(user: String) {
    println("Bonjour $user !")
}

val sayHello = ::sayHelloFun

fun main(args: Array<String>) {
    val person = Person("joe", 25)
    println("First Name = ${person.firstName}")
    println("Age = ${person.age}")
    sayHello("toto")
}
