fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val deque = ArrayDeque((1..n).toList())
    val ans = mutableListOf<Int>()

    while (deque.isNotEmpty()) {
        repeat(k - 1) { deque.addLast(deque.removeFirst()) }
        ans.add(deque.removeFirst())
    }

    println(ans.joinToString(", ", "<", ">"))
}
