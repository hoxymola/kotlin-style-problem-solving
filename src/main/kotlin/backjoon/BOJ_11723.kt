/**
 * @author Jaeguk Cho
 */

fun main() = with(StringBuilder()) {
    var s = 0

    repeat(readln().toInt()) {
        readln().split(' ').also {
            val x = if (it.size > 1) 1 shl it[1].toInt() else 0
            s = when (it[0]) {
                "add" -> s or x
                "remove" -> s and x.inv()
                "check" -> s.also { append(if (s and x > 0) "1\n" else "0\n") }
                "toggle" -> s xor x
                "all" -> 0.inv()
                else -> 0
            }
        }
    }
    println(toString())
}
