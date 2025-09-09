package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val queue = mutableListOf<Int>()

    while (true) {
        val info = readln().toInt()
        if (info == -1) break

        when {
            info == 0 -> queue.removeFirst()
            queue.size != n -> queue.add(info)
        }
    }

    println(
        if (queue.isEmpty()) "empty"
        else queue.joinToString(" ")
    )
}
