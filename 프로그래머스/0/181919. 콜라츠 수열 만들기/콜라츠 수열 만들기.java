import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer=new ArrayList();
        
        while(n!=1){
            if(n%2==0){
                answer.add(n);
                n/=2;
            }else if(n%2==1){
                answer.add(n);
                n=3*n+1;
            }
        }
        answer.add(1);
        return answer.stream().mapToInt(i->i).toArray();
    }
}