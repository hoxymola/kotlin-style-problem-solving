package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val words = List(n) { readln() }

    words.distinct().sortedWith { a, b ->
        if (a.length != b.length) {
            a.length - b.length
        } else {
            a.compareTo(b)
        }
    }.forEach { println(it) }
}
