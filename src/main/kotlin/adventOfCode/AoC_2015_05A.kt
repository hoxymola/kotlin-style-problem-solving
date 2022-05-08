package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2015_05").count { line ->
        (line.count { it in "aeiou" } >= 3)
            && ('a'..'z').any { it.toString() + it in line }
            && listOf("ab", "cd", "pq", "xy").none { it in line }
    }
)
