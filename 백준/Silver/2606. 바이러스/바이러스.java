import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static StringBuilder sb;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        list = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        visited = new boolean[n+1];
        dfs(1);
        System.out.println(cnt-1);

    }
    public static void dfs(int start) {
        visited[start] = true;
        cnt++;
        for(int next: list[start]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
