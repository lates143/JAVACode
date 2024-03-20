package Arrays;

public class MaxNumberFind {

	public static void main(String[] args) {
		
		int [] a= {1,5,7,3,6,1,0};
		
		int max= a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]>max) {
				
				max = a[i] ;
			}
			
		}
		System.out.println(max);

	}

}
