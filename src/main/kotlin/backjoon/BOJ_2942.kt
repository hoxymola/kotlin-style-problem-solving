import kotlin.math.sqrt

/**
 * @author Jaeguk Cho
 */

fun main() {
    tailrec fun gcd(a: Int, b: Int): Int {
        return b.takeIf { a % b == 0 } ?: gcd(b, a % b)
    }

    val (r, g) = readln().split(' ').map { it.toInt() }
    val gcd = gcd(r, g)
    (1..sqrt(gcd.toDouble()).toInt()).filter { gcd % it == 0 }.forEach { num ->
        println("$num ${r / num} ${g / num}")
        (gcd / num).also { if (it != num) println("$it ${r / it} ${g / it}") }
    }
}
