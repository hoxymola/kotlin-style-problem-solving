fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    val deque = ArrayDeque<Int>()
    val stackSequence = List(n) { readln().toInt() }
    var stackIndex = 0
    var number = 1

    while (stackIndex < n || number <= n) {
        when {
            stackIndex < n && deque.lastOrNull() == stackSequence[stackIndex] -> {
                appendLine("-")
                deque.removeLast()
                stackIndex++
            }

            number <= n -> {
                appendLine("+")
                deque.addLast(number++)
            }

            else -> return println("NO")
        }
    }

    println(toString())
}
