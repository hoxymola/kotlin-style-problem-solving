fun main() = repeat(readln().toInt()) {
    val deque = ArrayDeque<Char>()

    readln().forEach {
        if (it == ')' && deque.lastOrNull() == '(') deque.removeLast()
        else deque.addLast(it)
    }

    println(
        if (deque.isEmpty()) "YES"
        else "NO"
    )
}
