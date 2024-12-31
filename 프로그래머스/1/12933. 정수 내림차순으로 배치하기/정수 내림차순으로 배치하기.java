import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] arr=Long.toString(n).split("");
        Arrays.sort(arr);
        StringBuffer sb= new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}