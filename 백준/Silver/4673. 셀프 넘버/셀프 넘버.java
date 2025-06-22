import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] isTrue = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            String n = Integer.toString(i);
            int sum = i;
            for(String a : n.split("")) {
                sum+=Integer.parseInt(a);
            }
            if(sum<=10000) {
                isTrue[sum]=true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if(!isTrue[i]) {
                System.out.println(i);
            }
        }
    }
}