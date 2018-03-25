import java.util.*
import java.util.function.Predicate

fun main(args : Array<String>) {


    // On cree un tableau de chaines de caractères
    val names = arrayOf("Bach", "Mozart", "Ravel")

    // Considérons que cela correspond à un tableau de String java
    // On va chercher à utiliser Arrays.stream.filter
    // La fonction filter utilise un predicat
    // Dans une vision un peu ancienne de java on créera une classe anonyme implémentant l'interface prédicat.

    // Voilà comment on implémente une classe anonyme en Kotlin (https://kotlinlang.org/docs/reference/object-declarations.html)
    val p: Predicate<String> = object: Predicate<String> {
        override fun test(t: String): Boolean {
            return t == "Ravel"
        }
    }
    Arrays.stream(names).filter(p).forEach(::println)

    // Comme Predicate est une interface fonctionnelle c'est équivalent à la déclaration d'une fonction



    // En fait on peut utiliser directement notre classe anonyme
    Arrays.stream(names).filter(object: Predicate<String> {
        override fun test(t: String): Boolean {
            return t == "Ravel"
        }
    }).forEach(::println)

    // Comme predicate est une interface fonctionnelle on peut remplacer par une lambda
    Arrays.stream(names).filter { name -> name == "cocula" } .forEach {name -> println(name)}


    // Essai 1

    names.filter { name -> name == "cocula" }.forEach(::println)


    // Essai 3


    val p2 = Predicate<String> { name ->
        name == "cocula"
    }


    Arrays.stream(names).filter(p).forEach {name -> println(name)}
    Arrays.stream(names).filter(p2).forEach {name -> println(name)}


    // Essai 4

    fun f1(name: String):  Boolean {
        return  name == "Ravel"
    }

    fun fp2(name: String) = name == "Ravel"

    fun fp3(name: String) = {
        println ("filtering "+name)
        name == "cocula"
    }()



    Arrays.stream(names).filter(::fp3).forEach {name -> println(name)
        println("fin") }


}