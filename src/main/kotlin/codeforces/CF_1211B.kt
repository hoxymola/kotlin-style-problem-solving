/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readLine()!!.toLong()
    val selfies = readLine()!!.split(' ').map { it.toLong() }
    val maxSelfy = selfies.maxOf { it }
    println(
        selfies.withIndex()
            .last { it.value == maxSelfy }.index
            + (maxSelfy - 1) * n + 1
    )
}
