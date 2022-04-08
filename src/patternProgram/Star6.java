package patternProgram;

public class Star6 {
//@@@@@@@
// @@@@@
//  @@@
//   @
	public static void main(String[] args) {
		int star=7;
		int space=0;
		for(int i=1;i<=4;i++) {
			for (int j=1;j<=space;j++) {
				System.out.print(" ");
			}
				for(int k=1;k<=star;k++) {
					System.out.print("@");
				}
				System.out.println();
				space++;
				star=star-2;
		}

	}

}
