fun main() {
    val deque = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val op = readln().split(" ")

        when (op[0]) {
            "push" -> deque.addLast(op[1].toInt())
            "pop" -> println(deque.removeFirstOrNull() ?: -1)
            "size" -> println(deque.size)
            "empty" -> println(if (deque.isEmpty()) 1 else 0)
            "front" -> println(deque.firstOrNull() ?: -1)
            "back" -> println(deque.lastOrNull() ?: -1)
        }
    }
}
