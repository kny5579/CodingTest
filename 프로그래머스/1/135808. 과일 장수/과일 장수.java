import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(score);
        for (int i = score.length-1; i >= 0; i--) {
            sum++;
            if(sum==m) {
                answer+=score[i]*m;
                sum = 0;
            }
        }

        return answer;
    }
}