/**
 * @author Jaeguk Cho
 */

fun main() {
    val fib = generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.elementAt(readln().toInt() - 1)
    println("${fib.first} ${fib.second}")
}
