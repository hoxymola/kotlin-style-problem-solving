package backjoon2606

fun main() {
    val n = readln().toInt()
    val graph = List(n + 1) { mutableListOf<Int>() }
    val visited = MutableList(n + 1) { false }
    val stack = ArrayDeque<Int>()
    var ans = 0

    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        graph[a] += b
        graph[b] += a
    }

    visited[1] = true
    stack.addLast(1)
    while (stack.isNotEmpty()) {
        val cur = stack.removeLast()

        ans++
        for (node in graph[cur]) {
            if (!visited[node]) {
                visited[node] = true
                stack.addLast(node)
            }
        }
    }

    println(ans - 1)
}
