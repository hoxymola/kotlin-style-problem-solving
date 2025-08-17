package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val a = readln().toIntOrNull()
    val b = readln().toIntOrNull()
    val c = readln().toIntOrNull()

    val answer = when {
        a != null -> a + 3
        b != null -> b + 2
        c != null -> c + 1
        else -> 0
    }

    println(answer.toFizzBuzz())
}

fun Int.toFizzBuzz(): String {
    return when {
        this % 15 == 0 -> "FizzBuzz"
        this % 3 == 0 -> "Fizz"
        this % 5 == 0 -> "Buzz"
        else -> this.toString()
    }
}
