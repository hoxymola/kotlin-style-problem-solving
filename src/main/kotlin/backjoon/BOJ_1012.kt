package backjoon

fun main() = repeat(readln().toInt()) {
    val (m, n, k) = readln().split(" ").map { it.toInt() }
    val field = Array(n) { BooleanArray(m) { false } }
    val stack = ArrayDeque<Pair<Int, Int>>()
    val visited = Array(n) { BooleanArray(m) { false } }
    val dy = listOf(-1, 0, 1, 0)
    val dx = listOf(0, -1, 0, 1)
    var ans = 0

    repeat(k) {
        val (x, y) = readln().split(" ").map { it.toInt() }

        field[y][x] = true
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (field[i][j] && !visited[i][j]) {
                ans++
                visited[i][j] = true
                stack.addLast(i to j)
                while (stack.isNotEmpty()) {
                    val (cy, cx) = stack.removeLast()

                    (0..3).forEach {
                        val ny = cy + dy[it]
                        val nx = cx + dx[it]

                        if (ny in 0 until n && nx in 0 until m && field[ny][nx] && !visited[ny][nx]) {
                            visited[ny][nx] = true
                            stack.addLast(ny to nx)
                        }
                    }
                }
            }
        }
    }

    println(ans)
}
