package arrayInterview;

public class Max {

	public static void main(String[] args) {
		int[]a= {2,5,16,8,9,7};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);

	}

}
