package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2020_04").joinToString(" ").split("  ").count {
        with(it.split(' ').map { it.substringBefore(':') }) {
            (size == 8) || (size == 7 && all { it != "cid" })
        }
    }
)
