package backjoon25193

fun main() {
    val n = readln().toInt()
    val c = readln().count { it == 'C' }

    println(n / (n - c + 1))
}
