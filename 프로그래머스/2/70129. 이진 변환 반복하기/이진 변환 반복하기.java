class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String sCopy=s;
        int zeroNum = 0;
        int cnt = 0;
        while(true) {
            cnt++;
            for(String a:sCopy.split("")){
                if(a.equals("0")) zeroNum++;
            }
            sCopy=sCopy.replaceAll("0","");
            sCopy=Integer.toBinaryString(sCopy.length());
            if(sCopy.equals("1")) break;
        }
        answer[0]=cnt;
        answer[1]=zeroNum;
        return answer;
    }
}