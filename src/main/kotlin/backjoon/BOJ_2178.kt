package backjoon2178

data class State(
    val y: Int,
    val x: Int,
    val d: Int,
)

lateinit var maze: List<String>
lateinit var visited: Array<BooleanArray>
val queue = ArrayDeque<State>()
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, 1, 0, -1)

fun bfs(n: Int, m: Int) {
    visited[0][0] = true
    queue.addLast(State(0, 0, 1))
    while (queue.isNotEmpty()) {
        val (cy, cx, cd) = queue.removeFirst()

        if ((cy to cx) == (n - 1 to m - 1)) return println(cd)
        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 0 until n &&
                nx in 0 until m &&
                maze[ny][nx] == '1' &&
                !visited[ny][nx]
            ) {
                visited[ny][nx] = true
                queue.addLast(State(ny, nx, cd + 1))
            }
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    maze = List(n) { readln() }
    visited = Array(n) { BooleanArray(m) }

    bfs(n, m)
}
