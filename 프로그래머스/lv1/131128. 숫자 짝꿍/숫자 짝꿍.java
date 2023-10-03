import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        int[] x=new int[10];
        int[] y=new int[10];
        
        for(String xs:X.split("")) x[Integer.parseInt(xs)]++;
        for(String ys:Y.split("")) y[Integer.parseInt(ys)]++;

        for(int i=9;i>=0;i--) {
        	while(x[i]>0&&y[i]>0) {
        		sb.append(i);
        		x[i]--;
        		y[i]--;
        	}
        }
        
        if ("".equals(sb.toString())) {
            answer = "-1";
        } else if ("0".equals(sb.toString().substring(0,1))) {
            answer = "0";
        } else {
            answer = sb.toString();
        }
        
        return answer;
    }
}
/*import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for (String tmpX : X.split("")) cntX[Integer.parseInt(tmpX)]++;
        for (String tmpY : Y.split("")) cntY[Integer.parseInt(tmpY)]++;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i >= 0; i--){
            while(cntX[i] > 0 && cntY[i] > 0){
                sb.append(i);
                cntX[i]--;
                cntY[i]--;
            }
        }
        
        String answer = "";
        
        if ("".equals(sb.toString())) {
            answer = "-1";
        } else if ("0".equals(sb.toString().substring(0,1))) {
            answer = "0";
        } else {
            answer = sb.toString();
        }

        return answer;
    }
}*/