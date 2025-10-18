fun main() {
    repeat(Int.MAX_VALUE) {
        val stack = mutableListOf<Char>()

        readln().also { if ('-' in it) return }.forEach {
            if (it == '}' && stack.lastOrNull() == '{') stack.removeLast()
            else stack += it
        }

        val right = stack.count { it == '}' }
        val left = stack.count { it == '{' }

        println("${it + 1}. ${(right + 1) / 2 + (left + 1) / 2}")
    }
}
