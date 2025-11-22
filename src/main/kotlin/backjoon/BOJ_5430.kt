package backjoon5430

fun main() = repeat(readln().toInt()) {
    val p = readln()
    val n = readln().toInt()
    val t = readln()
    val x = when (n) {
        0 -> emptyList()
        else -> t.drop(1).dropLast(1).split(",").map { it.toInt() }
    }
    var r = false
    val deque = ArrayDeque(x)

    p.forEach {
        when (it) {
            'R' -> r = !r
            'D' -> when {
                deque.isEmpty() -> return@repeat println("error")
                r -> deque.removeLast()
                !r -> deque.removeFirst()
            }
        }
    }

    println(
        when (r) {
            false -> deque
            true -> deque.reversed()
        }.joinToString(",", "[", "]")
    )
}
