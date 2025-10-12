package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    val (n, k, t, m) = readln().split(" ").map { it.toInt() }
    val scores = List(n) { MutableList(k) { 0 } }
    val submitCounts = MutableList(n) { 0 }
    val lastSubmits = MutableList(n) { 0 }

    repeat(m) {
        val (i, j, s) = readln().split(" ").map { it.toInt() }

        scores[i - 1][j - 1] = maxOf(scores[i - 1][j - 1], s)
        submitCounts[i - 1]++
        lastSubmits[i - 1] = it
    }

    println(
        scores.withIndex().sortedWith { a, b ->
            when {
                a.value.sum() != b.value.sum() -> b.value.sum() - a.value.sum()
                submitCounts[a.index] != submitCounts[b.index] -> submitCounts[a.index] - submitCounts[b.index]
                else -> lastSubmits[a.index] - lastSubmits[b.index]
            }
        }.indexOfFirst { it.index == t - 1 } + 1
    )
}
