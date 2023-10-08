class Solution {
    fun solution(num: Int): Int {
    var answer = 0
    var a=num.toLong()
    if(num==1){
        return 0
    }
    while(a!=1L){
        if(answer==500){
            return -1
        }
        if(a%2==0L){
            a/=2
        } else{
            a=a*3+1
        }
        answer++
    }
    return answer
}
}