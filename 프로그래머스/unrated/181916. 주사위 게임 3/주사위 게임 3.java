import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer=0;
        int ans=1;
        int[] arr=new int[4];
        HashMap<Integer,Integer> map=new HashMap<>();
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=d;
        Arrays.sort(arr);
        for (int i = 0; i < 4; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        if(map.size()==1){
            answer=1111*a;
        }else if(map.size()==4){
            answer=arr[0];
        }else if(map.size()==3){
            for (int i:map.keySet()){
                if(map.get(i)==1){
                    ans*=i;
                }
            }
            answer=ans;
        } else{
            int p=0,q=0;
            ArrayList<Integer> list=new ArrayList<>();
            boolean flag=false;
            for(int i:map.keySet()){
                if(map.get(i)==3){
                    p=i;
                }else if(map.get(i)==1){
                    q=i;
                    flag=true;
                }else{
                    list.add(i);
                }
            }
            answer=flag?(int)Math.pow(10*p+q,2):(list.get(0)+list.get(1))*Math.abs(list.get(0)-list.get(1));
        }
        return answer;
    }
}