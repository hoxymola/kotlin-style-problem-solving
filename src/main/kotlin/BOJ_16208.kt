/**
 * @author Jaeguk Cho
 */

fun main() {
    readLine()
    var ans = 0L
    var sum = 0L
    readLine()!!.trim().split(' ').map { it.toLong() }.forEach {
        ans += it * sum
        sum += it
    }
    println(ans)
}
