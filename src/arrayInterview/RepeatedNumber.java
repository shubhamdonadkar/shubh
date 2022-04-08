package arrayInterview;

public class RepeatedNumber {

	public static void main(String[] args) {
		// find the repeated number from array
		int a[]={1,2,6,3,5,6,5,1,};
		  
       for(int i=0;i<a.length;i++) {
    	int count=0;
    	   for(int j=i;j<a.length;j++) {
    		   if(a[i]==a[j]) {
    			  count=count+1;
    			 }
    		   } 
    	 if(count>1) {
       System.out.println("number "+a[i]+" is " +count+" times repeate");}
       } 
	}

}
