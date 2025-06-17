import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MOD = 1_000_000_009;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] dp = new int[1_000_001];
        dp[0] = 1;
        for (int i = 1; i <= 1_000_000; i++) {
            if (i >= 1) dp[i] = (dp[i] + dp[i - 1]) % MOD;
            if (i >= 2) dp[i] = (dp[i] + dp[i - 2]) % MOD;
            if (i >= 3) dp[i] = (dp[i] + dp[i - 3]) % MOD;
        }

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
