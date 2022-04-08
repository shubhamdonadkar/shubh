package logic;

public class Even {

	public static void main(String[] args) {
		int a=25;
		if(a%2==0) {System.out.println("the number is even ");

	}else {System.out.println("the number is  odd ");}
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("the given number is even "+i);
				
			}else {System.out.println("the given number is odd "+i);}
		}

}
}