package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    val num = readln().map { it - '0' }.reversed().toMutableList()
    val temp = mutableListOf<Int>()
    var cur = -1
    var last = -1

    for (digit in num) {
        temp.add(digit)
        if (digit >= cur) {
            cur = digit
        } else {
            last = digit
            break
        }
    }

    val sortedTemp = temp.sorted().toMutableList()
    val indexOfNext = sortedTemp.indexOfFirst { it > last }

    if (last == -1) {
        println("BIGGEST")
    } else {
        println((num.drop(temp.size).reversed() + sortedTemp.removeAt(indexOfNext) + sortedTemp).joinToString(""))
    }
}
