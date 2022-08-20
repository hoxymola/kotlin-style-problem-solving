/**
 * @author Jaeguk Cho
 */

fun main() {
    val (_, k) = readln().split(' ').map { it.toInt() }
    println(readln().split(' ').map { it.toInt() }.sortedDescending()[k - 1])
}
