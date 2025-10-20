fun gcd(a: Long, b: Long): Long {
    return if (b == 0L) a
    else gcd(b, a % b)
}

fun main() = repeat(readln().toInt()) {
    val numbers = readln().split(" ").map { it.toLong() }
    val n = numbers[0].toInt()
    var answer = 0L

    for (i in 1..n - 1) {
        for (j in i + 1..n) {
            answer += gcd(numbers[i], numbers[j])
        }
    }

    println(answer)
}
