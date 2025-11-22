package backjoon2606

lateinit var graph: List<MutableList<Int>>
lateinit var visited: BooleanArray
var ans = -1

fun dfs(s: Int) {
    val stack = ArrayDeque<Int>()

    visited[s] = true
    stack.addLast(s)
    while (stack.isNotEmpty()) {
        val cur = stack.removeLast()

        ans++
        graph[cur].forEach {
            if (!visited[it]) {
                visited[it] = true
                stack.addLast(it)
            }
        }
    }
}

fun main() {
    val n = readln().toInt()
    graph = List(n + 1) { mutableListOf() }
    visited = BooleanArray(n + 1)

    repeat(readln().toInt()) {
        val (u, v) = readln().split(" ").map { it.toInt() }

        graph[u] += v
        graph[v] += u
    }

    dfs(1)

    println(ans)
}
