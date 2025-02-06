import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String sCopy = s;
        for (int i = 0; i < sCopy.length(); i++) {
            sCopy=sCopy.concat(String.valueOf(sCopy.charAt(0)));
            sCopy=sCopy.substring(1,sCopy.length());
            if(isRight(sCopy)) answer++;
        }
        return answer;
    }
    public boolean isRight(String s) {
        while(!s.equals("")) {
            if (s.contains("()")) s=s.replace("()", "");
            else if (s.contains("{}")) s=s.replace("{}", "");
            else if (s.contains("[]")) s=s.replace("[]", "");
            else return false;
        }
        return true;
    }
}