import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int min_idx=0;
        for (int i = people.length-1; min_idx <= i; i--) {
            if(people[min_idx]+people[i]<=limit){ //두명이 탈 수 있는 경우
                min_idx++;
            }
            answer++;
        }
        return answer;
    }
}