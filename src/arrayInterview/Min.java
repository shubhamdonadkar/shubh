package arrayInterview;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]a= {2,3,4,6,8,9};
   
     int min=a[4];
     for(int i=0;i<a.length;i++) {
    	 if(a[i]<min) {
    		 min=a[i];
    		  }
    	  }
    System.out.println( min);
     
     
 
	}
}
