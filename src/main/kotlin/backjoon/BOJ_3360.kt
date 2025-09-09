package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    var answer = 0L

    for (x in 0..n / 3) {
        answer = (answer + (n - 3 * x) / 2 + 1) % 1000000
    }

    println(answer)
}
