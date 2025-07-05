class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] a=Integer.toString(num).split("");
        for(int i=0;i<a.length;i++){
            if(a[i].equals(Integer.toString(k))){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}