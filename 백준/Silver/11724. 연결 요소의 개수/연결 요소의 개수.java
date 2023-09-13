import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        visited=new boolean[n+1];
        A=new ArrayList[n+1];

        for (int i = 1; i < n+1; i++) {
            A[i]=new ArrayList<>();
        }
        for (int i = 1; i < m+1; i++) {
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }
        int count=0;
        for (int i = 1; i < n+1; i++) {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    public static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v]=true;
        for(int i:A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}