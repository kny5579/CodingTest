class Solution {
    public int[] solution(long n) {
        String strN=Long.toString(n);
        int[] answer = new int[strN.length()];
        int idx=strN.length()-1;
        for(String s: Long.toString(n).split("")){
            answer[idx--]=Integer.parseInt(s);
        }
        return answer;
    }
}