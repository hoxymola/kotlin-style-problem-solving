package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() {
    val lights = List(1000) { MutableList(1000) { 0 } }

    fun adjust(range: String, amount: Int) {
        val (y1, x1, y2, x2) = range.split(" through ", ",").map { it.toInt() }

        for (i in y1..y2)
            for (j in x1..x2)
                lights[i][j] = (lights[i][j] + amount).takeIf { it > 0 } ?: 0
    }

    fun operation(line: String) {
        when (line.substringAfter(' ').substringBefore(' ')) {
            "on" -> adjust(line.substringAfter(' ').substringAfter(' '), 1)
            "off" -> adjust(line.substringAfter(' ').substringAfter(' '), -1)
            else -> adjust(line.substringAfter(' '), 2)
        }
    }

    readLines("2015_06").forEach { operation(it) }
    println(lights.sumOf { it.sum() })
}
