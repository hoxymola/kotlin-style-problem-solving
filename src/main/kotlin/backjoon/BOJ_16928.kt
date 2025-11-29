package backjoon16928

val board = MutableList(106) { it }
val visited = BooleanArray(101)

fun bfs() {
    val queue = ArrayDeque<Pair<Int, Int>>()

    visited[1] = true
    queue.addLast(1 to 0)
    while (queue.isNotEmpty()) {
        val (cp, cd) = queue.removeFirst()

        if (cp == 100) return println(cd)

        (1..6).forEach {
            val np = board[cp + it]
            val nd = cd + 1

            if (np <= 100 && !visited[np]) {
                visited[np] = true
                queue.addLast(np to nd)
            }
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    repeat(n + m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        board[a] = b
    }

    bfs()
}
