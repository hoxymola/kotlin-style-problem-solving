package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    val word = readln()
    val i = word.zipWithNext().withIndex().lastOrNull { (_, p) -> p.first < p.second }?.index
        ?: return@repeat println(word)
    val a = word.substring(0, i)
    val b = word[i]
    val c = word.substring(i).toList().sorted().toMutableList()

    println(a + c.removeAt(c.indexOfFirst { it > b }) + c.joinToString(""))
}
