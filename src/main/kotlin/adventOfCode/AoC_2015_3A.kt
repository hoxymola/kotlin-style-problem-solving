package adventOfCode

import adventOfCode.model.Location

/**
 * @author Jaeguk Cho
 */

fun main() {
    val santa = Location(mutableSetOf(0 to 0))
    readLines("2015_03").first().forEach { santa.move(it) }
    println(santa.visited.size)
}
