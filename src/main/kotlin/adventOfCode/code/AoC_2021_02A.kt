package adventOfCode.code

import adventOfCode.model.Submarine
import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    val submarine = Submarine()
    readLines("2021_02").onEach { submarine.move(it) }
    println(submarine.depth * submarine.position)
}
