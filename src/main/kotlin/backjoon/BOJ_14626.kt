package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val isbn = readln().map { "$it" }
    val m = isbn.last().toInt()
    val digits = listOf(1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3)
    var sum = 0
    var x = 0

    digits.forEachIndexed { i, digit ->
        if (isbn[i] != "*") {
            sum += isbn[i].toInt() * digit
        } else {
            x = digit
        }
    }

    for (answer in 0..9) {
        if (m == (10 - (sum + answer * x) % 10) % 10) {
            println(answer)
            return
        }
    }
}
