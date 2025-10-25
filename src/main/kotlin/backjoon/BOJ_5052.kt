package backjoon5052

data class Node(
    val children: HashMap<Char, Node> = HashMap(),
) {
    operator fun contains(s: String): Boolean {
        var cur = this

        s.forEach { cur = cur.children[it] ?: return false }

        return true
    }

    operator fun plusAssign(s: String) {
        var cur = this

        s.forEach { cur = cur.children.computeIfAbsent(it) { Node() } }
    }
}

fun main() = repeat(readln().toInt()) {
    val root = Node()
    val n = readln().toInt()
    val numbers = Array(n) { readln() }.sortedByDescending { it.length }

    numbers.forEach {
        if (it in root) return@repeat println("NO")
        root += it
    }

    println("YES")
}
