class Solution {
        public long solution(int a, int b) {
            long answer = 0;
            int small=a;
            int large=b;
            if(b<a){
                small=b;
                large=a;
            }
            for (int i = small; i <= large; i++) {
                answer+=i;
            }
            return answer;
        }
    }