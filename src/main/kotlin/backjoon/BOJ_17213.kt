package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val m = readln().toInt()
    var answer = 1L

    repeat(n - 1) {
        answer *= (m - 1 - it)
    }
    repeat(n - 1) {
        answer /= (it + 1)
    }

    println(answer)
}
