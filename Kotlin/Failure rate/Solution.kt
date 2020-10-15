package datastructure

class Solution {
    
    fun solution(N: Int, stages: IntArray): IntArray {
        val answer = IntArray(N) {0}

        val stageFailure: MutableList<Double> = mutableListOf()

        val tmp: MutableList<Int> = mutableListOf()
        for (j in 1..N) {
            tmp.add(stages.count {
                it <= j
            })
        }

        val noClear: MutableList<Int> = mutableListOf(tmp[0])
        for(i in 1 until tmp.size) {
            noClear.add(tmp[i]-tmp[i-1])
        }

        val player: MutableList<Int> = mutableListOf()
        for (i in 1..N) {
            player.add(stages.count{ it >= i})
        }

        stages.filter {
            it <= N
        }
        for (i in noClear.indices) {
            if(player[i] == 0) {
                stageFailure.add(0.0)
            }else {
                stageFailure.add(noClear[i].toDouble() / player[i])
            }
        }

        val result: MutableList<Double>

        result = stageFailure.sortedDescending().toMutableList()

        for(i in result.indices) {
            val x :Int = stageFailure.indexOf(result[i])
            stageFailure[x] = -1.0
            answer[i]= x+1
        }

        return answer
    }

}

fun main() {
    val solution = Solution()
    val num = 5
    val arr = intArrayOf(2,1,2,6,2,4,3,3)

    for(i in solution.solution(num,arr)){
        print("$i, ")
    }
}