package logic;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d="dinesh";
		String r="";
		char c;
		for(int i=0;i<=d.length()-1;i++) {
			c=d.charAt(i);
			r=c+r;}
			System.out.println(r);
		int num=12354;
		int rev=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=(num/10);
			
		}
System.out.println(rev);
	}

}
