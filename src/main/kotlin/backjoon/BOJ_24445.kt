import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val no: Int) {
        var order = 0
        val connections = mutableListOf<Int>()
    }

    val (n, m, r) = readln().split(' ').map { it.toInt() }
    val graph = List(n) { Node(it) }
    val queue: Queue<Int> = LinkedList()
    val visited = MutableList(n) { false }
    var order = 1

    repeat(m) {
        readln().split(' ').map { it.toInt() - 1 }.also {
            graph[it[0]].connections.add(it[1])
            graph[it[1]].connections.add(it[0])
        }
    }

    graph[r - 1].apply {
        visited[no] = true
        queue.offer(no)
    }
    while (queue.isNotEmpty()) {
        val cur = graph[queue.poll()]

        cur.apply {
            this.order = order++
            connections.sortedDescending().filterNot { visited[it] }.forEach {
                visited[it] = true
                queue.offer(it)
            }
        }
    }
    println(graph.joinToString("\n") { it.order.toString() })
}
