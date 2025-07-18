class Solution {
    public String solution(int[] numLog) {
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < numLog.length-1; i++) {
            if(numLog[i+1]-numLog[i]==1){
                sb.append("w");
            }else if(numLog[i+1]-numLog[i]==-1){
                sb.append("s");
            }else if(numLog[i+1]-numLog[i]==10){
                sb.append("d");
            }else{
                sb.append("a");
            }
        }
        return sb.toString();
    }
}
