import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun main() {
    readLines("2020_1").map { it.toInt() }.also { list ->
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
