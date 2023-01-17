/**
 * @author Jaeguk Cho
 */

class Solution {
    fun solution(numbers: IntArray) = numbers.flatMapIndexed { i, num ->
        numbers.drop(i + 1).map { it + num }
    }.toSortedSet()
}
