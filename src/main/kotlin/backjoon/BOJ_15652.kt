package backjoon15652

lateinit var sequence: IntArray

fun backTrack(n: Int, m: Int, d: Int, s: Int) {
    if (m == d) return println(sequence.joinToString(" "))

    (s..n).forEach {
        sequence[d] = it
        backTrack(n, m, d + 1, it)
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    sequence = IntArray(m)

    backTrack(n, m, 0, 1)
}
