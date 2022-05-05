/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    var (x, y) = readln().split(' ').map { it.toInt() }
    if (x < y) x = y.also { y = x }

    println(
        if (x == y) "${x - 1} 1 1"
        else "${x - y + 1} 1 ${y - 1}"
    )
}
