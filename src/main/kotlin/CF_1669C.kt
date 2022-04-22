/**
 * @author Jaeguk Cho
 */

fun main() = repeat(readln().toInt()) {
    readln()
    println(
        if (readln().split(' ').map { it.toInt() }.let { list ->
                list.withIndex().all { it.value % 2 == list[it.index % 2] % 2 }
            }) "YES"
        else "NO"
    )
}
