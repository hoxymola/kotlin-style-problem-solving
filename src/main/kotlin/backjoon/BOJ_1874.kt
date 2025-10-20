fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    val deque = ArrayDeque<Int>()
    val stackSequence = List(n) { readln().toInt() }
    var stackIndex = 0
    var num = 1

    while (stackIndex < n || num <= n) {
        when {
            stackIndex < n && deque.lastOrNull() == stackSequence[stackIndex] -> {
                appendLine("-")
                deque.removeLast()
                stackIndex++
            }

            num <= n -> {
                appendLine("+")
                deque.addLast(num++)
            }

            else -> return println("NO")
        }
    }

    println(toString())
}
