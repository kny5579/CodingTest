import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer> wantMap = new HashMap<>();


        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i],number[i]);
        }
        System.out.println("wantMap keys: " + wantMap.keySet());

        for (int i = 0; i < discount.length-9; i++) {
            boolean resultTrue = true;
            HashMap<String,Integer> discountMap = new HashMap<>();
            for (int j = i; j < i+10; j++) {
                discountMap.put(discount[j],discountMap.getOrDefault(discount[j],0)+1);
            }
            for(String a:wantMap.keySet()) {
                if(!discountMap.containsKey(a)||wantMap.get(a)>discountMap.get(a)) {
                    resultTrue = false;
                    break;
                }
            }
            if(resultTrue) answer++;
        }
        return answer;
    }
}