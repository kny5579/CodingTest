import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answerArr = new String[strings.length];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answerArr[i] = list.get(i).substring(1, list.get(i).length());
        }
        return answerArr;
    }
}