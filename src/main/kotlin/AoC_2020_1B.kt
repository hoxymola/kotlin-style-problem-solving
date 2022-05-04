import java.io.File

/**
 * @author Jaeguk Cho
 */

fun main() {
    File("src/main/kotlin/input")
        .readLines().map { it.toInt() }.also { list ->
            list.forEach { num1 ->
                list.forEach { num2 ->
                    list.firstOrNull { num1 + num2 + it == 2020 }?.let {
                        println(num1 * num2 * it)
                        return
                    }
                }
            }
        }
}
