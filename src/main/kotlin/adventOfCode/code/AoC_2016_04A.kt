package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    println(
        readLines("2016_04").sumOf {
            if (it.substringBeforeLast('-').filter { it != '-' }.groupBy { it }
                    .map { it.key to it.value.size }.sortedWith { p, q ->
                        if (p.second != q.second) q.second - p.second
                        else p.first - q.first
                    }.map { it.first }.joinToString("").take(5) == it.substringAfter('[').take(5)
            ) it.substringAfterLast('-').substringBefore('[').toInt() else 0
        }
    )
}
