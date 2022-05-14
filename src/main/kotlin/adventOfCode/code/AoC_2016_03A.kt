package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2016_03").count {
        it.trim().split("[ ]+".toRegex()).map { it.toInt() }.sorted()
            .let { it[0] + it[1] > it[2] }
    }
)
