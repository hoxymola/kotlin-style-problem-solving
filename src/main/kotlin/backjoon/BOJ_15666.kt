package backjoon15666

lateinit var nums: List<Int>
lateinit var sequence: IntArray

fun backtrack(n: Int, m: Int, d: Int, s: Int) {
    if (m == d) return println(sequence.joinToString(" "))

    (s until n).forEach {
        sequence[d] = nums[it]
        backtrack(n, m, d + 1, it)
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    nums = readln().split(" ").map { it.toInt() }.sorted().distinct()
    sequence = IntArray(m)

    backtrack(nums.size, m, 0, 0)
}
