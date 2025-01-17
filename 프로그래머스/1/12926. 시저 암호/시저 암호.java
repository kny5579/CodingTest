class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp == ' ') answer+=" ";
            else {
                if(Character.isLowerCase(temp)) {
                    if(temp+n<='z') answer+=(char)(temp+n);
                    else answer+=(char)(temp-26+n);
                } else if(Character.isUpperCase(temp)) {
                    if(temp+n<='Z') answer+=(char)(temp+n);
                    else answer+=(char)(temp-26+n);
                }
            }
        }
        return answer;
    }
}