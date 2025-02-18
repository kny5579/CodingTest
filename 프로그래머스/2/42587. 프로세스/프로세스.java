import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int count=0;
        int index=location;
        Queue queue=new LinkedList();
        ArrayList<Integer> list=new ArrayList();
        for(int i:priorities){
            queue.add(i);
            list.add(i);
        }
        int result=priorities[location];
        while(queue.size()!=0){
            int max=Collections.max(list);
            int a=(int)queue.poll();
            if(a!=max){
                queue.add(a);
                index--;
                if(index<0){
                    index=queue.size()-1;
                }
            }else if(a==max){
                list.remove(list.indexOf(a));
                count++;
                if(index==0){
                    break;
                }
                index--;
                if(index<0){
                    index=queue.size()-1;
                }

            }
        }

        return count;
    }
}