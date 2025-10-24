package backjoon15654

var nums = listOf<Int>()
val visited = MutableList(9) { false }

fun backTrack(
    n: Int,
    k: Int,
    list: List<Int>,
) {
    if (k == list.size) {
        return println(list.joinToString(" "))
    }

    for (i in 0 until n) {
        if (!visited[i]) {
            visited[i] = true
            backTrack(n, k, list + nums[i])
            visited[i] = false
        }
    }
}

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    nums = readln().split(" ").map { it.toInt() }

    backTrack(n, m, listOf())
}
