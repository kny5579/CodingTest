class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int answer = 0;
        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i]==0) zero++;
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i]==win_nums[j]) {
                    answer++;
                    break;
                }
            }
        }
        int[] price = {6,6,5,4,3,2,1};
        int[] arr = {price[answer+zero],price[answer]};
        return arr;
    }
    //맞은것만 세서 answer에 추가하고 그게 최소, 거기에 0 개수 추가하면 최대
}