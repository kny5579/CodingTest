import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        list = new ArrayList[n+1];

        //dfs는 재귀, bfs는 큐
        for (int i = 0; i <= n ; i++) {
            list[i]=new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(list[i]);
        }

        visited = new boolean[n+1];
        dfs(v);
        sb.append("\n");

        visited = new boolean[n+1];
        bfs(v);

        System.out.println(sb.toString());
    }
    public static void dfs(int v) {
        visited[v] = true;
        sb.append(v+" ");
        for (int next : list[v]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
    public static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visited[v]=true;
        while(!q.isEmpty()) {
            int a = q.poll();
            sb.append(a).append(" ");
            for(int next : list[a]) {
                if(!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
