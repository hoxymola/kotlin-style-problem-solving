import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val no: Int) {
        val connections = mutableListOf<Int>()
    }

    val (a, b) = readln().split(' ').map { it.toInt() }
    val (n, m) = readln().split(' ').map { it.toInt() }
    val graph = List(n + 1) { Node(it) }
    val visited = MutableList(n + 1) { false }
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    repeat(m) {
        readln().split(' ').map { it.toInt() }.also {
            graph[it[0]].connections += it[1]
            graph[it[1]].connections += it[0]
        }
    }

    visited[a] = true
    queue.offer(a to 0)
    while (queue.isNotEmpty()) {
        val cur = queue.poll()

        if (cur.first == b) return println(cur.second)
        graph[cur.first].connections.filterNot { visited[it] }.forEach {
            visited[it] = true
            queue.offer(it to cur.second + 1)
        }
    }
    println(-1)
}
