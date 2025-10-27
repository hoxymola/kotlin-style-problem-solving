package backjoon2785

import java.util.*

fun main() {
    val n = readln().toInt()
    val chains = readln().split(" ").map { it.toLong() }.sorted()
    val deque = ArrayDeque(chains)
    var ans = 0L

    while (true) {
        val t = deque.removeFirst()

        if (t < deque.size) {
            var sum = 0L

            ans += t
            repeat(t.toInt() + 1) { sum += deque.removeLast() }
            deque.addLast(sum)
        } else {
            return println(ans + deque.size)
        }
    }
}
