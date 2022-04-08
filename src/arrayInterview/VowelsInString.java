package arrayInterview;

public class VowelsInString {

	public static void main(String[] args) {
	//finding vowels in string
		String s="velocity Katraj Pune";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u') {
				count=count+1;
				
			}
		}System.out.println(count);

	}

}
