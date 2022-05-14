package adventOfCode.code

import adventOfCode.model.Keypad
import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    val keypad = Keypad()
    println(readLines("2016_02").map { keypad.move(it) }.joinToString(""))
}
