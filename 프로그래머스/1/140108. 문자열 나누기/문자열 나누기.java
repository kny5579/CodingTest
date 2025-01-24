import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 1;
        int firstNum = 1;
        int otherNum = 0;
        String[] arr = s.split("");
        String first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(firstNum==otherNum){
                answer++;
                first = arr[i];
                firstNum = 0;
                otherNum = 0;
            }
            if(first.equals(arr[i])) firstNum++;
            else otherNum++;
            System.out.println(firstNum);
            System.out.println(otherNum);
        }
    
        return answer;
    }
}