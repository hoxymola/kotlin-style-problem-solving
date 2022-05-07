package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() {
    val lights = List(1000) { MutableList(1000) { false } }

    fun switch(range: String, operation: Boolean? = null) {
        val (y1, x1, y2, x2) = range.split(" through ", ",").map { it.toInt() }

        for (i in y1..y2)
            for (j in x1..x2)
                lights[i][j] = operation ?: lights[i][j].not()
    }

    fun operation(line: String) {
        when (line.substringAfter(' ').substringBefore(' ')) {
            "on" -> switch(line.substringAfter(' ').substringAfter(' '), true)
            "off" -> switch(line.substringAfter(' ').substringAfter(' '), false)
            else -> switch(line.substringAfter(' '))
        }
    }

    readLines("2015_06").forEach { operation(it) }
    println(lights.sumOf { it.count { it } })
}
