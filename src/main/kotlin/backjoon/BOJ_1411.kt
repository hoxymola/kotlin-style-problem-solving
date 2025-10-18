package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val wordMap = hashMapOf<String, Int>()

    repeat(n) {
        val word = readln().toList()
        val charMap = word.distinct().withIndex().associate { it.value to it.index }
        val key = word.map { charMap[it] }.joinToString("")

        wordMap[key] = wordMap.getOrDefault(key, 0) + 1
    }

    println(wordMap.values.sumOf { it * (it - 1) / 2 })
}
