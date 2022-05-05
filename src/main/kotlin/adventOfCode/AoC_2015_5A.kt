package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2015_05").count { list ->
        (list.count { it in "aeiou" } >= 3)
            && ('a'..'z').any { it.toString() + it in list }
            && listOf("ab", "cd", "pq", "xy").none { it in list }
    }
)
