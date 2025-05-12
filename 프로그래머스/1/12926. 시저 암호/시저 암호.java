class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ex=s.charAt(i);
            if(ex==' '){
                answer+=" ";
            }
            else if(Character.isLowerCase(ex)){
                if(ex+n>'z'){
                    answer+=(char)(ex+n-26);
                } else{
                    answer+=(char)(ex+n);
                }
            }
            else {
                if(ex+n>'Z'){
                    answer+=(char)(ex+n-26);
                }
                else{
                    answer+=(char)(ex+n);
                }

            }
        }
        return answer;
    }
}