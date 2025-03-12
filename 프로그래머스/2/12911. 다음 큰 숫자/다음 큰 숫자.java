class Solution {
  public int solution(int n) {
    int answer = 0;
    int len=Integer.toBinaryString(n).replace("0","").length();
    for (int i = n+1; i <1000000; i++) {
      if(Integer.toBinaryString(i).replace("0","").length()==len){
        return i;
      }
    }
    return answer;
  }
}