package backjoon.include

/**
 * @author Jaeguk Cho
 */

fun main() {
    val q = readln().toInt()
    var start = -1000000000000000000
    var end = 1000000000000000000
    var answer = 123456

    repeat(q) {
        val (x, d) = readln().split(" ").let { (a, b) -> a.toLong() to b.first() }


        when (d) {
            '^' -> start = maxOf(start, x + 1)
            'v' -> end = minOf(end, x - 1)
        }

        if (start == end) answer = minOf(answer, it + 1)
        if (end < start) return println("Paradox!\n${it + 1}")
    }

    println(
        if (answer == 123456) "Hmm..."
        else "I got it!\n$answer"
    )
}
