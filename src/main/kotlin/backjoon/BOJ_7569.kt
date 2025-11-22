package backjoon7569

data class State(
    val z: Int,
    val y: Int,
    val x: Int,
    val d: Int,
)

lateinit var storage: List<List<MutableList<Int>>>
val dz = listOf(1, -1, 0, 0, 0, 0)
val dy = listOf(0, 0, 1, -1, 0, 0)
val dx = listOf(0, 0, 0, 0, 1, -1)

fun bfs(h: Int, n: Int, m: Int) {
    val queue = ArrayDeque<State>()
    var ans = 0

    for (k in 0 until h) {
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (storage[k][i][j] == 1) {
                    queue.addLast(State(k, i, j, 0))
                }
            }
        }
    }
    while (queue.isNotEmpty()) {
        val (cz, cy, cx, cd) = queue.removeFirst()

        ans = maxOf(ans, cd)
        repeat(6) {
            val nz = cz + dz[it]
            val ny = cy + dy[it]
            val nx = cx + dx[it]
            val nd = cd + 1

            if (nz in 0 until h &&
                ny in 0 until n &&
                nx in 0 until m &&
                storage[nz][ny][nx] == 0
            ) {
                storage[nz][ny][nx] = 1
                queue.addLast(State(nz, ny, nx, nd))
            }
        }
    }

    println(ans.takeIf { storage.flatten().flatten().none { it == 0 } } ?: -1)
}

fun main() {
    val (m, n, h) = readln().split(" ").map { it.toInt() }
    storage = List(h) { List(n) { readln().split(" ").map { it.toInt() }.toMutableList() } }

    bfs(h, n, m)
}
