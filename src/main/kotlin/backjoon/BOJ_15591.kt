import java.lang.Integer.MAX_VALUE
import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val no: Int) {
        val connections = mutableListOf<Pair<Int, Int>>()
    }

    val (n, q) = readln().split(' ').map { it.toInt() }
    val graph = List(n + 1) { Node(it) }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val answer = StringBuilder()

    repeat(n - 1) {
        readln().split(' ').map { it.toInt() }.also { (p, q, r) ->
            graph[p].connections += q to r
            graph[q].connections += p to r
        }
    }
    repeat(q) {
        readln().split(' ').map { it.toInt() }.also { (k, v) ->
            val visited = MutableList(n + 1) { false }
            var count = 0

            visited[v] = true
            queue.offer(v to MAX_VALUE)
            while (queue.isNotEmpty()) {
                val (cur, usado) = queue.poll()

                graph[cur].connections.filter { !visited[it.first] && it.second >= k }.forEach { (next, localUsado) ->
                    visited[next] = true
                    queue.offer(next to minOf(usado, localUsado))
                    count++
                }
            }
            answer.append(count.toString() + "\n")
        }
    }
    println(answer)
}
