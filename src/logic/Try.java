package logic;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=10;
		int d=0;
		try {
			int a=s/d;
			System.out.println(a);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch the exception--->"+e.getMessage());
		}
			
	

	}

}
