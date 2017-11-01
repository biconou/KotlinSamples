import java.util.*
import java.util.function.Predicate

fun main(args : Array<String>) {


    val names = arrayOf("cocula", "remi")

    // Essai 1

    names.filter { name -> name == "cocula" }.forEach { name -> println(name) }

    // Essai 2

    Arrays.stream(names).filter { name -> name == "cocula" } .forEach {name -> println(name)}

    // Essai 3

    val p: Predicate<String> = object: Predicate<String> {
        override fun test(t: String): Boolean {
            return t == "cocula"
        }
    }

    val p2 = Predicate<String> { name ->
        name == "cocula"
    }

    Arrays.stream(names).filter(p).forEach {name -> println(name)}
    Arrays.stream(names).filter(p2).forEach {name -> println(name)}


    // Essai 4

    fun fp(name: String):  Boolean {
        return  name == "cocula"
    }

    fun fp2(name: String) = name == "cocula"

    fun fp3(name: String) = {
        println ("filtering "+name)
        name == "cocula"
    }()



    Arrays.stream(names).filter(::fp3).forEach {name -> println(name)
        println("fin") }


}