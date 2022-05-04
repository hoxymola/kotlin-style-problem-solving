import java.io.File

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    File("src/main/kotlin/input").readLines()
        .count {
            val (first, last) = it.substringBefore(' ').split('-').map { it.toInt() - 1 }
            val char = it.substringAfter(' ')[0]
            with(it.substringAfterLast(' ')) {
                (get(first) == char) xor (get(last) == char)
            }
        }
)
