package backjoon30804

fun main() {
    val n = readln().toInt()
    val fruits = readln().split(" ").map { it.toInt() }
    val fruitCount = IntArray(10)
    var ans = 0

    var l = 0
    var r = 0
    while (l <= r && r < n) {
        if (fruitCount[fruits[r]] == 0 && fruitCount.count { it > 0 } == 2) {
            fruitCount[fruits[l++]]--
        } else {
            ans = maxOf(ans, r - l + 1)
            fruitCount[fruits[r++]]++
        }
    }

    println(ans)
}
