package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    var (a, b) = readln().split(" ").map { it.toInt() }

    while (a != b) {
        if (a > b) a /= 2
        else b /= 2
    }

    println(a * 10)
}
