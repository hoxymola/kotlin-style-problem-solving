fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val cards = readln().split(" ").map { it.toInt() }
    var ans = 0

    for (i in 0..n - 3) {
        for (j in i + 1..n - 2) {
            for (k in j + 1..n - 1) {
                val sum = cards[i] + cards[j] + cards[k]

                if (sum <= m) {
                    ans = maxOf(ans, sum)
                }
            }
        }
    }

    println(ans)
}
