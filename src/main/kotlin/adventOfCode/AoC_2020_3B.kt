import adventOfCode.readLines

/**
 * @author Jaeguk Cho
 */

fun List<String>.count(a: Int, b: Int, c: Int): Long =
    mapIndexed { i, v ->
        i % a == 0 && v[i * b / c % v.length] == '#'
    }.count { it }.toLong()

fun main() = println(
    with(readLines("2020_3")) {
        listOf(
            count(1, 1, 1),
            count(1, 3, 1),
            count(1, 5, 1),
            count(1, 7, 1),
            count(2, 1, 2)
        ).reduce(Long::times)
    }
)
