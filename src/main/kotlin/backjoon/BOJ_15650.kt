package backjoon15650

lateinit var sequence: IntArray

fun backtrack(n: Int, m: Int, d: Int, s: Int) {
    if (m == d) return println(sequence.joinToString(" "))

    (s..n).forEach {
        sequence[d] = it
        backtrack(n, m, d + 1, it + 1)
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    sequence = IntArray(m)

    backtrack(n, m, 0, 1)
}
