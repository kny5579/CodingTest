class Solution {
    boolean solution(String s) {
        int pNum = 0;
        int yNum = 0;
        for(String c:s.toLowerCase().split("")) {
            if(c.equals("p")) pNum++;
            if(c.equals("y")) yNum++;
        }
        

        return pNum!=yNum?false:true;
    }
}