fun main() {
    while (true) {
        val number = readln()
            .also { if (it == "0") return }

        println(
            if (number == number.reversed()) "yes"
            else "no"
        )
    }
}
