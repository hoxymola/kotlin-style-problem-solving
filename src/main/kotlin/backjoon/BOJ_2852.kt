package backjoon

/**
 * @author Jaeguk Cho
 */

fun Int.toMMSS(): String {
    val mm = (this / 60).toString().padStart(2, '0')
    val ss = (this % 60).toString().padStart(2, '0')

    return "$mm:$ss"
}

fun main() {
    val n = readln().toInt()
    val scores = MutableList(4) { 0 }
    val winningTime = MutableList(4) { 0 }
    var firstWinTime = 0
    var oldWinningTeam = 0
    var newWinningTeam = 0

    repeat(n) {
        val (t, m, s) = readln().split(" ", ":").map { it.toInt() }
        val currentTime = m * 60 + s

        scores[t]++
        newWinningTeam = when {
            scores[1] > scores[2] -> 1
            scores[1] < scores[2] -> 2
            else -> 0
        }

        if (oldWinningTeam != newWinningTeam) {
            if (newWinningTeam == 0) {
                winningTime[oldWinningTeam] += currentTime - firstWinTime
            } else {
                firstWinTime = currentTime
            }
        }

        oldWinningTeam = newWinningTeam
    }

    winningTime[newWinningTeam] += 48 * 60 - firstWinTime

    println(winningTime[1].toMMSS())
    println(winningTime[2].toMMSS())
}
