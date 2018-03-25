package com.github.biconou.utils

import java.util.regex.Pattern


/**
 * Checks id a string contains only space character
 */
fun isOnlySpace(s: String): Boolean {
    return Pattern.compile("\\s+").matcher(s).matches()
}

fun String.isOnlySpaceEx(): Boolean = isOnlySpace(this)

fun String.isOnlySpaceEx2(): Boolean {
    return isOnlySpace(this)
}

fun String.isOnlySpaceEx3() = isOnlySpace(this)

fun String.isOnlySpaceEx4() = { isOnlySpace(this) } // Ca marche pas

fun String.isOnlySpaceEx5() = { isOnlySpace(this) }()

fun String.isOnlySpaceEx6() = this.isOnlySpaceEx()

fun String.isOnlySpaceEx7() = { this.isOnlySpaceEx() }()

fun String.isOnlySpaceEx8() = { Pattern.compile("\\s+").matcher(this).matches() }()

