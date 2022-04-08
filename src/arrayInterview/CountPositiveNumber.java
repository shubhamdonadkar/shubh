package arrayInterview;

public class CountPositiveNumber {

	public static void main(String[] args) {
		// return count of positive number from given array
		int[]a= {12,0,-2,-3,4,5,6,8,5};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=0) {
				count=count+1;
			}
		}System.out.println(count);

	}

}
