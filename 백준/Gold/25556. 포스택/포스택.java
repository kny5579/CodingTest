import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String n=sc.nextLine();
        int[] data=Stream.of(n.split(" ")).mapToInt(Integer::parseInt).toArray(); //입력받은 수 배열로 만들기
        Stack<Integer>[] stack=new Stack[4];
        for(int i=0;i<4;i++) {
        	stack[i]=new Stack<>();
        	stack[i].push(0);
        }
        boolean sorted=true;
        for(int i=0;i<N;i++) { //배열의 숫자 모두 탐색
        	boolean check=false;
        	for(int j=0;j<4;j++) { //stack 모두 탐색
        		if(data[i]>stack[j].peek()) {
        			stack[j].push(data[i]);
        			check=true;
        			break; //stack에 넣었으니까 i를 증가시켜서 다음 숫자 탐색해야 함.
        		}
        	}
        	if(!check) {
        		sorted=false;
        		break;
        	}
        	
        }
        System.out.println(sorted?"YES":"NO");
        
    } 
}
