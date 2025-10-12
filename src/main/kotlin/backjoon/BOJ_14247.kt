package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val h = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }
    var answer = 0L

    h.zip(a).sortedBy { it.second }.forEachIndexed { i, (h, a) ->
        answer += h + (a * i)
    }

    println(answer)
}
