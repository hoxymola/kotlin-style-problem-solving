import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val no: Int) {
        var depth = -1L
        var order = 0L
        val connections = mutableListOf<Int>()
    }

    val (n, m, r) = readln().split(' ').map { it.toInt() }
    val graph = List(n) { Node(it) }
    val queue: Queue<Pair<Int, Long>> = LinkedList()
    val visited = MutableList(n) { false }
    var order = 1L

    repeat(m) {
        readln().split(' ').map { it.toInt() - 1 }.also {
            graph[it[0]].connections.add(it[1])
            graph[it[1]].connections.add(it[0])
        }
    }

    graph[r - 1].apply {
        visited[no] = true
        queue.offer(no to 0)
    }
    while (queue.isNotEmpty()) {
        val cur = queue.poll()

        graph[cur.first].apply {
            depth = cur.second
            this.order = order++
            connections.sortedDescending().filterNot { visited[it] }.forEach {
                visited[it] = true
                queue.offer(it to cur.second + 1)
            }
        }
    }
    println(graph.sumOf { it.depth * it.order })
}
