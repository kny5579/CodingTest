class Solution {
  public String solution(String s) {
    String answer = "";
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    String[] num=s.split(" ");
    
    for(String a:num){
      if(Integer.parseInt(a)>max){
        max=Integer.parseInt(a);
      }
      if(Integer.parseInt(a)<min){
        min=Integer.parseInt(a);
      }
    }
    
    return min+" "+max;
  }
}