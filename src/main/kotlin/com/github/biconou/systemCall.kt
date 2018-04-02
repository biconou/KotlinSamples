package com.github.biconou

import java.io.File
import java.util.concurrent.TimeUnit


fun runCommand(vararg s: String) {
    // https://kotlinlang.org/docs/reference/functions.html#variable-number-of-arguments-varargs
    // * is the spread operator
    ProcessBuilder(*s)
            .redirectOutput(ProcessBuilder.Redirect.INHERIT)
            .redirectError(ProcessBuilder.Redirect.INHERIT)
            .start()
            .waitFor(60, TimeUnit.MINUTES)
}

fun String.printSplitted() {
    replace("'","'$").split("'").forEach { println(it) }
    //println(split(" "))
}


fun main(args: Array<String>) {

    //"toto li toto".printSplitted()
    //"ls -al '/mnt/NAS/REMI/musique/PCDM/4 . Musiques électroniques/4.4 Techno/4.41 Techno, Electro/Arandel/Arandel - Umbrapellis EP 2015/cover.jpg'".printSplitted()
    runCommand("ls","/mnt/NAS/REMI/musique/PCDM/4 . Musiques électroniques/4.4 Techno/4.41 Techno, Electro/Arandel/Arandel - Umbrapellis EP 2015/cover.jpg")
}