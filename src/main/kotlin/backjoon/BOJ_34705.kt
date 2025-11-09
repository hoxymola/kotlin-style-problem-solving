package backjoon34705

fun main() = repeat(readln().toInt()) {
    val (x, y) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }

    for (b in 0 until 32) {
        var sum = 0

        for (i in 0..4) {
            if (b and (1 shl i) > 0) sum += a[i]
        }

        if (sum in x..y) return@repeat println("YES")
    }

    println("NO")
}
