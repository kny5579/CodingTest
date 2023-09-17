import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (sum < k) {
                sum += list.get(i);
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}