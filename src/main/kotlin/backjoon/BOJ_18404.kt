package backjoon18404

data class Node(
    val y: Int,
    val x: Int,
    val depth: Int,
)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val (y, x) = readln().split(" ").map { it.toInt() }
    val board = Array(n + 1) { IntArray(n + 1) }
    val visited = Array(n + 1) { BooleanArray(n + 1) }
    val queue = ArrayDeque<Node>()
    val dy = listOf(-2, -1, 1, 2, 2, 1, -1, -2)
    val dx = listOf(1, 2, 2, 1, -1, -2, -2, -1)
    val ans = IntArray(m + 1)

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        board[a][b] = it + 1
    }

    visited[y][x] = true
    queue.addLast(Node(y, x, 0))
    while (queue.isNotEmpty()) {
        val (cy, cx, depth) = queue.removeFirst()

        ans[board[cy][cx]] = depth
        repeat(8) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 1..n && nx in 1..n && !visited[ny][nx]) {
                visited[ny][nx] = true
                queue.addLast(Node(ny, nx, depth + 1))
            }
        }
    }

    println(ans.drop(1).joinToString(" "))
}
