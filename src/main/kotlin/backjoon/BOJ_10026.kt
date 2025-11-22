package backjoon10026

lateinit var grid: List<String>
lateinit var visited: Array<BooleanArray>
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, 1, 0, -1)

fun dfs(n: Int, sy: Int, sx: Int, isSameRegion: (Char) -> Boolean) {
    val stack = ArrayDeque<Pair<Int, Int>>()

    visited[sy][sx] = true
    stack.addLast(sy to sx)
    while (stack.isNotEmpty()) {
        val (cy, cx) = stack.removeLast()

        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 0 until n &&
                nx in 0 until n &&
                !visited[ny][nx] &&
                isSameRegion(grid[ny][nx])
            ) {
                visited[ny][nx] = true
                stack.addLast(ny to nx)
            }
        }
    }
}

fun main() {
    val n = readln().toInt()
    grid = List(n) { readln() }
    var normalRegions = 0
    var colorBlindRegions = 0

    visited = Array(n) { BooleanArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j]) {
                dfs(n, i, j) { it == grid[i][j] }
                normalRegions++
            }
        }
    }

    visited = Array(n) { BooleanArray(n) }
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j]) {
                dfs(n, i, j) { (grid[i][j] == 'B') == (it == 'B') }
                colorBlindRegions++
            }
        }
    }

    println("$normalRegions $colorBlindRegions")
}
