package backjoon1012

lateinit var field: Array<BooleanArray>
val stack = ArrayDeque<Pair<Int, Int>>()
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, -1, 0, 1)
var ans = 0

fun dfs(n: Int, m: Int, sy: Int, sx: Int) {
    field[sy][sx] = false
    stack.addLast(sy to sx)
    while (stack.isNotEmpty()) {
        val (cy, cx) = stack.removeLast()

        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 1..n && nx in 1..m && field[ny][nx]) {
                field[ny][nx] = false
                stack.addLast(ny to nx)
            }
        }
    }
}

fun main() = repeat(readln().toInt()) {
    val (m, n, k) = readln().split(" ").map { it.toInt() }
    field = Array(n + 1) { BooleanArray(m + 1) }
    ans = 0

    repeat(k) {
        val (x, y) = readln().split(" ").map { it.toInt() + 1 }

        field[y][x] = true
    }

    for (i in 1..n) {
        for (j in 1..m) {
            if (field[i][j]) {
                dfs(n, m, i, j)
                ans++
            }
        }
    }

    println(ans)
}
