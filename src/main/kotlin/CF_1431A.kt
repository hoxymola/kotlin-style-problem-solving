/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    readLine()
    println(
        readLine()!!.split(' ').map { it.toLong() }
            .sortedDescending()
            .withIndex()
            .maxOf { (it.index + 1) * it.value }
    )
}
