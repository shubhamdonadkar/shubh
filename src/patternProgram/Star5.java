package patternProgram;

public class Star5 {
//   @  
//  @@@
// @@@@@
//@@@@@@@
//  
 
	public static void main(String[] args) {
		int space1=3;
		int star=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space1;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=star;k++) {
				System.out.print("@");
			}
			System.out.println();
			space1--;
			star=star+2;
		}
		

	}

}
