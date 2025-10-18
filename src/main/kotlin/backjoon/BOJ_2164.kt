fun main() {
    val n = readln().toInt()
    val deque = ArrayDeque((1..n).toList())

    while (deque.size > 1) {
        deque.removeFirst()
        deque.addLast(deque.removeFirst())
    }

    println(deque.first())
}
