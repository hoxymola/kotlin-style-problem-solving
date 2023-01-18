/**
 * @author Jaeguk Cho
 */

class `두 개 뽑아서 더하기` {
    fun solution(numbers: IntArray) = numbers.flatMapIndexed { i, num ->
        numbers.drop(i + 1).map { it + num }
    }.toSortedSet()
}
