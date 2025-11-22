package backjoon17073

fun main() {
    val (n, w) = readln().split(" ").map { it.toInt() }
    val graph = List(n + 1) { mutableListOf<Int>() }

    repeat(n - 1) {
        val (u, v) = readln().split(" ").map { it.toInt() }

        graph[u] += v
        graph[v] += u
    }

    println(w.toDouble() / graph.drop(2).count { it.size == 1 })
}
