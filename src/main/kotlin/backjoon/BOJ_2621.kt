data class Card(
    val color: Char,
    val number: Int,
)

fun List<Card>.numberCount(): Map<Int, Int> {
    return groupingBy { it.number }.eachCount()
}

fun List<Card>.isStraightFlush(): Boolean {
    return isStraight() && isFlush()
}

fun List<Card>.isFourCard(): Boolean {
    return numberCount().any { it.value == 4 }
}

fun List<Card>.isFullHouse(): Boolean {
    return numberCount().any { it.value == 3 } && numberCount().any { it.value == 2 }
}

fun List<Card>.isFlush(): Boolean {
    return distinctBy { it.color }.size == 1
}

fun List<Card>.isStraight(): Boolean {
    val sortedNumbers = map { it.number }.sorted()

    return sortedNumbers.zipWithNext().all { it.second - it.first == 1 }
}

fun List<Card>.isTriple(): Boolean {
    return numberCount().any { it.value == 3 }
}

fun List<Card>.isTowPair(): Boolean {
    return numberCount().filter { it.value == 2 }.size == 2
}

fun List<Card>.isOnePair(): Boolean {
    return numberCount().filter { it.value == 2 }.size == 1
}

fun List<Card>.getFirstNumberWithCount(count: Int): Int {
    return numberCount().filter { it.value == count }.keys.first()
}

fun List<Card>.getLastNumberWithCount(count: Int): Int {
    return numberCount().filter { it.value == count }.keys.last()
}

fun main() {
    val cards = List(5) { readln().let { Card(it[0], it[2] - '0') } }.sortedBy { it.number }
    val maxNumber = cards.last().number

    println(
        when {
            cards.isStraightFlush() -> 900 + maxNumber
            cards.isFourCard() -> 800 + cards.getFirstNumberWithCount(4)
            cards.isFullHouse() -> 700 + 10 * cards.getFirstNumberWithCount(3) + cards.getFirstNumberWithCount(2)
            cards.isFlush() -> 600 + maxNumber
            cards.isStraight() -> 500 + maxNumber
            cards.isTriple() -> 400 + cards.getFirstNumberWithCount(3)
            cards.isTowPair() -> 300 + 10 * cards.getLastNumberWithCount(2) + cards.getFirstNumberWithCount(2)
            cards.isOnePair() -> 200 + cards.getFirstNumberWithCount(2)
            else -> 100 + maxNumber
        }
    )
}
