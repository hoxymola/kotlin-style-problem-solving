fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val deque = ArrayDeque((1..n).toList())
    val answer = mutableListOf<Int>()

    while (deque.isNotEmpty()) {
        repeat(k - 1) { deque.addLast(deque.removeFirst()) }
        answer.add(deque.removeFirst())
    }

    println(answer.joinToString(", ", "<", ">"))
}
