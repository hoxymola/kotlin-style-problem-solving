package backjoon21938

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val screen = Array(n) { readln().split(" ").map { it.toDouble() } }
    val t = readln().toDouble()
    val newScreen = Array(n) { BooleanArray(m) }

    screen.forEachIndexed { i, r ->
        r.chunked(3).forEachIndexed { j, c ->
            newScreen[i][j] = c.sum() >= 3 * t
        }
    }

    val dy = listOf(-1, 0, 1, 0)
    val dx = listOf(0, -1, 0, 1)
    val queue = ArrayDeque<Pair<Int, Int>>()
    var ans = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (newScreen[i][j]) {
                ans++
                newScreen[i][j] = false
                queue.addLast(i to j)
                while (queue.isNotEmpty()) {
                    val (cy, cx) = queue.removeFirst()

                    (0..3).forEach {
                        val ny = cy + dy[it]
                        val nx = cx + dx[it]

                        if (ny in (0 until n) && nx in (0 until m) && newScreen[ny][nx]) {
                            newScreen[ny][nx] = false
                            queue.addLast(ny to nx)
                        }
                    }
                }
            }
        }
    }

    println(ans)
}
