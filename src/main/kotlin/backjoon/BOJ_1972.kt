package backjoon1972

fun main() {
    while (true) {
        val s = readln().also { if (it == "*") return }
        val n = s.length
        var isSurprising = true

        for (d in 1 until n) {
            val hashSet = HashSet<String>()

            for (i in 0 until n - d) {
                hashSet += "${s[i]}${s[i + d]}"
            }

            if (hashSet.size != n - d) {
                isSurprising = false
            }
        }

        println(
            if (isSurprising) "$s is surprising."
            else "$s is NOT surprising."
        )
    }
}
