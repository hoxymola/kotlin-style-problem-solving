/**
 * @author Jaeguk Cho
 */

fun main() {
    readln()
    val list = readln().split(' ').toHashSet()
    readln()
    println(readln().split(' ').map { (it in list).compareTo(false) }.joinToString("\n"))
}
