package datastructure

class Solution {
    fun solution(arr: IntArray): Double {
        return arr.average()
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(intArrayOf(1,2,3,4)))
}