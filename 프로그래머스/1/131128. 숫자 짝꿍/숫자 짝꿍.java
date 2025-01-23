import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String X, String Y) {
        int[] Xarr = new int[10];
        int[] Yarr = new int[10];
        StringBuilder sb = new StringBuilder();

        for (String num : X.split("")) {
            Xarr[Integer.parseInt(num)]++;
        }

        for (String num : Y.split("")) {
            Yarr[Integer.parseInt(num)]++;
        }
        for (int i = 9; i >= 0; i--) {
            while(Xarr[i]!=0 && Yarr[i]!=0){
                sb.append(i);
                Xarr[i]--;
                Yarr[i]--;
            }
        }
        if(sb.length()!=0&&sb.charAt(0)=='0') return "0";
        return sb.toString().isBlank() ? "-1" : sb.toString();
    }
}//9부터 0까지 포함하는지 찾고 둘다 포함하면 출력하고 break;