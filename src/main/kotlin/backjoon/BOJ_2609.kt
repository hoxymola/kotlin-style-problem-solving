fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a
    else gcd(b, a % b)
}

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    println(gcd(a, b))
    println(a * b / gcd(a, b))
}
