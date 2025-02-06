import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int start = 1;
        while (start < elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = i; j < i + start; j++) {
                    sum += elements[j % elements.length];
                }
                set.add(sum);
            }
            start++;
        }
        return set.size() + 1;
    }
}