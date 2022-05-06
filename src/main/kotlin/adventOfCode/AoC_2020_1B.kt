package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() {
    readLines("2020_01").map { it.toInt() }.also { line ->
        line.forEach { num1 ->
            line.forEach { num2 ->
                line.firstOrNull { num1 + num2 + it == 2020 }?.let {
                    println(num1 * num2 * it)
                    return
                }
            }
        }
    }
}
