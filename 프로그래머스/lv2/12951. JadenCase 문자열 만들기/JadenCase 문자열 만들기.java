import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
  public String solution(String s) {
    String[] sArr=s.toLowerCase().split("");
    sArr[0]=sArr[0].toUpperCase();
    for (int i = 1; i < sArr.length; i++) {
      if(sArr[i-1].equals(" ")){
        sArr[i]=sArr[i].toUpperCase();
      }
    }
    return Arrays.stream(sArr).collect(Collectors.joining());
  }
}