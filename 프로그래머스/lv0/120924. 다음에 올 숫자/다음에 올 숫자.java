class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean plus=true;
        plus=common[0]-common[1]==common[1]-common[2]?true:false;
        if(plus){
            answer = common[common.length - 1] + (common[1] - common[0]);
        }else{
            answer=common[common.length-1]*(common[1]/common[0]);
        }
        return answer;
    }
}