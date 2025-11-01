package backjoon8979

import kotlin.math.abs

data class Country(
    val num: Int,
    val gold: Int,
    val silver: Int,
    val bronze: Int,
)

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val countries = List(n) { readln().split(" ").map { it.toInt() } }
        .map { Country(it[0], it[1], it[2], it[3]) }

    countries.sortedWith(
        compareByDescending(Country::gold)
            .thenByDescending(Country::silver)
            .thenByDescending(Country::bronze)
            .thenBy { abs(it.num - k) }
    ).indexOfFirst { it.num == k }
        .also { println(it + 1) }
}
