/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val n: Int) {
        var order = 0
        val connections = mutableListOf<Int>()
    }

    val (n, m, r) = readln().split(' ').map { it.toInt() }
    val graph = List(n) { Node(it) }
    val visited = MutableList(n) { false }
    var order = 1

    repeat(m) {
        readln().split(' ').map { it.toInt() - 1 }.also {
            graph[it[0]].connections.add(it[1])
            graph[it[1]].connections.add(it[0])
        }
    }

    fun dfs(n: Int) {
        if (visited[n]) return
        graph[n].apply {
            visited[n] = true
            this.order = order++
            connections.sortedDescending().forEach { dfs(it) }
        }
    }

    dfs(r - 1)
    println(graph.joinToString("\n") { it.order.toString() })
}
