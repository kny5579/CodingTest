class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(i==0&&Character.isLetter(arr[i])) {
                answer+=Character.toUpperCase(arr[i]);
            }
            else if(i!=0&&arr[i-1]==' ') {
                answer+=Character.toUpperCase(arr[i]);
            }
            else {
                answer+=Character.toLowerCase(arr[i]);
            }
        }
        return answer;
    }
}