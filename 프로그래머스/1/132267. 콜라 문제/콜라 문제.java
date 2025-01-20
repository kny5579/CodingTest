class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = n;
        while(true) {
            answer += remain/a*b;
            remain = remain%a + remain/a*b;
            System.out.println(remain);
            if(remain<a) break;
        }

        return answer;
    }
}