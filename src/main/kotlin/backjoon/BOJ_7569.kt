import java.util.*

/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(
        val z: Int,
        val y: Int,
        val x: Int,
        val d: Int,
    )

    val (m, n, h) = readln().split(' ').map { it.toInt() }
    val tomatoes = List(h) { List(n) { readln().split(' ').map { it.toInt() }.toMutableList() } }
    val queue: Queue<Node> = LinkedList()
    val visited = List(h) { List(n) { MutableList(m) { false } } }
    val dx = listOf(0, 0, 0, 0, 1, -1)
    val dy = listOf(0, 0, 1, -1, 0, 0)
    val dz = listOf(1, -1, 0, 0, 0, 0)
    var answer = -1

    for (i in 0 until h) {
        for (j in 0 until n) {
            for (k in 0 until m) {
                if (tomatoes[i][j][k] == 1) {
                    visited[i][j][k] = true
                    queue.offer(Node(i, j, k, 0))
                }
            }
        }
    }
    while (queue.isNotEmpty()) {
        val cur = queue.poll()

        answer = maxOf(answer, cur.d)
        tomatoes[cur.z][cur.y][cur.x] = 1
        for (i in 0 until 6) {
            val nz = cur.z + dz[i]
            val ny = cur.y + dy[i]
            val nx = cur.x + dx[i]

            if (nz in 0 until h && ny in 0 until n && nx in 0 until m && !visited[nz][ny][nx] && tomatoes[nz][ny][nx] == 0) {
                visited[nz][ny][nx] = true
                queue.offer(Node(nz, ny, nx, cur.d + 1))
            }
        }
    }
    println(answer.takeIf { tomatoes.flatMap { it.flatten() }.none { it == 0 } } ?: -1)
}
