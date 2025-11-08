package backjoon2877

fun main() = with(StringBuilder()) {
    val k = readln().toInt() + 1

    k.toString(2).drop(1).forEach {
        if (it == '0') append(4)
        else append(7)
    }

    println(toString())
}
