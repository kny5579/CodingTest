class Solution {
        public String solution(String[] seoul) {
            String answer = "";
            int f=0;
            for (int i = 0; i < seoul.length; i++) {
                if(seoul[i].equals("Kim")){
                    f=i;
                    break;
                }
            }
            return "김서방은 "+f+"에 있다";
        }
    }