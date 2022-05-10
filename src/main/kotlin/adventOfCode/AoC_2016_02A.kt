package adventOfCode

import adventOfCode.model.Keypad

/**
 * @author Jaeguk Cho
 */

fun main() {
    val keypad = Keypad()
    println(readLines("2016_02").map { keypad.move(it) }.joinToString(""))
}
