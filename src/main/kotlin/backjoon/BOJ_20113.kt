package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val n = readln().toInt()
    val votes = readln().split(" ").map { it.toInt() }
    val voteResult = MutableList(n + 1) { 0 }

    votes.forEach { voteResult[it]++ }

    val voteRank = voteResult.withIndex().drop(1).sortedByDescending { it.value }

    println(
        if (voteRank[0].value > voteRank[1].value) voteRank[0].index
        else "skipped"
    )
}
