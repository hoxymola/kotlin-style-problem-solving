package backjoon1374

import java.util.*

data class Class(
    val s: Int,
    val e: Int,
)

fun main() {
    val n = readln().toInt()
    val classes = List(n) { readln().split(" ").map { it.toInt() } }
        .map { Class(it[1], it[2]) }.sortedWith(compareBy(Class::s, Class::e))
    val pq = PriorityQueue(compareBy(Class::e))
        .also { it.add(classes.first()) }

    classes.drop(1).forEach {
        if (pq.peek().e <= it.s) pq.poll()
        pq.add(it)
    }

    println(pq.size)
}
