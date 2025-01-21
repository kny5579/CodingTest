class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int paint = section[0];
        for (int i = 1; i < section.length; i++) {
            if(section[i]>paint+m-1) {
                answer++;
                paint = section[i];
            }
        }
        return answer;
    }
}