package Test_Code;

import java.util.Scanner;

public class ScannerFabonocci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number 1");
		int n1= sc.nextInt();
		System.out.println("Please enter number 2");
		int n2= sc.nextInt();
		System.out.println("Enter limit");
		int count= sc.nextInt();
		
		System.out.println(n1+ " " +n2);
		
		for(int i=0; i<count; i++) {
			
			int n3= n1+n2;
			
			System.out.println(" "+ n3);
			n1=n2;
			n2=n3;
			
			
		}
		
	}

}
