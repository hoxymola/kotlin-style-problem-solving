package backjoon10025

fun main() {
    val max = 1000000
    val (n, k) = readln().split(" ").map { it.toInt() }
    val nums = MutableList(max + 1) { 0 }
    val size = 2 * k + 1

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        nums[b] = a
    }

    val prefixSum = nums.scan(0) { acc, num -> acc + num }

    println(
        if (max / 2 <= k) prefixSum[max + 1] - prefixSum[0]
        else (size..max + 1).maxOf { prefixSum[it] - prefixSum[it - size] }
    )
}
