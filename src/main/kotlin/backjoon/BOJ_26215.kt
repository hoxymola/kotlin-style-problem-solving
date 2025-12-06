package backjoon26215

import java.util.PriorityQueue

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Int>(reverseOrder())
    var ans = 0

    pq += a

    while (pq.isNotEmpty()) {
        val a = pq.poll()
        val b = pq.poll()

        if (b == null) {
            ans += a
        } else {
            val min = minOf(a, b)
            val max = maxOf(a, b)

            ans += min
            pq += max - min
        }
    }

    println(ans.takeIf { it <= 1440 } ?: -1)
}
