/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    var weight = 1
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(' ').map { it.toInt() }
    var ans = 1
    while (n >= arr.sum() * weight) {
        ans++
        weight *= 4
    }
    println(ans)
}
