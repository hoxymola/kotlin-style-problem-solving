package backjoon14425

fun main() {
    val set = HashSet<String>()
    val (n, m) = readln().split(" ").map { it.toInt() }
    var ans = 0

    repeat(n) { set += readln() }
    repeat(m) { if (readln() in set) ans++ }

    println(ans)
}
