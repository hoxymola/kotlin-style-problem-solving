package backjoon

import kotlin.math.sqrt

/**
 * @author Jaeguk Cho
 */

fun main() {
    val max = 1299709
    val isPrime = MutableList(max + 1) { it >= 2 }

    for (i in 2..sqrt(max.toDouble()).toInt()) {
        for (j in i * 2..max step i) {
            isPrime[j] = false
        }
    }

    val primes = isPrime.withIndex().filter { it.value }.map { it.index }

    repeat(readln().toInt()) {
        val k = readln().toInt()
        var lte = 0
        var gte = 0
        var l = 0
        var r = primes.size - 1

        while (l <= r) {
            val m = (l + r) / 2

            when {
                k < primes[m] -> {
                    r = m - 1
                    gte = primes[m]
                }

                k == primes[m] -> {
                    gte = primes[m]
                    lte = primes[m]
                    break
                }

                k > primes[m] -> {
                    l = m + 1
                    lte = primes[m]
                }
            }
        }

        println(gte - lte)
    }
}
