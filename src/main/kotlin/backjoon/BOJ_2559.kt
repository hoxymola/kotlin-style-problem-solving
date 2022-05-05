/**
 * @author Jaeguk Cho
 */

fun main() {
    val (_, k) = readln().split(' ').map { it.toInt() }
    println(readln().split(' ').map { it.toInt() }.windowed(k) { it.sum() }.maxOf { it })
}
