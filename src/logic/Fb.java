package logic;

public class Fb {

	public static void main(String[] args) {
      int a=0;
      int b=1;
      int c;
      System.out.println(a);
      for(int i=1;i<=12;i++) {
    	  c=a+b;
    	  System.out.println(c);
    	  a=b;
    	  b=c;
      }
	}

}
