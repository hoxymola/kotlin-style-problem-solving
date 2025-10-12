package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val grades = List(n) { readln().split(" ").let { it.last().toInt() to it.first() } }.distinctBy { it.first }
    val sb = StringBuilder()

    repeat(m) {
        val score = readln().toInt()
        var answer = ""

        var left = 0
        var right = grades.lastIndex
        while (left <= right) {
            val mid = (left + right) / 2

            if (score <= grades[mid].first) {
                answer = grades[mid].second
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        sb.appendLine(answer)
    }

    println(sb.toString())
}
