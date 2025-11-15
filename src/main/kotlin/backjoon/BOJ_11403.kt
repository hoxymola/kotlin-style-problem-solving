package backjoon11403

fun main() {
    val n = readln().toInt()
    val graph = Array(n) { readln().split(" ").map { it.toInt() }.toIntArray() }

    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                graph[i][j] = graph[i][j] or (graph[i][k] and graph[k][j])
            }
        }
    }

    graph.forEach { println(it.joinToString(" ")) }
}
