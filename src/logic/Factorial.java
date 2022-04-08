package logic;

public class Factorial {

	public static void main(String[] args) {
		int n=10;
		int f;
		int mul=1;
		for(int i=1;i<=n;i++) {
			f=i;
			mul=f*mul;
		}
System.out.println(mul);
	}

}
