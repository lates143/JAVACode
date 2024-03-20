package Inheritance;

public class Overriding_Test {

	public static void main(String[] args) {
		
		Test_Ov t= new Test_Ov();
		
		t.testmethod();
		
		test2 t2= new test2();
		t2.sleep();
		t2.testmethod();

	}

}
