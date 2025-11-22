package backjoonAAAAA

fun main() {
    val n = readln().toInt()

    val remain = when {
        n >= 1000000 -> n * .2
        n >= 500000 -> n * .15
        n >= 100000 -> n * .1
        else -> n * .05
    }.toInt()

    println("$remain ${n - remain}")
}
