/**
 * @author Jaeguk Cho
 */

fun main() {
    readLine()
    readLine()!!.split(' ').map { it.toInt() }
        .withIndex()
        .distinctBy { it.value }
        .sortedBy { it.value }
        .map { it.index + 1 }
}
