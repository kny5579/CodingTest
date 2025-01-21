import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int[] correct = {0,0,0};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i]==arr1[i%5]) {
                correct[0]++;
            }
            if(answers[i]==arr2[i%8]) {
                correct[1]++;
            }
            if(answers[i]==arr3[i%10]) {
                correct[2]++;
            }
        }
        int max = Arrays.stream(correct).max().getAsInt();
        for (int i = 0; i < 3; i++) {
            if(correct[i]==max) list.add(i+1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}