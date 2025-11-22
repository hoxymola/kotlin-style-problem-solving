package backjoon1931

data class Meeting(
    val s: Int,
    val e: Int,
)

fun main() {
    val n = readln().toInt()
    val meetings = List(n) { readln().split(" ").map { it.toInt() } }
        .map { Meeting(it[0], it[1]) }.sortedWith(compareBy(Meeting::e, Meeting::s))
    var lastEndTime = 0
    var ans = 0

    meetings.forEach {
        if (lastEndTime <= it.s) {
            lastEndTime = it.e
            ans++
        }
    }

    println(ans)
}
