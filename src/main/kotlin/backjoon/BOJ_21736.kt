package backjoon21736

lateinit var campus: List<String>
lateinit var visited: Array<BooleanArray>
val stack = ArrayDeque<Pair<Int, Int>>()
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, 1, 0, -1)
var ans = 0

fun dfs(n: Int, m: Int, sy: Int, sx: Int) {
    visited[sy][sx] = true
    stack.addLast(sy to sx)
    while (stack.isNotEmpty()) {
        val (cy, cx) = stack.removeLast()

        if (campus[cy][cx] == 'P') ans++
        repeat(4) {
            val ny = cy + dy[it]
            val nx = cx + dx[it]

            if (ny in 0 until n && nx in 0 until m && campus[ny][nx] != 'X' && !visited[ny][nx]) {
                visited[ny][nx] = true
                stack.addLast(ny to nx)
            }
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    campus = List(n) { readln() }
    visited = Array(n) { BooleanArray(m) }
    val (y, x) = campus.joinToString("").indexOf('I').let { (it / m) to (it % m) }

    dfs(n, m, y, x)

    println(ans.takeIf { it > 0 } ?: "TT")
}
