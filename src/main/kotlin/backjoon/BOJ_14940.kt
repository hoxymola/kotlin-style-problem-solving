package backjoon14940

data class State(
    val y: Int,
    val x: Int,
    val d: Int,
)

lateinit var map: List<List<Int>>
lateinit var visited: Array<BooleanArray>
lateinit var dist: List<MutableList<Int>>
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, 1, 0, -1)

fun bfs(n: Int, m: Int, sy: Int, sx: Int) {
    val queue = ArrayDeque<State>()

    visited[sy][sx] = true
    queue.addLast(State(sy, sx, 0))
    while (queue.isNotEmpty()) {
        val (cy, cx, cd) = queue.removeFirst()

        dist[cy][cx] = cd
        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]
            val nd = cd + 1

            if (ny in 0 until n &&
                nx in 0 until m &&
                map[ny][nx] != 0 &&
                !visited[ny][nx]
            ) {
                visited[ny][nx] = true
                queue.addLast(State(ny, nx, nd))
            }
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    map = List(n) { readln().split(" ").map { it.toInt() } }
    visited = Array(n) { BooleanArray(m) }
    dist = List(n) { i -> MutableList(m) { j -> if (map[i][j] == 0) 0 else -1 } }
    val (sy, sx) = map.flatten().indexOfFirst { it == 2 }
        .let { it / m to it % m }

    bfs(n, m, sy, sx)

    dist.forEach { println(it.joinToString(" ")) }
}
