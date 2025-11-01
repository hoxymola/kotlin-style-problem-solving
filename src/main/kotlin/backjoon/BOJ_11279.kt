package backjoon11279

import java.util.*

fun main() {
    val pq = PriorityQueue<Int>(reverseOrder())

    repeat(readln().toInt()) {
        val x = readln().toInt()

        if (x > 0) pq.add(x)
        else println(pq.poll() ?: 0)
    }
}
