package backjoon

/**
 * @author Jaeguk Cho
 */

enum class Grade(
    val score: Double,
) {
    `A+`(4.5),
    A0(4.0),
    `B+`(3.5),
    B0(3.0),
    `C+`(2.5),
    C0(2.0),
    `D+`(1.5),
    D0(1.0),
    F(0.0),
    P(-1.0),
    ;
}

fun main() {
    var totalScore = 0.0
    var totalCredit = 0.0

    repeat(20){
        val (credit, grade) = readln().split(" ")
            .let { it[1].toDouble() to Grade.valueOf(it[2]) }

        if (grade != Grade.P) {
            totalScore += credit * grade.score
            totalCredit += credit
        }
    }

    println(totalScore / totalCredit)
}
