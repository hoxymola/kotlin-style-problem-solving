package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val city = List(n) { readln().split(" ").map { it.toInt() } }
    val visited = List(n) { MutableList(m) { false } }
    val queue = mutableListOf<Pair<Int, Int>>()
    val dy = listOf(1, 0)
    val dx = listOf(0, 1)

    visited[0][0] = true
    queue.add(0 to 0)
    while (queue.isNotEmpty()) {
        val (y, x) = queue.removeFirst()

        if (y == n - 1 && x == m - 1) return println("Yes")
        for (i in 0 until 2) {
            val ny = y + dy[i]
            val nx = x + dx[i]

            if (ny in 0 until n && nx in 0 until m && !visited[ny][nx] && city[ny][nx] == 1) {
                visited[ny][nx] = true
                queue.add(ny to nx)
            }
        }
    }

    println("No")
}
