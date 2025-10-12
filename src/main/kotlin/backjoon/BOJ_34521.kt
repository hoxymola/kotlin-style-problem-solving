package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val t = readln().toInt()
    val swap = BooleanArray(1_000_001)

    for (i in 3..1413 step 2) {
        swap[i * i / 2 - 1] = true
    }

    repeat(t) {
        val n = readln().toInt()

        IntArray(readln().toInt()) { idx ->
            when {
                swap[idx + 1] && idx == n - 1 -> idx + 1
                swap[idx + 1] -> idx + 2
                swap[idx] -> idx
                else -> idx + 1
            }
        }.also { it.joinToString(" ") }
    }
}
