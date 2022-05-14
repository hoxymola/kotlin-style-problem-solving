package adventOfCode.code

import adventOfCode.util.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2015_05").count { line ->
        with(line) {
            dropLast(2).filterIndexed { i, _ -> indexOf(substring(i, i + 2), i + 2) != -1 }.isNotEmpty()
                && dropLast(2).filterIndexed { i, c -> any { c == get(i + 2) } }.isNotEmpty()
        }
    }
)
