package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(readLines("2021_01").windowed(3)
    .map { it.sumOf { it.toInt() } }.zipWithNext { x, y -> x < y }.count { it })
