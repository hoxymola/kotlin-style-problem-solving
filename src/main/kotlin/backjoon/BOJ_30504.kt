package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }.sorted()
    val answer = MutableList(n) { 0 }

    a.withIndex().sortedBy { it.value }.forEachIndexed { i, v ->
        answer[v.index] = b[i]
    }

    println(
        if (a.zip(answer).any { (a, ans) -> a > ans }) -1
        else answer.joinToString(" ")
    )
}
