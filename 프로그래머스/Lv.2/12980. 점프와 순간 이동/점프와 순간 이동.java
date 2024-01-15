import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int num = 0;
        while(n!=1) {
            if (n % 2 != 0) {
                ans++;
            }
            n /= 2;
        }

        return ans;
    }
}
// k칸 앞으로 '점프' or 현재까지 온 거리x2 '순간이동'
// 점프시 k 만큼의 건전지 사용량 소비 -> 최소로 사용해야함
//N 까지 가는 동안의 건전지 사용량 최솟값 return