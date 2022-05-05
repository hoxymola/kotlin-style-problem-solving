/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readLine()!!.toInt()) {
    var ans = 0
    var prev = '-'
    readLine()!!.forEach {
        prev = when {
            it == 'w' -> it.also { ans++ }
            prev == 'v' -> 'w'.also { ans++ }
            else -> 'v'
        }
    }
    println(ans)
}
