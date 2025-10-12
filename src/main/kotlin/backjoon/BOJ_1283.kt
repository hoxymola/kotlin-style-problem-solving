package backjoon

/**
 * @author Jaeguk Cho
 */

fun String.withBracket(index: Int): String {
    return substring(0, index) + "[${this[index]}]" + substring(index + 1)
}

fun main() {
    val n = readln().toInt()
    val visited = BooleanArray(200)
        .also { it[' '.code] = true }

    repeat(n) {
        val firstIndices = mutableListOf(0)
        val option = readln()

        for (i in 1 until option.length) {
            if (option[i - 1] == ' ') firstIndices.add(i)
        }

        val indexOfFirstMatch = firstIndices.firstOrNull { !visited[option[it].lowercaseChar().code] }
        val indexOfAnyMatch = option.indexOfFirst { !visited[it.lowercaseChar().code] }

        println(
            when {
                indexOfFirstMatch != null -> option.withBracket(indexOfFirstMatch)
                    .also { visited[option[indexOfFirstMatch].lowercaseChar().code] = true }

                indexOfAnyMatch != -1 -> option.withBracket(indexOfAnyMatch)
                    .also { visited[option[indexOfAnyMatch].lowercaseChar().code] = true }

                else -> option
            }
        )
    }
}
