package backjoon11659

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val nums = readln().split(" ").map { it.toInt() }
    val prefixSum = nums.scan(0) { acc, num -> acc + num }

    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }

        println("${prefixSum[j] - prefixSum[i - 1]}")
    }
}
