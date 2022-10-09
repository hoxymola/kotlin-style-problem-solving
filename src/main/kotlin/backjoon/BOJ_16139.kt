/**
 * @author Jaeguk Cho
 */

fun main() {
    val string = readln()
    val prefix = List(26) { MutableList(string.length + 1) { 0 } }
    for (a in 'a'..'z') {
        for (j in string.indices) {
            prefix[a - 'a'][j + 1] = prefix[a - 'a'][j] + (string[j] == a).compareTo(false)
        }
    }

    repeat(readln().toInt()) {
        val (a, l, r) = readln().split(' ').map { it.toIntOrNull() ?: it }
        println(prefix[(a as String)[0] - 'a'][r as Int + 1] - prefix[a[0] - 'a'][l as Int])
    }
}
