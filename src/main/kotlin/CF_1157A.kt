/**
 * @author Jaeguk Cho
 */

fun main() {
    val reached = hashSetOf<Int>()
    var n = readln().toInt()
    while (reached.add(n)) n = f(n)
    println(reached.size)
}

fun f(n: Int) = (n + 1).toString().dropLastWhile { it == '0' }.toInt()
