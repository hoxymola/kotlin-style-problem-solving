package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val x = readln().split(" ").map { it.toInt() }
    val t = readln().split(" ").map { it.toInt() }
    var answer = maxOf(x.last(), t.last())

    for (i in n - 1 downTo 1) {
        answer += maxOf(x[i] - x[i - 1], t[i - 1] - answer)
    }

    println(answer + x.first())
}
