package backjoon2118

fun main() {
    val n = readln().toInt()
    val distances = List(n) { readln().toInt() }
    val prefixSum = distances.runningFold(0, Int::plus)

    var ans = 0
    var l = 0
    var r = 1
    while (r < n) {
        val t1 = prefixSum[r] - prefixSum[l]
        val t2 = prefixSum[n] - t1

        ans = maxOf(ans, minOf(t1, t2))

        if (t1 < t2) r++
        else l++
    }

    println(ans)
}
