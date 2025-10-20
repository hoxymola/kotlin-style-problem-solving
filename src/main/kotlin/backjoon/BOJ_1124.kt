import kotlin.math.sqrt

val max = 100000
val isPrime = MutableList(max + 1) { it >= 2 }
fun preprocess() {
    for (i in 2..sqrt(max.toDouble()).toInt()) {
        for (j in i * 2..max step i) {
            isPrime[j] = false
        }
    }
}

val primeCnt = MutableList(max + 1) { 0 }
fun primeCnt(num: Int): Int {
    if (primeCnt[num] != 0) return primeCnt[num]

    return when {
        isPrime[num] -> 1
        else -> {
            val factor = (2..max).first { num % it == 0 }

            primeCnt(num / factor) + 1
        }
    }.also { primeCnt[num] = it }
}

fun main() {
    preprocess()

    val (a, b) = readln().split(" ").map { it.toInt() }

    println((a..b).count { isPrime[primeCnt(it)] })
}
