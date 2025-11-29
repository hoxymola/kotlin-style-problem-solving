fun d(n: Int) = n * 2 % 10000
fun s(n: Int) = (n + 9999) % 10000
fun l(n: Int) = (n % 1000) * 10 + (n / 1000)
fun r(n: Int) = (n % 10) * 1000 + (n / 10)
fun commands(n: Int) = listOf(
    d(n) to 'D',
    s(n) to 'S',
    l(n) to 'L',
    r(n) to 'R',
)

fun bfs(start: Int, target: Int) {
    val queue = ArrayDeque<Pair<Int, String>>()
    val visited = BooleanArray(10000)

    visited[start] = true
    queue.addLast(start to "")
    while (queue.isNotEmpty()) {
        val (current, path) = queue.removeFirst()

        if (current == target) return println(path)
        commands(current).forEach { (next, symbol) ->
            if (!visited[next]) {
                visited[next] = true
                queue.addLast(next to path + symbol)
            }
        }
    }
}

fun main() = repeat(readln().toInt()) {
    val (a, b) = readln().split(" ").map { it.toInt() }

    bfs(a, b)
}
