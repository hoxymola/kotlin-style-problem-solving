/**
 * @author Jaeguk Cho
 */

fun main() = println(readln().toLong().let { it * (it - 1) * (it - 2) * (it - 3) / 24 })
