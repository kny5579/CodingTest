import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            arr[i] = s;
        }
        Arrays.sort(arr,(a,b)->{
            if(a.length()!=b.length()) {
                return a.length()-b.length();
            } else return a.compareTo(b);
        });
        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if(!arr[i].equals(arr[i-1])) {
                System.out.println(arr[i]);
            }
        }
    }
}