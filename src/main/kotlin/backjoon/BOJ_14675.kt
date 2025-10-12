package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val counts = MutableList(n + 1) { 0 }

    repeat(n - 1) {
        readln().split(" ").forEach { counts[it.toInt()]++ }
    }

    repeat(readln().toInt()) {
        val (t, k) = readln().split(" ").map { it.toInt() }

        println(
            when {
                t == 2 -> "yes"
                counts[k] == 1 -> "no"
                else -> "yes"
            }
        )
    }
}
