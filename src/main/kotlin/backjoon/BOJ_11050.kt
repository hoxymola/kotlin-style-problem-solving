val combinationCache = List(11) { MutableList(11) { 0 } }
fun combination(n: Int, k: Int): Int {
    if (combinationCache[n][k] != 0) return combinationCache[n][k]

    return when {
        k == 0 || k == n -> 1
        else -> combination(n - 1, k - 1) + combination(n - 1, k)
    }.also { combinationCache[n][k] = it }
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    println(combination(n, k))
}
