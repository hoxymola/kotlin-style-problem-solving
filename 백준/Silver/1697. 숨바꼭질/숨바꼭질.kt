val queue = ArrayDeque<Pair<Int, Int>>()
val visited = BooleanArray(100001)
val mul = listOf(1, 1, 2)
val add = listOf(-1, 1, 0)

fun bfs(k: Int, sp: Int) {
    visited[sp] = true
    queue.addLast(sp to 0)
    while (queue.isNotEmpty()) {
        val (cp, cd) = queue.removeFirst()

        if (cp == k) return println(cd)
        repeat(3) {
            val np = mul[it] * cp + add[it]

            if (np in 0..100000 && !visited[np]) {
                visited[np] = true
                queue.addLast(np to cd + 1)
            }
        }
    }
}

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }

    bfs(k, n)
}
