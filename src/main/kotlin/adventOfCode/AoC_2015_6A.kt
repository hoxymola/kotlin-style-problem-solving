package adventOfCode

/**
 * @author Jaeguk Cho
 */

fun main() {
    val lights = List(1000) { MutableList(1000) { false } }

    fun List<MutableList<Boolean>>.switch(line: String, operation: String? = null) {
        val (y1, x1, y2, x2) = line.split(" through ", ",").map { it.toInt() }

        for (i in y1..y2)
            for (j in x1..x2)
                this[i][j] = when (operation) {
                    "on" -> true
                    "off" -> false
                    else -> this[i][j].not()
                }
    }

    fun List<MutableList<Boolean>>.operation(line: String) {
        when (line.substringAfter(' ').substringBefore(' ')) {
            "on" -> switch(line.substringAfter(' ').substringAfter(' '), "on")
            "off" -> switch(line.substringAfter(' ').substringAfter(' '), "off")
            else -> switch(line.substringAfter(' '))
        }
    }

    readLines("2015_06").forEach { lights.operation(it) }
    println(lights.sumOf { it.count { it } })
}
