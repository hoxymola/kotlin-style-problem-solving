package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2016_06").joinToString("").withIndex().groupBy { it.index % 8 }
        .map { it.value.groupBy { it.value }.minByOrNull { it.value.size }?.key }.joinToString("")
)
