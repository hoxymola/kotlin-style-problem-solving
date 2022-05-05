/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    val (n, k) = readLine()!!.split(' ').map { it.toInt() }
    val m = n / (1 + k + k * k + k * k * k)
    println("$m ${m * k} ${m * k * k} ${m * k * k * k}")
}
