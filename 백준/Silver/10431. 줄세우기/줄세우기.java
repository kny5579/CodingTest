import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int[] arr = new int[20];
            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 1; j < 20; j++) {
                for (int k = j - 1; k >= 0; k--) {
                    if (arr[j] < arr[k]) count++;
                }
            }
            sb.append(i + 1 + " " + count + "\n");
        }
        System.out.println(sb);
    }
}
