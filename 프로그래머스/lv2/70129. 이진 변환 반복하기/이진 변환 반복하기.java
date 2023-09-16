class Solution {
  public int[] solution(String s) {
    int[] answer = new int[2];
    int zeroNum=0;
    int cnt=0;
    while(!s.equals("1")){
      cnt++;
      for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i)=='0'){
          zeroNum++;
        }
      }
      s=s.replace("0","");
      int c=s.length();
      s=Integer.toBinaryString(c);
    }
    answer[0]=cnt;
    answer[1]=zeroNum;
    return answer;
  }
}