package backjoon1484

import kotlin.math.sqrt

fun main() {
    val g = readln().toDouble()
    val ans = mutableListOf<Int>()

    for (f1 in 1..sqrt(g).toInt()) {
        val f2 = g.toInt() / f1

        if (f1 != f2 && f1 * f2 == g.toInt() && f1 % 2 == f2 % 2) {
            ans += (f1 + f2) / 2
        }
    }

    if (ans.isEmpty()) println(-1)
    else ans.sorted().forEach { println(it) }
}
