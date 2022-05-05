/**
 * @author Jaeguk Cho
 */

fun main() {
    var sum = 0
    readLine()!!.forEach {
        sum += it - 'a' + 1
    }
    println(sum)
    println(
        if (sum.toBigInteger().isProbablePrime(10) || sum == 1) "It is a prime word."
        else "It is not a prime word."
    )
}
