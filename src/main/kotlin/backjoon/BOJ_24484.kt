/**
 * @author Jaeguk Cho
 */

fun main() {
    data class Node(val no: Int) {
        var depth = -1L
        var order = 0L
        val connections = mutableListOf<Int>()
    }

    val (n, m, r) = readln().split(' ').map { it.toInt() }
    val graph = List(n) { Node(it) }
    val visited = MutableList(n) { false }
    var order = 1L

    repeat(m) {
        readln().split(' ').map { it.toInt() - 1 }.also {
            graph[it[0]].connections.add(it[1])
            graph[it[1]].connections.add(it[0])
        }
    }

    fun dfs(n: Int, depth: Long) {
        if (visited[n]) return
        graph[n].apply {
            visited[no] = true
            this.depth = depth
            this.order = order++
            connections.sorted().forEach { dfs(it, depth + 1) }
        }
    }

    dfs(r - 1, 0)
    println(graph.sumOf { it.depth * it.order })
}
