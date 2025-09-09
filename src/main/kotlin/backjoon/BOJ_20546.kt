package backjoon

/**
 * @author Jaeguk Cho
 */

fun main() {
    val cash = readln().toInt()
    var cash1 = cash
    var stock1 = 0
    var cash2 = cash
    var stock2 = 0
    val prices = readln().split(" ").map { it.toInt() }

    prices.forEachIndexed { i, price ->
        (cash1 / price).also { stock ->
            stock1 += stock
            cash1 -= price * stock
        }

        if (i > 2) {
            if (prices[i - 3] < prices[i - 2] && prices[i - 2] < prices[i - 1] && prices[i - 1] < prices[i]) {
                cash2 += price * stock2
                stock2 = 0
            }
            if (prices[i - 3] > prices[i - 2] && prices[i - 2] > prices[i - 1] && prices[i - 1] > prices[i]) {
                (cash2 / price).also { stock ->
                    stock2 += stock
                    cash2 -= price * stock
                }
            }
        }
    }

    println(
        when {
            cash1 + prices.last() * stock1 > cash2 + prices.last() * stock2 -> "BNP"
            cash1 + prices.last() * stock1 < cash2 + prices.last() * stock2 -> "TIMING"
            else -> "SAMESAME"
        }
    )
}
