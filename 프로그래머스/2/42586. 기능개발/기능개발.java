import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] != 0) {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            } else queue.add((100 - progresses[i]) / speeds[i]);
        }
        while (!queue.isEmpty()) {
            int num = 1;
            int q = queue.poll();

            while (!queue.isEmpty() && q >= queue.peek()) {
                queue.poll();
                num++;
            }
            list.add(num);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}


