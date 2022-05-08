package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2015_02")
        .map { it.split('x').map { it.toInt() } }
        .sumOf { it.reduce(Int::times) + 2 * (it.sum() - it.maxOf { it }) }
)
