class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n==2){
            return 1;
        }
        for (int i = 2; i <=n; i++) {
            if(detectSo(i)){
                answer++;
            }
        }
        return answer;
    }
    boolean detectSo(int n){
        for (int i = 2; i <=(int)Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}