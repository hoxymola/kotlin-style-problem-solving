/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    var ans = 0L
    var sum = 0L
    readln().trim().split(' ').map { it.toLong() }.forEach {
        ans += it * sum
        sum += it
    }
    println(ans)
}
