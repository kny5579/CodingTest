import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            answer+=sum;
        }
        System.out.println(answer);
    }
}
