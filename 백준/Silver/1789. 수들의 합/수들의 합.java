import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum+=i;
            if(sum>n) {
                System.out.println(i - 1);
                break;
            }
            else if(sum==n){
                System.out.println(i);
                break;
            }
        }
    }
}
