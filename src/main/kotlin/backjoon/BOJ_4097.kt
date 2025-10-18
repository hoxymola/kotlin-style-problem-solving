package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    while (true) {
        val n = readln().toInt()
            .also { if (it == 0) return }
        val profits = List(n) { readln().toInt() }
        val prefixSums = profits.runningFold(0) { acc, p ->
            if (acc + p < 0) 0 else acc + p
        }

        println(prefixSums.filter { it > 0 }.maxOrNull() ?: profits.maxOrNull())
    }
}
