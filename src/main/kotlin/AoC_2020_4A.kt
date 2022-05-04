import java.io.File

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    File("src/main/kotlin/input")
        .readLines().joinToString(" ").split("  ").count {
            with(it.split(' ').map { it.split(':').let { it[0] to it[1] } }) {
                size == 8 || (size == 7 && all { it.first != "cid" })
            }
        }
)

