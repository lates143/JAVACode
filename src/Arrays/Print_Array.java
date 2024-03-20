package Arrays;

import java.util.Arrays;

public class Print_Array {

	public static void main(String[] args) {
	
		
		int [] ar= {1,3,4,5,6,7};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		for(int i=0; i< ar.length; i++) {
			System.out.println("element at index "+ i + ":" + ar[i]);
		}
		
		
	}

}
