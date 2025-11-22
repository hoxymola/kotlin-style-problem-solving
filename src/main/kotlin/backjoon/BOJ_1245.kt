package backjoon1245

lateinit var farm: List<List<Int>>
lateinit var visited: Array<BooleanArray>
val stack = ArrayDeque<Pair<Int, Int>>()
val dy = listOf(-1, -1, 0, 1, 1, 1, 0, -1)
val dx = listOf(0, 1, 1, 1, 0, -1, -1, -1)
var ans = 0

fun dfs(n: Int, m: Int, sy: Int, sx: Int) {
    var isPeek = true

    visited[sy][sx] = true
    stack.addLast(sy to sx)
    while (stack.isNotEmpty()) {
        val (cy, cx) = stack.removeLast()

        repeat(8) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 0 until n && nx in 0 until m) {
                if (farm[cy][cx] < farm[ny][nx]) isPeek = false
                if (farm[cy][cx] == farm[ny][nx] && !visited[ny][nx]) {
                    visited[ny][nx] = true
                    stack.addLast(ny to nx)
                }
            }
        }
    }

    if (isPeek) ans++
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    farm = List(n) { readln().split(" ").map { it.toInt() } }
    visited = Array(n) { BooleanArray(m) }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (!visited[i][j]) {
                dfs(n, m, i, j)
            }
        }
    }

    println(ans)
}
