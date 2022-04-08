package logic;

public class StringShift {

	public static void main(String[] args) {
	String s="I Love My India";
	String sep=" ";
	String[] s1=s.split(sep);

	//System.out.println(s);
    for(int i=3;i>=0;i--) {
    	System.out.println(s1[i]);
    }
    System.out.println("=================using split and concat======================");
    for(int i=0;i<=3;i++) {
    	System.out.println(s1[i]);
    }
  String rev = s1[3].concat(sep).concat(s1[2]).concat(sep).concat(s1[1]).concat(sep).concat(s1[0]);
    System.out.println(rev);
	}

}
