import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int tmp=1;
        int size=0;
        HashMap<String,Integer> map=new HashMap<>();
        //종류에 따른 옷 개수 세기
        for(int i=0;i<clothes.length;i++){
            if(map.get(clothes[i][1])==null){
                map.put(clothes[i][1],1);
                size++;
            }else{
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            }
        }
        String[] name=new String[size];
        int a=0;
        for(String key:map.keySet()){
            name[a]=key;
            a++;
        }

        for (int i = 0; i < map.size(); i++) {
            tmp*=map.get(name[i])+1;
        }
        return tmp-1;

    }
}