fun main() {
    val sb = StringBuilder()
    var s = 0

    repeat(readln().toInt()) {
        val op = readln().split(" ")
        val x = 1 shl (op.last().toIntOrNull() ?: 0)

        s = when (op[0]) {
            "add" -> s or x
            "remove" -> s and x.inv()
            "check" -> s.also { sb.appendLine(if (s and x > 0) 1 else 0) }
            "toggle" -> s xor x
            "all" -> 0.inv()
            else -> 0
        }
    }

    println(sb.toString())
}
