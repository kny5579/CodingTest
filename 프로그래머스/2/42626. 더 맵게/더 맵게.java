import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        while(true) {
            if(pq.peek()>=K) break;
            if(pq.isEmpty()||pq.size()==1) return -1;
            int a = pq.poll()+(pq.poll()*2);
            pq.add(a);
            answer++;
        }
        return answer;
    }
}