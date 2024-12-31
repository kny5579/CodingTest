class Solution {
    public long solution(long n) {
        long answer = -1;
        int check = (int)Math.sqrt(n);
        if(Math.pow(check,2)==n){
            answer= (long) Math.pow(check+1,2);
        }
        return answer;
    }
}