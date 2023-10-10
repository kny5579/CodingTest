class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for((idx,num) in absolutes.withIndex()){
            if(!signs[idx]){
                answer-=num
            }else{
                answer+=num
            }
        }

        return answer
    }
}