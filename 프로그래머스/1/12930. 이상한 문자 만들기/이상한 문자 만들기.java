class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toUpperCase();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' ') {
                answer+=" ";
                idx=0;
                continue;
            }
            else if(idx%2!=0) answer+=Character.toLowerCase(s.charAt(i));
            else answer+=s.charAt(i);
            idx++;
        }
        return answer;
    }
}