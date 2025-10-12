package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (h1, h2, h3) = readln().split(" ").map { it.toLong() }
    val n = readln().toLong()

    println(n * h3 + (n + 1) / 2 * h2 + h1 * (n % 2))
}
