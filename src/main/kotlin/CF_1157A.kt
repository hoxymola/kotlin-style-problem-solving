/**
 * @author Jaeguk Cho
 */

fun main() {
    val reached = HashSet<Int>()
    var n = readln().toInt()
    while (reached.add(n)) n = n.next()
    println(reached.size)
}

fun Int.next() = (this + 1).toString().dropLastWhile { it == '0' }.toInt()
