package backjoon1003

val fibonacciCache = MutableList(41) { -1 }
fun fibonacci(n: Int): Int {
    if (n == -1) return 1
    if (fibonacciCache[n] != -1) return fibonacciCache[n]

    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }.also { fibonacciCache[n] = it }
}

fun main() = repeat(readln().toInt()) {
    val n = readln().toInt()

    println("${fibonacci(n - 1)} ${fibonacci(n)}")
}
