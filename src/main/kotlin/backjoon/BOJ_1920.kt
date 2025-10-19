fun main() = with(StringBuilder()) {
    val n = readln().toInt()
    val a = readln().split(" ").map { it.toInt() }.toHashSet()
    val m = readln().toInt()

    readln().split(" ").map { it.toInt() }.forEach {
        appendLine(if (it in a) 1 else 0)
    }

    println(toString())
}
