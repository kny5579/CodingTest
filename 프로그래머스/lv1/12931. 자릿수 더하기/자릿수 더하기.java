import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(String s:Integer.toString(n).split("")){
            answer+=Integer.parseInt(s);
        }

        return answer;
    }
}