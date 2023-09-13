class Solution {
  boolean solution(String s) {
    int pNum=0;
    int yNum=0;
    
    for(char c:s.toCharArray()){
      if(c=='p'||c=='P'){
        pNum++;
      }else if(c=='y'||c=='Y'){
        yNum++;
      }
    }
    
    return pNum==yNum?true:false;
  }
}