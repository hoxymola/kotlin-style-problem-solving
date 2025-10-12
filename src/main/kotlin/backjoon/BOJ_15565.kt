package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (_, k) = readln().split(" ").map { it.toInt() }
    var answer = 1000001
    val ryan = readln().split(" ").map { it.toInt() }
        .withIndex()
        .filter { it.value == 1 }
        .map { it.index }

    for (i in 0..ryan.size - k) {
        answer = minOf(answer, ryan[i + k - 1] - ryan[i] + 1)
    }

    println(if (answer == 1000001) -1 else answer)
}
