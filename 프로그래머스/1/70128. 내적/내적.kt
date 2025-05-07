class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer: Int = 0
        var len : Int = a.size
        for(i in 0 until len){
            answer+=a[i]*b[i]
        }
        return answer
    }
}