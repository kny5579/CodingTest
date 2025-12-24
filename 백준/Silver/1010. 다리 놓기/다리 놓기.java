import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[31][31];
        for (int i = 0; i < 31; i++) {
            dp[i][i] = 1;
            dp[0][i] = 1;
        }
        // dp[n][m] = dp[n-1][m-1]+dp[n][m-1];
        for (int i = 1; i < 31; i++) {
            for (int j = i+1; j < 31; j++) {
                dp[i][j] = dp[i-1][j-1]+dp[i][j-1];
            }
        }
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(dp[n][m]).append("\n");
        }
        System.out.println(sb);
    }
}
