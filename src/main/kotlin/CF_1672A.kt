/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    val n = readln().toInt()
    println(
        if ((readln().split(' ').sumOf { it.toInt() } - n) % 2 == 1)
            "errorgorn"
        else "maomao90"
    )
}
