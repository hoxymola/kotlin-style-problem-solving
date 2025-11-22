package backjoon2667

import java.util.PriorityQueue

lateinit var map: List<String>
lateinit var visited: Array<BooleanArray>
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, 1, 0, -1)
val pq = PriorityQueue<Int>()

fun dfs(n: Int, sy: Int, sx: Int) {
    val stack = ArrayDeque<Pair<Int, Int>>()
    var cnt = 0

    visited[sy][sx] = true
    stack.addLast(sy to sx)
    while (stack.isNotEmpty()) {
        val (cy, cx) = stack.removeLast()

        cnt++
        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 0 until n &&
                nx in 0 until n &&
                map[ny][nx] == '1' &&
                !visited[ny][nx]
            ) {
                visited[ny][nx] = true
                stack.addLast(ny to nx)
            }
        }
    }

    pq += cnt
}

fun main() {
    val n = readln().toInt()
    map = List(n) { readln() }
    visited = Array(n) { BooleanArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] == '1' && !visited[i][j]) dfs(n, i, j)
        }
    }

    println(pq.size)
    while (pq.isNotEmpty()) {
        println(pq.poll())
    }
}
