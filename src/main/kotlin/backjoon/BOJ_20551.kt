package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = List(n) { readln().toInt() }.sorted()

    repeat(m) {
        val d = readln().toInt()
        var left = 0
        var right = n - 1
        var answer = -1
        while (left <= right) {
            val mid = (left + right) / 2

            if (d <= a[mid]) {
                if (d == a[mid]) answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        println(answer)
    }
}
