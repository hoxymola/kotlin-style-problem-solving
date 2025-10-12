package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }
    val count = MutableList(100001) { 0 }
    var answer = 0
    var l = 0
    var r = 0

    while (l < n && r < n) {
        if (count[a[r]] == k) count[a[l++]]--
        else count[a[r++]]++
        answer = maxOf(answer, r - l)
    }

    println(answer)
}
