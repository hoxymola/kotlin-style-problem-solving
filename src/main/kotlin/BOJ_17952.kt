/**
 * @author Jaeguk Cho
 */
data class HomeWork(
    val score: Int,
    var timeLeft: Int
)

fun main() {
    val n = readln().toInt()
    var finalScore = 0
    val thingsToDo = mutableListOf<HomeWork>()

    repeat(n) {
        readln().toHomeWork()?.run { thingsToDo.add(this) }

        if (thingsToDo.size > 0) {
            val rightNow = thingsToDo[thingsToDo.size - 1]
            thingsToDo.removeAt(thingsToDo.size - 1)

            if (rightNow.timeLeft == 1)
                finalScore += rightNow.score
            else
                thingsToDo.add(rightNow.copy(timeLeft = rightNow.timeLeft - 1))
        }
    }
    println(finalScore)
}

fun String.toHomeWork(): HomeWork? {
    val input = this.split(' ').map { it.toInt() }
    return if (input.size == 1) null
    else HomeWork(score = input[1], timeLeft = input[2])
}
