import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] dp = new int[41][2];
        dp[0][0]=1;
        dp[0][1]=0;
        dp[1][0]=0;
        dp[1][1]=1;
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();

            for (int j = 2; j < n+1; j++) {
                dp[j][0]=dp[j-1][0]+dp[j-2][0];
                dp[j][1]=dp[j-1][1]+dp[j-2][1];
            }
            System.out.println(dp[n][0]+" "+dp[n][1]);
        }
    }
}