package arrayInterview;

public class AddPositiveNumberInArray {

	public static void main(String[] args) {
		//return sum of positive number from given array
	int a[]= {10,20,-20,-5,-6,2,4};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>0) {
			sum=sum+a[i];
		}
	}	
	System.out.println(sum);
	

	}

}
