package datastructure

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer = 0L

        if(a<b) {
            for (i in a..b) {
                answer += i
            }
        } else {
            for (i in b..a) {
                answer += i
            }
        }

        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(3,5))
}