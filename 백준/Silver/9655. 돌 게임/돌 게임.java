import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] dp = new boolean[n + 1];

        dp[1] = true; // SK
        if (n >= 2) dp[2] = false; // CY
        if (n >= 3) dp[3] = true; // SK

        for (int i = 4; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3];
        }

        System.out.println(dp[n] ? "SK" : "CY");
    }
}