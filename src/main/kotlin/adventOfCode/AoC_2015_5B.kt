package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2015_05").count { line ->
        line.dropLast(2).filterIndexed { i, _ ->
            line.indexOf(line.substring(i, i + 2), i + 2) != -1
        }.isNotEmpty() &&
            line.dropLast(2).filterIndexed { i, c ->
                line.any { c == line[i + 2] }
            }.isNotEmpty()
    }
)
