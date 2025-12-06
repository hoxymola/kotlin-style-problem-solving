package backjoon9024

import kotlin.math.abs

fun main() = repeat(readln().toInt()) {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }.sorted()
    var min = Int.MAX_VALUE
    var cnt = 0

    (0..n - 2).forEach {
        var localMin = Int.MAX_VALUE
        var low = it + 1
        var high = n - 1
        while (low + 1 < high) {
            val mid = (low + high) / 2

            if (a[it] + a[mid] <= k) {
                low = mid
            } else {
                high = mid
            }
        }

        localMin = minOf(localMin, abs(a[it] + a[low] - k))

        low = it + 1
        high = n - 1
        while (low + 1 < high) {
            val mid = (low + high) / 2

            if (k <= a[it] + a[mid]) {
                high = mid
            } else {
                low = mid
            }
        }

        localMin = minOf(localMin, abs(a[it] + a[high] - k))

        when {
            localMin == min -> cnt++
            localMin < min -> {
                min = localMin
                cnt = 1
            }
        }
    }

    println(cnt)
}
