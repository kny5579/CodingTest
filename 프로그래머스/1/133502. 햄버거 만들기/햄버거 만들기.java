import java.util.ArrayList;

class Solution {
    public int solution(int[] ingredient) {
        String s = "";
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ingredient.length; i++) {
            list.add(ingredient[i]);
            if(list.size()>=4) {
                int n = list.size();
                if(list.get(n-1)==1 && list.get(n-2)==3 && list.get(n-3)==2 && list.get(n-4)==1) {
                    list.remove(n-1);
                    list.remove(n-2);
                    list.remove(n-3);
                    list.remove(n-4);
                    answer++;
                }
            }
        }
        return answer;
    }
}