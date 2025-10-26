package backjoon1260

val graph = Array(1001) { BooleanArray(1001) }

fun dfs(n: Int, v: Int) = with(StringBuilder()) {
    val stack = ArrayDeque<Int>()
    val visited = BooleanArray(n + 1)

    stack.addLast(v)
    while (stack.isNotEmpty()) {
        val cur = stack.removeLast()
        if (visited[cur]) continue

        append("$cur ")
        visited[cur] = true
        (1..n).reversed().forEach {
            if (graph[cur][it]) {
                stack.addLast(it)
            }
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
        (1..n).forEach {
            if (graph[cur][it]) {
                queue.addLast(it)
            }
        }
    }

    println(toString())
}

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        graph[a][b] = true
        graph[b][a] = true
    }

    dfs(n, v)
    bfs(n, v)
}
