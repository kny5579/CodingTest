class Solution {
    int maxCount = 0; //방문횟수 = result

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k,dungeons,visited,0);
        return maxCount;
    }
    private int dfs(int tired, int[][] dungeons,boolean[] visited,int count) {
        maxCount = Math.max(maxCount, count);
        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i]&&tired>=dungeons[i][0]) {
                visited[i]=true;
                dfs(tired-dungeons[i][1],dungeons,visited,count+1);
                visited[i]=false;
            }
        }
        return maxCount;
    }
}
