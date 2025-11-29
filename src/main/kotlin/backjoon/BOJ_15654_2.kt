package backjoon15654_2

lateinit var nums: List<Int>
lateinit var sequence: IntArray
lateinit var visited: BooleanArray

fun backtrack(n: Int, m: Int, d: Int) {
    if (m == d) return println(sequence.joinToString(" "))

    (0 until n).forEach {
        if (!visited[it]) {
            visited[it] = true
            sequence[d] = nums[it]
            backtrack(n, m, d + 1)
            visited[it] = false
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
