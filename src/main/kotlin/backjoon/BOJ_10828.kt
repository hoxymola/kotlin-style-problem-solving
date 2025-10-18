fun main() {
    val deque = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val command = readln().split(" ")

        when (command[0]) {
            "push" -> deque.addLast(command[1].toInt())
            "pop" -> println(deque.removeLastOrNull() ?: -1)
            "size" -> println(deque.size)
            "empty" -> println(if ( deque.isEmpty()) 1 else 0)
            "top" -> println(deque.lastOrNull() ?: -1)
        }
    }
}
