package adventOfCode.code

import adventOfCode.model.Location
import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    val santa = Location()
    readLines("2015_03").first().forEach { santa.move(it) }
    println(santa.visited.size)
}
