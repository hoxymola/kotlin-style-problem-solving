package backjoon14725

data class Node(
    val children: HashMap<String, Node> = HashMap(),
) {
    operator fun plusAssign(food: List<String>) {
        var cur = this

        food.forEach { cur = cur.children.computeIfAbsent(it) { Node() } }
    }

    fun print(depth: Int) {
        children.toSortedMap().forEach {
            println("--".repeat(depth) + it.key)
            it.value.print(depth + 1)
        }
    }
}

fun main() {
    val root = Node()

    repeat(readln().toInt()) {
        root += readln().split(" ").drop(1)
    }

    root.print(0)
}
