fun main() {
    val n = readln().toInt()
    val sizes = readln().split(" ").map { it.toInt() }
    val (t, p) = readln().split(" ").map { it.toInt() }
    var answer = 0

    repeat(6) {
        answer += (sizes[it] - 1 + t) / t
    }

    println(answer)
    println("${n / p} ${n % p}")
}
