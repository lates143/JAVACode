package Test_Code;

import java.util.Scanner;

public class ScannerNameend {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter name");
		 String name = sc.nextLine();
		 String last= "";
		 
		 for(int i= name.length()-1; i>=0; i--) {
			 char ch = name.charAt(i);
			 
			 if(ch!= ' ') {
				 last = ch+last;
				 
			 }
			 else {
				 System.out.println("Last name is "+last);
				 break;
			 }
			 
		 }

	}

}
