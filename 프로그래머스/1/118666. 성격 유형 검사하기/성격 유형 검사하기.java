import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "RCJA";
        int[] choice = {3,2,1,0,1,2,3};
        HashMap<String,Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);
        for (int i = 0; i < survey.length; i++) {
            if(choices[i]>=5) {
                map.put(String.valueOf(survey[i].charAt(1)),map.get(String.valueOf(survey[i].charAt(1)))+choice[choices[i]-1]);
            } else {
                map.put(String.valueOf(survey[i].charAt(0)),map.get(String.valueOf(survey[i].charAt(0)))+choice[choices[i]-1]);
            }
        }
        if(map.get("R")<map.get("T")) answer=answer.replace("R","T");
        if(map.get("C")<map.get("F")) answer=answer.replace("C","F");
        if(map.get("J")<map.get("M")) answer=answer.replace("J","M");
        if(map.get("A")<map.get("N")) answer=answer.replace("A","N");
        return answer;
    }
}