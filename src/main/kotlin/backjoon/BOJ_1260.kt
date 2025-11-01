package backjoon1260

val graph = List(1001) { mutableListOf<Int>() }

fun dfs(n: Int, v: Int) = with(StringBuilder()) {
    val stack = ArrayDeque<Int>()
    val visited = BooleanArray(n + 1)

    stack.addLast(v)
    while (stack.isNotEmpty()) {
        val cur = stack.removeLast()
        if (visited[cur]) continue

        append("$cur ")
        visited[cur] = true
        graph[cur].sortedDescending().forEach {
            stack.addLast(it)
        }
    }

    println(toString())
}

fun bfs(n: Int, v: Int) = with(StringBuilder()) {
    val queue = ArrayDeque<Int>()
    val visited = BooleanArray(n + 1)

    queue.addLast(v)
    while (queue.isNotEmpty()) {
        val cur = queue.removeFirst()
        if (visited[cur]) continue

        append("$cur ")
        visited[cur] = true
        graph[cur].sorted().forEach {
            queue.addLast(it)
        }
    }

    println(toString())
}

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        graph[a] += b
        graph[b] += a
    }

    dfs(n, v)
    bfs(n, v)
}
