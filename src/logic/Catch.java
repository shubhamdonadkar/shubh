package logic;

public class Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try made exception midala tr catch execute hoil try nhi honar but finally 2nhi condition mde execute honar
		try {
		//	int a=14/0 ;
			System.out.println("open database");
			System.out.println("read database");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sanket bhau bhok me baki sab ");
		}
		finally {
			System.out.println("close database");
		}
		

	}

}
