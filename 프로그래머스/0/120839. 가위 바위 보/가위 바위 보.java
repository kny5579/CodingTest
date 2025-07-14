class Solution {
    public String solution(String rsp) {
        String answer="";
		//가위는 2 바위0 보5
		//2->0, 0->5, 5->2
		String[] rspSplit=rsp.split("");
		for(String r:rspSplit) {
			if(r.equals("2")) {
				answer+="0";
			}
			if(r.equals("0")) {
				answer+="5";
			}
			if(r.equals("5")) {
				answer+="2";
			}
		}
		return answer;
    }
}