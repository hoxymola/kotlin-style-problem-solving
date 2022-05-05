package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2015_02")
        .map { it.split('x').map { it.toInt() } }
        .map { (it + it[0]).zipWithNext { x, y -> x * y } }
        .sumOf { it.sum() * 2 + it.minOf { it } }
)
