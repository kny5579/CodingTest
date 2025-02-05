import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        for (int i = 1; i < 10000000; i++) {
            int a=arr[arr.length-1];
            for (int j = 0; j < arr.length; j++) {
                int temp=(a*i)%arr[j];
                if(temp!=0){
                    break;
                }else if(arr[j]==a){
                    return a*i;
                }
            }
        }
        return answer;
    }
}