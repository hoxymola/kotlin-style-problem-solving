package adventOfCode.code

import adventOfCode.model.Location
import adventOfCode.util.readLines
import kotlin.math.absoluteValue

/**
 * @author Jaeguk Cho
 */

fun main() {
    val location = Location()
    readLines("2016_01").single().split(", ")
        .forEach { location.turnBeforeMove(it[0], it.substring(1).toInt()) }
        .also { println(location.x.absoluteValue + location.y.absoluteValue) }
}
