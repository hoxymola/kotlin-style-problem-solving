fun main() {
    while (true) {
        val num = readln()
            .also { if (it == "0") return }

        println(
            if (num == num.reversed()) "yes"
            else "no"
        )
    }
}
