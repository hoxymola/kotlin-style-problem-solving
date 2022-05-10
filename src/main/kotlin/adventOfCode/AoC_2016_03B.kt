package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() {
    println(
        readLines("2016_03").map {
            it.trim().split("[ ]+".toRegex()).map { it.toInt() }
        }.flatten().withIndex().groupBy { it.index % 3 }
            .values.flatten().chunked(3).map {
                it.map { it.value }.sorted().let { it[0] + it[1] > it[2] }
            }.count { it }
    )
}
