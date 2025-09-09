package backjoon

import kotlin.math.pow

/**
 * @author Jaeguk Cho
 */

fun love(n: Long): Long {
    val reversed = n.toString().map { '9' - it }.joinToString("")

    return n * reversed.toLong()
}

fun main() = repeat(readln().toInt()) {
    val n = readln()
    val digits = n.length
    val max = 5 * 10.0.pow(digits - 1) - 1

    println(
        if (n.toLong() < max.toLong()) love(n.toLong())
        else love(max.toLong())
    )
}
