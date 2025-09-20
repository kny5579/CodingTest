import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        HashMap<Integer, HashMap<String, Integer>> map = new HashMap<>();
        for (int n : course) {
            HashMap<String, Integer> countMap = new HashMap<>();
            for (String order : orders) {
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                LinkedList<String> comb = combination(new String(arr), n);
                for (String elem : comb)
                    countMap.put(elem, countMap.getOrDefault(elem, 0)+1);
            }
            map.put(n, countMap);
        }

        TreeSet<String> answerSet = new TreeSet<>();
        for (int n : course) {
            HashMap<String, Integer> countMap = map.get(n);
            LinkedList<String> list = new LinkedList<>();
            int max = 2;
            for (String elem : countMap.keySet()) {
                int count = countMap.get(elem);
                if (max < count) {
                    list.clear();
                    list.add(elem);
                    max = count;
                } else if (count == max)
                    list.add(elem);
            }
            answerSet.addAll(list);
        }
        int n = answerSet.size();
        String[] answer = new String[n];
        int i = 0;
        while (i < n)
            answer[i++] = answerSet.pollFirst();
        return answer;
    }

    LinkedList<String> combination(String source, int n) {
        LinkedList<String> output = new LinkedList<>();
        int len = source.length();
        if (len < n)
            return output;

        if (n == 1) {
            for (int i = 0; i < len; i++)
                output.add(source.substring(i, i+1));
        } else {
            for (int i = 0; i < len-n+1; i++) {
                char head = source.charAt(i);
                LinkedList<String> subList = combination(source.substring(i+1), n-1);
                for (String subStr : subList)
                    output.add(head + subStr);
            }
        }
        return output;
    }
}
