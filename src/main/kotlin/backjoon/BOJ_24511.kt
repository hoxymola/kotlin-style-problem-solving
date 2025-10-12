package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }
    val m = readln().toInt()
    val answer = mutableListOf<Int>()

    answer.addAll(a.zip(b).filter { it.first == 0 }.reversed().map { it.second })
    answer.addAll(readln().split(" ").map { it.toInt() })

    println(answer.take(m).joinToString(" "))
}
