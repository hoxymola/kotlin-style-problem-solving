fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val s = readln().split(" ").map { it.toInt() }
    var ans = 0

    // l, r은 반드시 짝수에 위치해야한다.
    var l = 0
    var r = 0
    var cnt = 0 // l과 r 사이에 포함된 홀수의 개수
    while (r < n) {
        when {
            s[r] % 2 == 1 -> {
                cnt++
                r++
            }

            s[l] % 2 == 1 -> {
                cnt--
                l++
            }

            cnt <= k -> {
                ans = maxOf(ans, r - l + 1 - cnt)
                r++
            }

            else -> l++
        }
    }

    println(ans)
}
