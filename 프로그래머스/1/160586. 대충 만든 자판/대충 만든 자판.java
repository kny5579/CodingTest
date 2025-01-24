import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                String key = Character.toString(keymap[i].charAt(j));
                if(map.get(key)==null||map.get(key)>j+1) map.put(key,j+1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for(String k : targets[i].split("")){
                if(map.get(k)==null) {
                    answer[i]=-1;
                    break;
                }
                else {
                    answer[i]+=map.get(k);
                }
            }
        }

        return answer;
    }
}