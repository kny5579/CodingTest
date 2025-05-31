import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        String[] arr = ex.split("-");
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            String[] num = arr[i].split("\\+");
            for(String n:num) temp += Integer.parseInt(n);
            if(i == 0) answer+=temp;
            else answer-=temp;
        }
        System.out.println(answer);
    }
}
