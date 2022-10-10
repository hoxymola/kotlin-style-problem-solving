import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val grid = List(n) { readln().split(' ').map { it.toInt() } }
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val visited = List(n) { MutableList(n) { false } }

    visited[0][0] = true
    queue.offer(0 to 0)
    while (queue.isNotEmpty()) {
        val (y, x) = queue.poll()

        if (y == n - 1 && x == n - 1) return println("HaruHaru")
        repeat(2) {
            val ny = y + grid[y][x] * (it == 0).compareTo(false)
            val nx = x + grid[y][x] * (it == 1).compareTo(false)

            if (ny < n && nx < n && !visited[ny][nx]) {
                visited[ny][nx] = true
                queue.offer(ny to nx)
            }
        }
    }
    println("Hing")
}
