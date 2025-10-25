package backjoon14426

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

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val root = Node()
    var ans = 0

    repeat(n) { root += readln() }
    repeat(m) { if (readln() in root) ans++ }

    println(ans)
}
