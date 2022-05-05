import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2020_02").count {
        val (min, max) = it.substringBefore(' ').split('-').map { it.toInt() }
        val char = it.substringAfter(' ')[0]
        it.substringAfterLast(' ').count { it == char } in min..max
    }
)
