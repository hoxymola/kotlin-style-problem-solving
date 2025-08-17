package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (s, n, m) = readln().split(" ").map { it.toInt() }
    val stocks = generateSequence { readlnOrNull() }
        .flatMap { it.split(" ").map(String::toInt) }.take(s).toList()
    val movements = stocks.zipWithNext { a, b -> if (a < b) 'u' else 'd' }

    val peakSequence = List(n - 1) { 'u' } + List(n - 1) { 'd' }
    val valleySequence = List(m - 1) { 'd' } + List(m - 1) { 'u' }

    val peakCount = movements.windowed(2 * n - 2).count { it == peakSequence }
    val valleyCount = movements.windowed(2 * m - 2).count { it == valleySequence }

    println("$peakCount $valleyCount")
}
