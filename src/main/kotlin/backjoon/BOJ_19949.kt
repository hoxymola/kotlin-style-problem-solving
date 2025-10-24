package backjoon19949

var answers = listOf<Int>()
val responses = MutableList(10) { 0 }
var ans = 0

fun backTrack(
    cnt: Int, // 현재까지 고른 답안의 개수
    score: Int, // 현재까지 맞춘 개수
) {
    if (cnt == 10) {
        if (score >= 5) ans++
        return
    }

    (1..5).forEach {
        if (cnt >= 2 && responses[cnt - 2] == it && responses[cnt - 1] == it) return@forEach
        responses[cnt] = it
        when (answers[cnt] == it) {
            true -> backTrack(cnt + 1, score + 1)
            false -> backTrack(cnt + 1, score)
        }
    }
}

fun main() {
    answers = readln().split(" ").map { it.toInt() }

    backTrack(0, 0)

    println(ans)
}
