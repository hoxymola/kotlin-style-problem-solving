package backjoon11725

lateinit var tree: List<MutableList<Int>>
lateinit var parent: IntArray

fun dfs(start: Int) {
    val stack = ArrayDeque<Int>()

    parent[start] = start
    stack.addLast(start)
    while (stack.isNotEmpty()) {
        val current = stack.removeLast()

        tree[current].forEach {
            if (parent[it] == 0) {
                parent[it] = current
                stack.addLast(it)
            }
        }
    }
}

fun main() {
    val n = readln().toInt()
    tree = List(n + 1) { mutableListOf() }
    parent = IntArray(n + 1)

    repeat(n - 1) {
        val (u, v) = readln().split(" ").map { it.toInt() }

        tree[u] += v
        tree[v] += u
    }

    dfs(1)

    parent.drop(2).forEach { println(it) }
}
