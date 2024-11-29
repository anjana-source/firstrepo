package exceptionss;

public class Examples2 {

	public static void main(String[] args) {
		System.out.println("Starting of the prgram");
		try
		{
			int a=28/0;
			System.out.println("a"+a);
		
		}
		catch(Exception var) //give  ArithmeticException
		{
			  int b=5;
		int a=28/b;
		System.out.println("a: "+a);
			System.out.println(var);
		}
		finally
		{
		
		System.out.println("end of the prgram");
		}
		
	}


}
