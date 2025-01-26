import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i],i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            int idx = map.get(callings[i]);
            String temp = answer[idx-1];
            answer[idx]=temp;
            answer[idx-1]=callings[i];
            map.put(callings[i],idx-1);
            map.put(temp,idx);
        }
        return answer;
    }
}