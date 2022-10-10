import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val rocks = readln().trim().split(' ').map { it.toInt() }
    val (a, b) = readln().trim().split(' ').map { it.toInt() - 1 }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val visited = MutableList(n) { false }

    visited[a] = true
    queue.offer(a to 0)
    while (queue.isNotEmpty()) {
        val (cur, d) = queue.poll()

        if (cur == b) return println(d)
        repeat(2) {
            var new = cur

            while (new in 0 until n) {
                if (!visited[new]) {
                    visited[new] = true
                    queue.offer(new to d + 1)
                }
                new += rocks[cur] * if (it == 0) 1 else -1
            }
        }
    }
    println(-1)
}
