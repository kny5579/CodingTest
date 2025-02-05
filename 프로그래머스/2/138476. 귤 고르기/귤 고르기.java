import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0)+1);
        }
        int sum = 0;
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
            if(sum>=k) return i+1;
        }
        return answer;
    }
}