package backjoon

/**
 * @author Jaeguk Cho
 */

fun gcd(a: Long, b: Long): Long {
    if (b == 0L) return a
    return gcd(b, a % b)
}

fun main() = repeat(readln().toInt()) {
    val (a, b) = readln().split(" ").map { it.toLong() }
    val gcd = gcd(a, b)

    println(a * b / gcd)
}
