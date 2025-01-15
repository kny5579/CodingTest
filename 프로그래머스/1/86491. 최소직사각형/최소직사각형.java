import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            int W = Math.max(sizes[i][0],sizes[i][1]);
            int Y = Math.min(sizes[i][0],sizes[i][1]);
            maxW = Math.max(maxW,W);
            maxY = Math.max(maxY,Y);
        }
        return maxW*maxY;
    }
}