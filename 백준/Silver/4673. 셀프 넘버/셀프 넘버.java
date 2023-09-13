public class Main{
	
	public static void main(String[] args) {
		boolean Array[]=new boolean[10001];
		
		for(int i=1;i<Array.length;i++) {
			int dn=getDn(i);
			if(dn<=10000)
				Array[dn]=true;
		}
		for(int i=1;i<Array.length;i++) {
			if(!Array[i]) {
				System.out.println(i);
			}
		}
		
	}
	

	public static int getDn(int n) {
		int dn=n;
		while(n>0) {
			dn=dn+(n%10);
			n=n/10;
		}
		return dn;
	}
}