package backjoon

import kotlin.math.sqrt

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val prime = MutableList(n + 1) { it >= 2 }
    var b = 0
    var s = 0

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        for (j in i * 2..n step i) {
            prime[j] = false
        }
    }

    for (i in 1..n) {
        when {
            !prime[i] -> b++
            i == 3 -> s++
            else -> {
                b--
                s += 2
            }
        }
    }

    println("$b $s")
}
