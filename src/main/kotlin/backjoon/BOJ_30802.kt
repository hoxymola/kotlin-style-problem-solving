fun main() {
    val n = readln().toInt()
    val sizes = readln().split(" ").map { it.toInt() }
    val (t, p) = readln().split(" ").map { it.toInt() }
    var ans = 0

    repeat(6) {
        ans += (sizes[it] - 1 + t) / t
    }

    println(ans)
    println("${n / p} ${n % p}")
}
