package backjoon7662

import java.util.*

data class Entry(
    val index: Int,
    val value: Int,
)

fun PriorityQueue<Entry>.poll(deleted: BooleanArray): Entry? {
    while (isNotEmpty() && deleted[peek().index]) poll()

    return poll()
}

fun main() = repeat(readln().toInt()) {
    val k = readln().toInt()
    val minQ = PriorityQueue<Entry>(compareBy { it.value })
    val maxQ = PriorityQueue<Entry>(compareByDescending { it.value })
    val deleted = BooleanArray(k)

    repeat(k) { index ->
        val (op, x) = readln().split(" ").let { it[0] to it[1].toInt() }

        when (op) {
            "I" -> {
                minQ.add(Entry(index, x))
                maxQ.add(Entry(index, x))
            }

            "D" -> {
                val pq = if (x > 0) maxQ else minQ

                pq.poll(deleted)?.also { deleted[it.index] = true }
            }
        }
    }

    val min = minQ.poll(deleted)
    val max = maxQ.poll(deleted)

    println(
        if (min == null || max == null) "EMPTY"
        else "${max.value} ${min.value}"
    )
}
