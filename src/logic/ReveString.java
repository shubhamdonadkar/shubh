package logic;



public class ReveString {

	public static void main(String[] args) {
		String D="dinesh";
		String rev="";
	
		for(int i=0;i<D.length();i++) {
			rev=D.charAt(i)+rev;
		
		}	
		System.out.println(rev);

	}

}
