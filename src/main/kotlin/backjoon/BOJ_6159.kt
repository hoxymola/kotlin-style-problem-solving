package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, s) = readln().split(" ").map { it.toInt() }
    val cows = List(n) { readln().toInt() }.sorted()
    var answer = 0

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (cows[i] + cows[j] <= s) answer++
            else break
        }
    }

    println(answer)
}
