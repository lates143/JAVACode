package Test_Code;

public class Name_Split {

	public static void main(String[] args) {

		String name= "my name is mangesh";
		String last= "";
		//int count = 0;
		
		for(int i=name.length()-1; i>=0; i--) {
			
			char ch = name.charAt(i);
			
			if(ch!=' ') {
				last = ch+last;
			}
			else
			{
				System.out.println(last);
				break;
			}
			
		}

	}

}
