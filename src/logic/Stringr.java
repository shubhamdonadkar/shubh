package logic;

public class Stringr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="shubham";
String rev="";
char c;
for(int i=0;i<s.length();i++) {
	c=s.charAt(i);
	rev=c+rev;
	
}System.out.println(rev);
	}

}
