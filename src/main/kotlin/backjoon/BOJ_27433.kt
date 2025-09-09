package backjoon

/**
 * @author Jaeguk Cho
 */

fun factorial(n: Int): Long = if (n == 0) 1 else n * factorial(n - 1)

fun main() = println(factorial(readln().toInt()))
