import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        LinkedList<Integer> reserveList = Arrays.stream(reserve)
                                    .boxed().collect(Collectors.toCollection(LinkedList::new));

        int answer = 0;

        for(int i = 0; i<lost.length; i++) {
            int index = i;
            if (reserveList.contains(lost[i])) {
                reserveList.removeIf(val -> val == lost[index]);
                lost[i] = -2;
                answer++;
            }
        }

        for(int i = 0; i<lost.length; i++) {
            int index = i;
            if(reserveList.contains(lost[i] - 1)) {
                reserveList.removeIf(val -> val == lost[index] - 1);
                answer++;
                continue;
            }
            if(reserveList.contains(lost[i] + 1)) {
                reserveList.removeIf(val -> val == lost[index] + 1);
                answer++;
            }
        }

        return n - lost.length + answer;
    }
}