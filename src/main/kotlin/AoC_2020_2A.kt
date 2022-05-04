import java.io.File

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    File("src/main/kotlin/input").readLines()
        .count {
            val (min, max) = it.substringBefore(' ').split('-').map { it.toInt() }
            val char = it.substringAfter(' ')[0]
            it.substringAfterLast(' ').count { it == char } in min..max
        }
)

