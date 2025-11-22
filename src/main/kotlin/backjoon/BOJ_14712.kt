package backjoon14712

val nmnm = Array(26) { BooleanArray(26) }
val dy = listOf(-1, -1, 0)
val dx = listOf(-1, 0, -1)
var ans = 0

fun backTrack(n: Int, m: Int, k: Int) {
    if (n * m == k) return run { ans++ }

    val cy = k / m + 1
    val cx = k % m + 1

    nmnm[cy][cx] = false
    backTrack(n, m, k + 1)

    var valid = false

    repeat(3) {
        val ny = cy + dy[it]
        val nx = cx + dx[it]

        if (!nmnm[ny][nx]) valid = true
    }
    if (valid) {
        nmnm[cy][cx] = true
        backTrack(n, m, k + 1)
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    backTrack(n, m, 0)

    println(ans)
}
