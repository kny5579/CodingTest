import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int first = 0;
        int init = 1;
        int answer=1;

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
                    if (a[1] == b[1]) {
                        return a[0] - b[0];
                    } else return a[1] - b[1];
                }
        );

        while(init<n) {
            if(arr[init][0]>=arr[first][1]) {
                answer++;
                first = init;
            }
            init++;
        }
        System.out.println(answer);
    }
}
