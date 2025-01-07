import java.util.ArrayList;
import java.util.Collections;
class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            if(arr.length==1) list.add(-1);
            else {
                for (int i = 0; i < arr.length; i++) {
                    list.add(arr[i]);
                }
                list.remove(Collections.min(list));
            }
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }