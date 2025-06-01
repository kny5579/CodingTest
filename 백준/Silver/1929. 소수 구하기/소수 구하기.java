import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
             if (i!=1&&isprime(i)) System.out.println(i);
        }
    }

    private static boolean isprime(int i) {
        for (int j = 2; j <= (int)Math.sqrt(i); j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
