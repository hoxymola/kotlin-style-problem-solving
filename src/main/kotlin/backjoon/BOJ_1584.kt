package backjoon1584

// https://justicehui.github.io/medium-algorithm/2018/08/30/01BFS/

data class State(
    val y: Int,
    val x: Int,
    val d: Int,
)

val area = Array(501) { IntArray(501) { 0 } }
val visited = Array(501) { BooleanArray(501) }
val deque = ArrayDeque<State>()
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, 1, 0, -1)

fun bfs() {
    visited[0][0] = true
    deque.addLast(State(0, 0, 0))
    while (deque.isNotEmpty()) {
        val (cy, cx, cd) = deque.removeFirst()

        if ((cy to cx) == (500 to 500)) return println(cd)
        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 0..500 &&
                nx in 0..500 &&
                area[ny][nx] != 2 &&
                !visited[ny][nx]
            ) {
                visited[ny][nx] = true
                when (area[ny][nx]) {
                    0 -> deque.addFirst(State(ny, nx, cd))
                    1 -> deque.addLast(State(ny, nx, cd + 1))
                }
            }
        }
    }

    println(-1)
}

fun main() {
    repeat(readln().toInt()) {
        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }

        for (i in minOf(y1, y2)..maxOf(y1, y2)) {
            for (j in minOf(x1, x2)..maxOf(x1, x2)) {
                area[i][j] = 1
            }
        }
    }
    repeat(readln().toInt()) {
        val (x1, y1, x2, y2) = readln().split(" ").map { it.toInt() }

        for (i in minOf(y1, y2)..maxOf(y1, y2)) {
            for (j in minOf(x1, x2)..maxOf(x1, x2)) {
                area[i][j] = 2
            }
        }
    }

    bfs()
}
