package datastructure

class Solution {
    fun solution(num: Int): String {
        return when(num % 2) {
            0 -> "Even"
            else -> "Odd"
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(3))
}