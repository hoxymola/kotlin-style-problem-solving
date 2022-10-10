import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(
        val time: Int,
        val buttons: List<Int>,
    )

    val dt = listOf(60, 10, -10, 1, -1)
    val times = MutableList(70) { listOf<Int>() }
    val visited = MutableList(70) { false }
    val queue: Queue<Node> = LinkedList()

    visited[0] = true
    queue.offer(Node(0, listOf(0, 0, 0, 0, 0)))
    while (queue.isNotEmpty()) {
        val (t, buttons) = queue.poll()

        times[t] = buttons
        for (i in 4 downTo 0) {
            val nt = t + dt[i]

            if (nt in 0 until 70 && !visited[nt]) {
                visited[nt] = true
                queue.offer(Node(nt, buttons.mapIndexed { idx, v -> if (idx == i) v + 1 else v }))
            }
        }
    }

    repeat(readln().toInt()) {
        var n = readln().toInt()
        val addH = (n / 60).also { n %= 60 }
        println(times[n].mapIndexed { idx, v -> if (idx == 0) v + addH else v }.joinToString(" "))
    }
}
