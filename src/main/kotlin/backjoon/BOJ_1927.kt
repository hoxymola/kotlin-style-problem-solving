package backjoon1927

import java.util.*

fun main() {
    val pq = PriorityQueue<Int>()

    repeat(readln().toInt()) {
        val x = readln().toInt()

        if (x > 0) pq.add(x)
        else println(pq.poll() ?: 0)
    }
}
