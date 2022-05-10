package adventOfCode

import adventOfCode.model.Location
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
