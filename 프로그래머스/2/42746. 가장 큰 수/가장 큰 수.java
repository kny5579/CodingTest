import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] numbersStr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(numbersStr,(o1,o2)->(o2+o1).compareTo(o1+o2));
        if(numbersStr[0].equals("0")) return "0";

        StringBuffer sb = new StringBuffer();
        for(String a:numbersStr) {
            sb.append(a);
        }
        return sb.toString();
    }
}