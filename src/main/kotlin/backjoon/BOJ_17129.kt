import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(
        val y: Int,
        val x: Int,
        val d: Int,
    )

    val (n, m) = readln().split(' ').map { it.toInt() }
    val visited = List(n) { MutableList(m) { false } }
    val queue: Queue<Node> = LinkedList()
    val grid = List(n) { readln() }
    val dy = listOf(0, 0, -1, 1)
    val dx = listOf(-1, 1, 0, 0)
    val (y, x) = grid.joinToString("").indexOf('2').let { it / n to it % n }

    visited[y][x] = true
    queue.offer(Node(y, x, 0))
    while (queue.isNotEmpty()) {
        val (y, x, d) = queue.poll()

        if (grid[y][x] in listOf('3', '4', '5')) return println("TAK\n$d")
        repeat(4) {
            val ny = y + dy[it]
            val nx = x + dx[it]

            if (ny in 0 until n && nx in 0 until m && !visited[ny][nx] && grid[ny][nx] != '1') {
                visited[ny][nx] = true
                queue.offer(Node(ny, nx, d + 1))
            }
        }
    }
    println("NIE")
}
