import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드 개수 입력

        // 트리 구조 표현을 위한 그래프 구현
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            tree.add(new ArrayList<>());
        }

        //트리 구조 표현
        for (int i = 1; i < n; i++) {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            tree.get(n1).add(n2);
            tree.get(n2).add(n1);
        }

        //bfs 탐색
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        int[] parent=new int[n+1];
        visited[1]=true;
        q.add(1);
        while(!q.isEmpty()){
            int a=q.poll();
            for(int node:tree.get(a)){
                if(!visited[node]) {
                    visited[node] = true;
                    parent[node] = a;
                    q.add(node);
                }
            }
        }

        //출력
        for (int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }
}
