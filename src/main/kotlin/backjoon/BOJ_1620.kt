/**
 * @author Jaeguk Cho
 */

fun main() {
    val (n, m) = readln().split(' ').map { it.toInt() }
    val pokemonByNum = mutableMapOf<Int, String>()
    val pokemonByName = mutableMapOf<String, Int>()

    for (num in 1..n) {
        readln().let { name ->
            pokemonByNum[num] = name
            pokemonByName[name] = num
        }
    }
    repeat(m) {
        println(
            readln().let { problem ->
                problem.toIntOrNull()?.let { pokemonByNum[it] }
                    ?: pokemonByName[problem]
            }
        )
    }
}
