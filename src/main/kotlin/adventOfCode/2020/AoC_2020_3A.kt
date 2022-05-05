import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun main() = println(
    readLines("2020_3").mapIndexed { i, v ->
        v[i * 3 % v.length] == '#'
    }.count { it }
)
