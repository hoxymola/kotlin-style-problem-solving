package backjoon1389

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = List(n + 1) { r -> MutableList(n + 1) { c -> if (r == c) 0 else Int.MAX_VALUE / 101 } }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        graph[a][b] = 1
        graph[b][a] = 1
    }

    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                graph[i][j] = minOf(graph[i][j], graph[i][k] + graph[k][j])
            }
        }
    }

    println((1..n).minByOrNull { graph[it].sum() })
}
