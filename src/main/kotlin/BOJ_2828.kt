/**
 * @author Jaeguk Cho
 */
fun main() {
    val (n, m) = readLine()!!.split(' ').map { it.toInt() }
    val j = readLine()!!.toInt()
    var l = 1
    var r: Int
    var ans = 0
    for (i in 1..j) {
        r = l + m - 1
        when (val apple = readLine()!!.toInt()) {
            in 1 until l -> {
                ans += l - apple
                l = apple
            }
            in r + 1..n -> {
                ans += apple - r
                l += apple - r
            }
        }
    }
    println(ans)
}
