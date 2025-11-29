package backjoon11969

fun main() {
    val (n, q) = readln().split(" ").map { it.toInt() }
    val ids = List(n) { readln().toInt() }
    val prefixSum1 = ids.runningFold(0) { acc, i -> if (i == 1) acc + 1 else acc }
    val prefixSum2 = ids.runningFold(0) { acc, i -> if (i == 2) acc + 1 else acc }
    val prefixSum3 = ids.runningFold(0) { acc, i -> if (i == 3) acc + 1 else acc }

    repeat(q) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        println("${prefixSum1[b] - prefixSum1[a - 1]} ${prefixSum2[b] - prefixSum2[a - 1]} ${prefixSum3[b] - prefixSum3[a - 1]}")
    }
}
