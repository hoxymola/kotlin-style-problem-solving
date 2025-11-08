package backjoon2257

val match = MutableList(101) { -1 }
var formula = ""

fun calculate(l: Int, r: Int): Int {
    if (l >= r) return 0

    return when (val c = formula[l]) {
        'H' -> 1 + calculate(l + 1, r)
        'C' -> 12 + calculate(l + 1, r)
        'O' -> 16 + calculate(l + 1, r)
        ')' -> calculate(l + 1, match[l]) + calculate(match[l] + 1, r)
        else -> {
            when (formula[l + 1]) {
                ')' -> (c - '0') * calculate(l + 2, match[l + 1]) + calculate(match[l + 1] + 1, r)
                else -> (c - '0') * calculate(l + 1, l + 2) + calculate(l + 2, r)
            }
        }
    }
}

fun main() {
    formula = readln().reversed()
    val stack = ArrayDeque<Int>()

    formula.forEachIndexed { i, c ->
        when (c) {
            '(' -> {
                val last = stack.removeLast()

                match[last] = i
                match[i] = last
            }

            ')' -> stack.addLast(i)
        }
    }

    println(calculate(0, formula.length))
}
