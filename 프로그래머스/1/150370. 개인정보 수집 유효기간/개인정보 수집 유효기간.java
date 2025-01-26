import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        List<Integer> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String term:terms) {
            String[] arr=term.split(" ");
            map.put(arr[0],Integer.parseInt(arr[1]));
        }
        for(int i = 0;i< privacies.length;i++){
            String[] arr = privacies[i].split(" ");
            int[] date = Arrays.stream(arr[0].split("\\.")).mapToInt(Integer::parseInt).toArray();
            date[1]+=map.get(arr[1]);
            if(answer[0]*12*28+answer[1]*28+answer[2]<=date[0]*12*28+date[1]*28+date[2]-1) {
                continue;
            }
            System.out.println(date[0]+"."+date[1]+"."+date[2]);
            list.add(i+1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}