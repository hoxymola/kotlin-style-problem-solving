package backjoon

/**
 * @author Jaeguk Cho
 */

fun Long.times(other: Long, mod: Int): Long {
    return (this % mod) * (other % mod) % mod
}

fun main() {
    val a = readln().toLong()
    var x = readln().toLong()
    val mod = 1000000007
    val powOfA = generateSequence(a) { it.times(it, mod) }.take(64).toList()
    val binary = mutableListOf<Boolean>()
    var answer = 1L

    while (x > 0) {
        if (x % 2 == 1L) binary.add(true)
        else binary.add(false)

        x /= 2
    }

    binary.withIndex().filter { it.value }
        .forEach { answer = answer.times(powOfA[it.index], mod) }

    println(answer)
}
