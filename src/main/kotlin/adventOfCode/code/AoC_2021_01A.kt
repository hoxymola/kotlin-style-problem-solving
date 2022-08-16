package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(readLines("2021_01").map { it.toInt() }.zipWithNext().count { it.first < it.second })

