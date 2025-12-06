package backjoon15663

lateinit var nums: List<Int>
lateinit var sequence: IntArray
lateinit var visited: BooleanArray

fun backtrack(n: Int, m: Int, d: Int) {
    if (m == d) return println(sequence.joinToString(" "))

    var last = -1

    nums.forEachIndexed { i, num ->
        if (!visited[i] && last != num) {
            visited[i] = true
            last = num
            sequence[d] = num
            backtrack(n, m, d + 1)
            visited[i] = false
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    nums = readln().split(" ").map { it.toInt() }.sorted()
    sequence = IntArray(m)
    visited = BooleanArray(n)

    backtrack(n, m, 0)
}
