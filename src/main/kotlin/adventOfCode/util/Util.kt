package adventOfCode.util

import java.io.File

/**
 * @author Jaeguk Cho
 */

fun readLines(path: String) = File("src/main/kotlin/adventOfCode/input/$path").readLines()

fun <T> Collection<T>.modeOrNull() = groupBy { it }.maxByOrNull { it.value.size }?.key
