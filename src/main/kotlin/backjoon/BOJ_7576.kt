package backjoon7576

data class State(
    val y: Int,
    val x: Int,
    val d: Int,
)

lateinit var storage: List<MutableList<Int>>
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, -1, 0, 1)

fun bfs(n: Int, m: Int) {
    val queue = ArrayDeque<State>()
    var ans = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (storage[i][j] == 1) {
                queue.addLast(State(i, j, 0))
            }
        }
    }
    while (queue.isNotEmpty()) {
        val (cy, cx, cd) = queue.removeFirst()

        ans = maxOf(ans, cd)
        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]
            val nd = cd + 1

            if (ny in 0 until n &&
                nx in 0 until m &&
                storage[ny][nx] == 0
            ) {
                storage[ny][nx] = 1
                queue.addLast(State(ny, nx, nd))
            }
        }
    }

    println(ans.takeIf { storage.flatten().none { it == 0 } } ?: -1)
}

fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    storage = List(n) { readln().split(" ").map { it.toInt() }.toMutableList() }

    bfs(n, m)
}
