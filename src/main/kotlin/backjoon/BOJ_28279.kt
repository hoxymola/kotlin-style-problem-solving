package backjoon28279

fun main() = with(StringBuilder()) {
    val deque = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val op = readln().split(" ").map { it.toInt() }

        when (op[0]) {
            1 -> deque.addFirst(op[1])
            2 -> deque.addLast(op[1])
            3 -> appendLine(deque.removeFirstOrNull() ?: -1)
            4 -> appendLine(deque.removeLastOrNull() ?: -1)
            5 -> appendLine(deque.size)
            6 -> appendLine(if (deque.isEmpty()) 1 else 0)
            7 -> appendLine(deque.firstOrNull() ?: -1)
            8 -> appendLine(deque.lastOrNull() ?: -1)
        }
    }

    println(toString())
}
