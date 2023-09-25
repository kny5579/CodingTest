import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        int k=0;
        for(int i:arr){
            if(i%divisor==0){
                k++;
            }
        }
        if(k!=0){
            answer=new int[k];
        }else{
            answer=new int[]{-1};
        }
        int j=0;
        for(int i:arr){
            if(i%divisor==0){
                answer[j]=i;
                j++;
            }
        }
        
        Arrays.sort(answer);
        return answer;

    }
}