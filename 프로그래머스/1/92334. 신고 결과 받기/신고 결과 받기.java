import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> map = new HashMap<>(); //신고당한 사람, 신고자
        HashMap<String, Integer> answerMap = new HashMap<>(); // 신고한 사람, 메일 받는 횟수
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> set = new HashSet<>();
            map.put(id_list[i], set);
            answerMap.put(id_list[i], 0);
        }
        for (int i = 0; i < report.length; i++) {
            String[] arr = report[i].split(" ");
            map.get(arr[1]).add(arr[0]);
        }
        for (String key : map.keySet()) {
            HashSet<String> set = map.get(key);
            if(set.size()>=k) {
                for(String user : set) {
                    answerMap.put(user,answerMap.get(user)+1);
                }
            }
        }
        for (int i = 0; i < answerMap.size(); i++) {
            answer[i]=answerMap.get(id_list[i]);
        }

            return answer;
    }
}