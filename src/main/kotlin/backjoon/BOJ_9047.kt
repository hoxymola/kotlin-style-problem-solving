package backjoon

/**
 * @author Jaeguk Cho
 */

fun List<Int>.toInt(): Int = joinToString("").toInt()

fun String.kaprekar(): String {
    val list = map { it - '0' }
    val max = list.sortedDescending().toInt()
    val min = list.sorted().toInt()

    return (max - min).toString().padStart(4, '0')
}

fun main() = repeat(readln().toInt()) {
    var answer = 0
    var string = readln()

    while (string != "6174") {
        string = string.kaprekar()
        answer++
    }

    println(answer)
}
