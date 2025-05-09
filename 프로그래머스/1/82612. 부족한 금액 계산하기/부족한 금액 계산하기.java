class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0L;
        for (int i = 1; i <= count; i++) {
            answer+=price*i;
        }
        return answer>money?answer-money:0;
    }
}