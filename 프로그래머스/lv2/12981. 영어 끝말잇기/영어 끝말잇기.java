import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashMap<String,Integer> map=new HashMap<>();
        map.put(words[0],1);
        for (int i = 1; i < words.length; i++) {
            if(words[i-1].endsWith((words[i].substring(0,1)))&&!map.containsKey(words[i])){
                map.put(words[i],1);
            }else{
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }

        }

        return answer;
    }
}