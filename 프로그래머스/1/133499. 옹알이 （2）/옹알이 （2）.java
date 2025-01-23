import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String previous = "";
        String[] baby = {"aya","ye","woo","ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < baby.length; j++) {
                if(babbling[i].contains(baby[j]+baby[j])) break;
                else if(babbling[i].contains(baby[j])) {
                    babbling[i] = babbling[i].replace(baby[j]," ");
                }
                System.out.println(babbling[i]);
                if(babbling[i].isBlank()){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}