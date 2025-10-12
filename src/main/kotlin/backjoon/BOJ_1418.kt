package backjoon

import kotlin.math.sqrt

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val k = readln().toInt()
    val prime = MutableList(n + 1) { it >= 2 }
    val max = MutableList(n + 1) { 0 }

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        for (j in i * 2..n step i) {
            prime[j] = false
        }
    }

    for (i in 2..n) {
        if (prime[i]) {
            for (j in i..n step i) {
                max[j] = i
            }
        }
    }

    println(max.count { it <= k } - 1)
}
