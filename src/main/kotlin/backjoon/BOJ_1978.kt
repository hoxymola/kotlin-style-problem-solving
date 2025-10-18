import kotlin.math.sqrt

fun main() {
    val max = 1000
    val isPrime = MutableList(max + 1) { it >= 2 }

    for (i in 2..sqrt(max.toDouble()).toInt()) {
        for (j in i * 2..max step i) {
            isPrime[j] = false
        }
    }

    val n = readln().toInt()
    val numbers = readln().split(" ").map { it.toInt() }

    println(numbers.count { isPrime[it] })
}
