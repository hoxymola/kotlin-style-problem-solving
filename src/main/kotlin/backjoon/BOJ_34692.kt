package backjoon34692

import java.util.*

fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val pq = PriorityQueue(List(m) { 0 })

    readln().split(" ").map { it.toInt() }.forEach {
        pq.add(pq.poll() + it)
    }

    println(
        if (pq.peek() <= k) "WAIT"
        else "GO"
    )
}
