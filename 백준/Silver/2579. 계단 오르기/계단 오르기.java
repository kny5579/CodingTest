import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N];
        int[] stair = new int[N];
        // dp[i] = i번째 계단 까지 올라갔을때의 합. dp[i] = Math.max(dp[i-2],dp[i-3]+stair[i-1])+stair[i]
        for (int i = 0; i < N; i++) {
            stair[i]=sc.nextInt();
        }
        if (N == 1) {
            System.out.println(stair[0]);
        } else if (N == 2) {
            System.out.println(stair[0] + stair[1]);
        } else {
            dp[0] = stair[0];
            dp[1] = stair[0] + stair[1];
            dp[2] = Math.max(stair[0], stair[1]) + stair[2];
            for (int i = 3; i < N; i++) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
            }
            System.out.println(dp[N - 1]);
        }
    }
}