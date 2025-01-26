class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int second = Integer.MAX_VALUE;
        int fourth = Integer.MIN_VALUE;
        boolean first = false;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0;j<wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j)=='#') {
                    if(!first){
                        answer[0]=i;
                        first=true;
                    }
                    answer[2]=i+1;
                    if(second>j){
                        second=j;
                        answer[1]=second;
                    }
                    if(fourth<j) {
                        fourth = j;
                        answer[3]=fourth+1;
                    }
                }
            }

        }
        return answer;
    }
}