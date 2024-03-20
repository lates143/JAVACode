package Inheritance;

public class Test_Ov {
	
	public void testmethod() {
		
		System.out.println("hello overrride");
		
	}

}

class test2 extends Test_Ov{
	
	@Override
	public void testmethod() {
		System.out.println("eat & sleep");
	}
	
	void sleep() {
		
		System.out.println("sleep");
	}
}
