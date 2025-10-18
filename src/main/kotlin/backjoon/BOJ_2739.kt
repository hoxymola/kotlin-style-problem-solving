fun main() {
    val n = readln().toInt()

    (1..9).forEach {
        println("$n * $it = ${n * it}")
    }
}
