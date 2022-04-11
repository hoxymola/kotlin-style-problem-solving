/**
 * @author Jaeguk Cho
 */

fun main() {
    val cache = hashMapOf<Long, Long>()
    val (n, p, q, x, y) = readln().split(' ').map { it.toLong() }
    fun a(n: Long): Long = if (n <= 0) 1 else cache.getOrPut(n) { a(n / p - x) + a(n / q - y) }
    println(a(n))
}

