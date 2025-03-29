class Solution {
    public String solution(int[] food) {
        String answer = "";
	        for(int i=1;i<food.length;i++){
	        	if(food[i]!=1) {
	        		for(int k=0;k<food[i]/2;k++) {
	        			answer+=Integer.toString(i);
	        		}
	        	}
	        }
	        answer+="0";
            //reverse
	        for(int i=answer.length()-2;i>=0;i--) {
	        	answer+=answer.charAt(i);
	        }
        return answer;
    }
}