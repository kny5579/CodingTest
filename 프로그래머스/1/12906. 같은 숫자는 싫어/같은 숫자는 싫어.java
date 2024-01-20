import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> s=new Stack<>();
        s.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(s.peek()!=arr[i]){
                s.add(arr[i]);
            }
        }

        return s.stream().mapToInt(Integer::intValue).toArray();
    }
}