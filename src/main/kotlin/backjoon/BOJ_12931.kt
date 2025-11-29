package backjoon12931

fun main() {
    val n = readln().toInt()
    val b = readln().split(" ").map { it.toInt() }
    val t = b.map { it.toString(2) }
    val op2 = t.maxOf { it.length - 1 }
    val op1 = t.sumOf { it.count { it == '1' } }

    println(op1 + op2)
}
