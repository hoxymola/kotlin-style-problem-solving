import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(
        val y: Int,
        val x: Int,
        val d: Int,
        val visited: List<Pair<Int, Int>>,
    )

    val (r, c, k) = readln().split(' ').map { it.toInt() }
    val queue: Queue<Node> = LinkedList()
    val grid = List(r) { readln() }
    val dy = listOf(0, 0, -1, 1)
    val dx = listOf(-1, 1, 0, 0)
    var answer = 0

    queue.offer(Node(r - 1, 0, 1, listOf(r - 1 to 0)))
    while (queue.isNotEmpty()) {
        val (y, x, d, visited) = queue.poll()

        if (y == 0 && x == c - 1 && d == k) answer++
        repeat(4) {
            val ny = y + dy[it]
            val nx = x + dx[it]

            if (ny in 0 until r && nx in 0 until c && !visited.contains(ny to nx) && grid[ny][nx] != 'T') {
                queue.offer(Node(ny, nx, d + 1, visited + (ny to nx)))
            }
        }
    }
    println(answer)
}
