import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    readLines("2020_1").map { it.toInt() }.also { list ->
        list.forEach { num ->
            list.firstOrNull { num + it == 2020 }?.let {
                println(num * it)
                return
            }
        }
    }
}
