/**
 * @author Jaeguk Cho
 */

fun main() {
    val cache = hashMapOf<Long, Long>()
    val (n, p, q) = readln().split(' ').map { it.toLong() }
    fun a(n: Long): Long = if (n == 0L) 1 else cache.getOrPut(n) { a(n / p) + a(n / q) }
    println(a(n))
}
