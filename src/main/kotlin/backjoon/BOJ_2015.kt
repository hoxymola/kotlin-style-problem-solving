/**
 * @author Jaeguk Cho
 */

fun main() {
    val (_, k) = readln().split(' ').map { it.toLong() }
    val arr = readln().split(' ').map { it.toLong() }
    val map = mutableMapOf<Long, Long>()
    var ans = 0L

    arr.runningReduce { acc, i -> acc + i }.forEach {
        if (it == k) ans++
        ans += map[it - k] ?: 0
        map[it] = map[it]?.let { it + 1 } ?: 1
    }
    println(ans)
}
