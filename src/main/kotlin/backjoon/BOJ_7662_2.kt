package backjoon7662_2

import java.util.*

fun main() = repeat(readln().toInt()) {
    val treeMap = TreeMap<Int, Int>()

    repeat(readln().toInt()) {
        val (op, x) = readln().split(" ").let { it[0] to it[1].toInt() }

        when (op) {
            "I" -> treeMap[x] = treeMap.getOrDefault(x, 0) + 1
            "D" -> if (treeMap.isNotEmpty()) {
                val key = if (x > 0) treeMap.lastKey() else treeMap.firstKey()

                treeMap.computeIfPresent(key) { _, cnt -> (cnt - 1).takeIf { it > 0 } }
            }
        }
    }

    println(
        if (treeMap.isEmpty()) "EMPTY"
        else "${treeMap.lastKey()} ${treeMap.firstKey()}"
    )
}
