import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(true) {
            if(n<0) {
                System.out.println("-1");
                break;
            }
            if(n%5!=0) {
                n-=2;
                sum++;
            }
            else {
                sum+=n/5;
                System.out.println(sum);
                break;
            }
        }
    }
}
