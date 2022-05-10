package adventOfCode

import adventOfCode.model.Location

/**
 * @author Jaeguk Cho
 */

fun main() {
    val location = Location()
    println(
        readLines("2016_01").single().split(", ")
            .map { location.turnBeforeMove(it[0], it.substring(1).toInt()) }
            .first { it != -1 }
    )
}
