package backjoon34691

fun main() {
    while (true) {
        val s = readln()

        println(
            when (s) {
                "animal" -> "Panthera tigris"
                "tree" -> "Pinus densiflora"
                "flower" -> "Forsythia koreana"
                else -> return
            }
        )
    }
}
