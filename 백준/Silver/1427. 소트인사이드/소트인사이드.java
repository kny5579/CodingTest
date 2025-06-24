import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] arr = n.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (String s : arr) {
            System.out.print(s);
        }
    }
}
