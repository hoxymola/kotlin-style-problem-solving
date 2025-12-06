package backjoon16953greedy

fun main() {
    var (a, b) = readln().split(" ").map { it.toLong() }
    var ans = 0

    while (true) {
        when {
            a == b -> return println(ans + 1)
            a > b -> return println(-1)
            b % 10 == 1L -> b /= 10
            b % 2 == 0L -> b /= 2
            else -> return println(-1)
        }
        ans++
    }
}
