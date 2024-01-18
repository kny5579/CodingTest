class Solution {
    fun solution(x: Int): Boolean {
        var sum=0
        var n=x
        while(n!=0){
            sum+=n%10
            n/=10
        }
        return x%sum==0
    }
}