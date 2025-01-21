class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number ; i++) {
            int sum = 0;
            for (int j = 1; j <= (int)Math.sqrt(i); j++) {
                if(i%j==0) sum+=2;
                if(j*j==i) sum--;
            }
            if(sum>limit) sum = power;
            answer+=sum;
        }

        return answer;
    }
}