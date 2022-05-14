package adventOfCode.code

import adventOfCode.model.Location
import adventOfCode.util.readLines

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
