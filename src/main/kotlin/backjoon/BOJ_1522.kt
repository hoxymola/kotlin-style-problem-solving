package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val s = readln()
    val a = s.count { it == 'a' }.also { if (it == 0) return println(0) }
    var answer = 1000

    (s + s).windowed(a) { window ->
        answer = minOf(answer, window.count { it == 'b' })
    }

    println(answer)
}
