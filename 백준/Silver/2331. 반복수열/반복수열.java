import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int current = A;
        int cnt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(true) {
            if(map.containsKey(current)) {
                System.out.println(map.get(current));
                break;
            }
            map.put(current,cnt);
            cnt++;
            current = sum(current, P);
        }
    }
    static int sum(int current, int p) {
        int ans = 0;
        while(current>0) {
            int a = current % 10;
            ans += Math.pow(a, p);
            current/=10;
        }
        return ans;
    }
}
