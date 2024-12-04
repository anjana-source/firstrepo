package exceptionss;

public class ThrowClass {

	public static void main(String[] args) {
	int age=10;
	if(age>18)
	
		System.out.println("eligible for voting");
		else
			throw new ArithmeticException("Entet the value greater than 18");
		//	System.out.println("not eligible for voting");
			

	}

}
