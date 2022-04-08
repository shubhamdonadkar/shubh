package arrayInterview;

public class SumEvenPositiveNumber {

	public static void main(String[] args) {
		// print sum of all even positive number from array
		int a[]= {1,2,3,4,5,6,9,8,7,-10,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if (a[i]%2==0 && a[i]>0) {
				sum=sum+a[i];
			}
		}System.out.println(sum);
		}
}
