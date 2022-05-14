package adventOfCode.code

import adventOfCode.model.Location
import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    val visited = mutableSetOf(0 to 0)
    val santa = Location(visited)
    val roboSanta = Location(visited)
    readLines("2015_03").first().chunked(2)
        .forEach {
            santa.move(it[0])
            roboSanta.move(it[1])
        }
    println(visited.size)
}
