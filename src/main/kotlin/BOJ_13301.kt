/**
 * @author Jaeguk Cho
 */

fun main() = generateSequence(Pair(0L, 1L)) { Pair(it.second, it.first + it.second) }
    .elementAt(readLine()!!.toInt() - 1)
    .run { println(4 * this.second + 2 * this.first) }
