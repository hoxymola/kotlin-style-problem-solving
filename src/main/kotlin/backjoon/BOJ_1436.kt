/**
 * @author Jaeguk Cho
 */

fun main() {
    var num = 665
    var n = readLine()!!.toInt()
    while (n > 0) {
        if ("666" in (++num).toString()) n--
    }
    println(num)
}
