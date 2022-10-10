import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Nominate(val next: Int)

    val (n, k) = readln().split(' ').map { it.toInt() }
    val game = List(n) { Nominate(readln().toInt()) }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val visited = MutableList(n) { false }

    visited[0] = true
    queue.offer(0 to 0)
    while (queue.isNotEmpty()) {
        val (cur, d) = queue.poll()

        if (cur == k) return println(d)
        game[cur].next.also {
            if (!visited[it]) {
                visited[it] = true
                queue.offer(it to d + 1)
            }
        }
    }
    println(-1)
}
