package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val (s, p) = readln().split(" ").map { it.toInt() }
    val dna = "0" + readln()
    val (a, c, g, t) = readln().split(" ").map { it.toInt() }
    val subDna = dna.take(p)
    var answer = 0
    var cntA = 0
    var cntC = 0
    var cntG = 0
    var cntT = 0
    var index = 0

    subDna.forEach {
        when (it) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }
    }

    while (index < s - p + 1) {
        when (dna[index]) {
            'A' -> cntA--
            'C' -> cntC--
            'G' -> cntG--
            'T' -> cntT--
        }

        when (dna[index + p]) {
            'A' -> cntA++
            'C' -> cntC++
            'G' -> cntG++
            'T' -> cntT++
        }

        if (cntA >= a && cntC >= c && cntG >= g && cntT >= t) answer++
        index++
    }

    println(answer)
}
