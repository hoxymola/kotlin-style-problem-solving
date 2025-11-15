package backjoon11286

import java.util.*
import kotlin.math.abs

fun main() {
    val pq = PriorityQueue<Int>(compareBy({ abs(it) }, { it }))

    repeat(readln().toInt()) {
        val x = readln().toInt()

        if (x != 0) pq.add(x)
        else println(pq.poll() ?: 0)
    }
}
