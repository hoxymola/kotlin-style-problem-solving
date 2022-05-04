import java.io.File

/**
 * @author Jaeguk Cho
 */

fun main() {
    File("src/main/kotlin/input")
        .readLines().map { it.toInt() }.also { list ->
            list.forEach { num ->
                list.firstOrNull { num + it == 2020 }?.let {
                    println(num * it)
                    return
                }
            }
        }
}
