package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() {
    readLines("2020_01").map { it.toInt() }.also { line ->
        line.forEach { num ->
            line.firstOrNull { num + it == 2020 }?.let {
                println(num * it)
                return
            }
        }
    }
}
