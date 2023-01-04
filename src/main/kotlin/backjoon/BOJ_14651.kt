/**
 * @author Jaeguk Cho
 */

fun main() {
    var answer = 2L

    val n = readln().toInt()
    if (n == 1) return println(0)
    repeat(n - 2) {
        answer = (answer * 3) % 1000000009
    }

    println(answer)
}
