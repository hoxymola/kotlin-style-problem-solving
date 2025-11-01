fun main() = repeat(readln().toInt()) {
    val stack = ArrayDeque<Char>()

    readln().forEach {
        if (it == ')' && stack.lastOrNull() == '(') stack.removeLast()
        else stack.addLast(it)
    }

    println(
        if (stack.isEmpty()) "YES"
        else "NO"
    )
}
