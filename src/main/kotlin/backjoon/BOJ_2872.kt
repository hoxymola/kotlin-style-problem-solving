package backjoon2872

fun main() = println(
    List(readln().toInt()) { readln().toInt() }
        .withIndex()
        .sortedBy { it.value }
        .zipWithNext()
        .lastOrNull { it.first.index > it.second.index }
        ?.first?.value ?: 0
)
