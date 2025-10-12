package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val cats = readln().split(" ").map { it.toInt() }.sorted()
    var (l, r) = 0 to n - 1
    var answer = 0

    while (l < r) {
        if (cats[l] + cats[r] <= k) {
            answer++
            l++
        }
        r--
    }

    println(answer)
}
