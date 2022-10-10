import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }

    data class Node(val no: Int) {
        val connections = mutableListOf<Pair<Int, Int>>()
        val distance = MutableList(n + 1) { 0 }
    }

    val tree = List(n + 1) { Node(it) }
    val queue: Queue<Pair<Int, Int>> = LinkedList()

    repeat(n - 1) {
        readln().split(' ').map { it.toInt() }.also {
            tree[it[0]].connections.add(it[1] to it[2])
            tree[it[1]].connections.add(it[0] to it[2])
        }
    }
    repeat(n + 1) { start ->
        val visited = MutableList(n + 1) { false }

        visited[start] = true
        queue.offer(start to 0)
        while (queue.isNotEmpty()) {
            val cur = queue.poll()

            tree[start].distance[cur.first] = cur.second
            tree[cur.first].connections.filterNot { visited[it.first] }.forEach {
                visited[it.first] = true
                queue.offer(it.first to it.second + cur.second)
            }
        }
    }
    repeat(m) {
        readln().split(' ').map { it.toInt() }
            .also { println(tree[it[0]].distance[it[1]]) }
    }
}
