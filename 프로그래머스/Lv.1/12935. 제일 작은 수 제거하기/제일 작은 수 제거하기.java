import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer={-1};
            return answer;
        }
        int[] answer = new int[arr.length-1];
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min=Math.min(min,arr[i]);
        }
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if(min==arr[i]){
                continue;
            }
            answer[k++]=arr[i];
        }
        return answer;
    }
}