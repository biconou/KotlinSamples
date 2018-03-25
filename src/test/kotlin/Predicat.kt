import java.util.*
import java.util.function.Predicate

fun main(args : Array<String>) {

    val names = arrayOf("Bach", "Mozart", "Ravel")

    val p1: Predicate<String> = object: Predicate<String> {
        override fun test(t: String): Boolean {
            return t == "Ravel"
        }
    }
    Arrays.stream(names).filter(p1).forEach(::println)

    //
    fun p2(name: String):  Boolean {
        return name == "Ravel"
    }
    Arrays.stream(names).filter(::p2).forEach(::println)

    //
    val p3 = Predicate<String> { name ->
        name == "Ravel"
    }
    Arrays.stream(names).filter(p3).forEach(::println)

    //
    fun p4(name: String) = {
        name == "Ravel"
    }()
    Arrays.stream(names).filter(::p4).forEach(::println)

    //
    fun p5(name: String) = name == "Ravel"
    Arrays.stream(names).filter(::p5).forEach(::println)

    //
    Arrays.stream(names).filter { name -> name == "Ravel" } .forEach(::println)

    //
    names.filter { name -> name == "Ravel" } .forEach(::println)
}