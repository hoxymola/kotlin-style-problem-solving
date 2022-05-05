import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2020_4").joinToString(" ").split("  ").count {
        with(it.split(' ').map { it.substringBefore(':') }) {
            (size == 8) || (size == 7 && all { it != "cid" })
        }
    }
)
