package backjoon

import kotlin.math.abs

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (x, y, w, s) = readln().trim().split(" ").map { it.toLong() }

    println(
        when {
            2 * w < s -> w * (x + y)
            w > s -> s * maxOf(x, y) + (x + y) % 2 * (w - s)
            else -> s * minOf(x, y) + w * abs(x - y)
        }
    )
}
