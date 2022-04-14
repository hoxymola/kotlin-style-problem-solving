/**
 * @author Jaeguk Cho
 */

fun main() {
    val extensions = HashMap<String, Int>()
    repeat(readln().toInt()) {
        readln().substringAfter('.').also {
            extensions[it] = extensions.getOrPut(it) { 0 } + 1
        }
    }
    println(
        extensions.toSortedMap().toList().joinToString("\n") { "${it.first} ${it.second}" }
    )
}
