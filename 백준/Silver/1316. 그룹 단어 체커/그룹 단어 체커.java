

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < time; i++) {
            String word = sc.next();
            if(isGroup(word)) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static boolean isGroup(String word) {
        // 이전 문자와 다르고+이전에 나왔던 문자면 false, 이전 문자와 다르면 배열에 체크, 모두 해당안되면 이전문자와 같은 거
        // String을 char별로 나눠야 하고 비교가 필요하면 boolean[] alpha = new boolean[26];을 고려할 것. + alpha[currentChar-'a']

        char prev = 0;
        boolean[] alpha = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            if(current!=prev) {
                if(alpha[current-'a']) {
                    return false;
                }
                alpha[current-'a']=true;
            }
            prev = current;
        }
        return true;
    }
}