package logic;

public class HL {

	public static void main(String[] args) {
		int a=16;
		int b=20;
		int hcf=0;
		int lcm=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0&&b%i==0) {
				hcf=i;
			}
		}lcm=(a*b)/hcf;
		System.out.println(hcf);
		System.out.println(lcm);
	}

}
