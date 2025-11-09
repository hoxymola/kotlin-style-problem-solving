package backjoon34703

fun main() = println(
    if (List(readln().toInt()) { readln().toInt() }.distinct().count() == 5) "NO"
    else "YES"
)
