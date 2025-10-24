package backjoon1978

import kotlin.math.sqrt

fun main() {
    val max = 1000
    val isPrime = MutableList(max + 1) { it >= 2 }
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }

    for (i in 2..sqrt(max.toDouble()).toInt()) {
        for (j in i * 2..max step i) {
            isPrime[j] = false
        }
    }

    println(nums.count { isPrime[it] })
}
