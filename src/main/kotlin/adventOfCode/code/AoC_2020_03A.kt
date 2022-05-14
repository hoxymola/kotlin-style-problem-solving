package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2020_03").mapIndexed { i, v ->
        v[i * 3 % v.length] == '#'
    }.count { it }
)
