package backjoon

/**
 * @author Jaeguk Cho
 */

val board = List(5) { readln().split(" ").map { it.toInt() } }
val visited = List(5) { MutableList(5) { false } }
val dy = listOf(-1, 0, 1, 0)
val dx = listOf(0, -1, 0, 1)
var answer = 0

fun main() {
    val (r, c) = readln().split(" ").map { it.toInt() }

    dfs(r, c, 0, 0)

    println(answer)
}

fun dfs(
    y: Int,
    x: Int,
    depth: Int,
    apple: Int,
) {
    visited[y][x] = true
    backTrack(y, x, depth, apple)
    visited[y][x] = false
}

fun backTrack(
    y: Int,
    x: Int,
    depth: Int,
    apple: Int,
) {
    if (depth > 3) return
    if (board[y][x] == 1 && apple == 1) {
        answer = 1
        return
    }

    repeat(4) {
        val ny = y + dy[it]
        val nx = x + dx[it]

        if (ny in 0..4 && nx in 0..4 && !visited[ny][nx] && board[ny][nx] != -1) {
            if (board[y][x] == 1) {
                dfs(ny, nx, depth + 1, apple + 1)
            } else {
                dfs(ny, nx, depth + 1, apple)
            }
        }
    }
}
